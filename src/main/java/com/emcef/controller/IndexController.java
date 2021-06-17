/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.controller;

import com.emcef.model.Contribuable;
import com.emcef.model.FactureSelonSpecification;
import com.emcef.model.LigneDeFacture;
import com.emcef.service.ContribuableService;
import com.emcef.service.FactureService;
import com.emcef.service.LigneDeFactureService;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.joda.time.DateTime;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Holy
 */
@Controller
public class IndexController {

    @Autowired
    ContribuableService contribuableService;

    @Autowired
    FactureService factureService;

    @Autowired
    LigneDeFactureService ligneDeFactureService;

    @GetMapping("/export")
    public String export() throws JRException, FileNotFoundException, IOException {
        FactureSelonSpecification facture = factureService.findAllByUid("LYpZzSLX-hC7h-Uyzh-TQxR-vfkDkuMaZAlz");
        createPdfReport(ligneDeFactureService.articles(facture), facture);
        return "redirect:/";
    }

    // Method to create the pdf file using the employee list datasource.
    private void createPdfReport(final List<LigneDeFacture> article, FactureSelonSpecification facture) throws JRException, FileNotFoundException, IOException {
        DateTime time = new DateTime();
        File file = ResourceUtils.getFile("classpath:facture.jrxml");
        JasperReport liste = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(article);
        JRBeanCollectionDataSource test = null;
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("name", facture.getNom_commercial());
        parameters.put("date", facture.getDateTime());
        parameters.put("numero", "00001");
        parameters.put("ifuseller", facture.getIfuseller());
        parameters.put("adressseller", facture.getAdresse1());
        parameters.put("contactseller", facture.getContact1());
        parameters.put("mailseller", facture.getContact2());
        parameters.put("nameclient", facture.getNom_client());
        parameters.put("ifuclient", facture.getIfu_client());
        parameters.put("adressclient", facture.getAdresse1_client());
        parameters.put("contactclient", facture.getContact1_client());
        parameters.put("ttc", "0");
        parameters.put("tva", "0");
        parameters.put("ht", "0");
        parameters.put("qr", facture.getFactureNormalisee().getQrCode() + "emmanuel");
        parameters.put("code", facture.getFactureNormalisee().getCodeMECeFDGI());
        parameters.put("finaldate", facture.getFactureNormalisee().getDateTime());
        parameters.put("remise", "0");
        parameters.put("ts", "0");
        parameters.put("aib", "0");
        parameters.put("total", "0");
        parameters.put("taxe", "18");
        parameters.put("shortht", "0");
        parameters.put("shorttva", "0");
        parameters.put("nim", facture.getNim());
        parameters.put("parts", ds);
        String path = "E:/Facture" + time.toYearMonthDay() + "-" + time.getHourOfDay() + "H" + time.getMinuteOfHour() + "M" + time.getSecondOfMinute() + ".pdf";
        JasperPrint impression = JasperFillManager.fillReport(liste, parameters, new JREmptyDataSource());
        File pdf = File.createTempFile("Facture" + time.toYearMonthDay() + "-" + time.getHourOfDay() + "H" + time.getMinuteOfHour() + "M" + time.getSecondOfMinute(), ".pdf");
        JasperExportManager.exportReportToPdfStream(impression, new FileOutputStream(pdf));
        JasperExportManager.exportReportToPdfFile(impression, path);
    }

    @RequestMapping("/login")
    public String loginError(@RequestParam(value = "error", defaultValue = "false") boolean test) {
        if (test) {
            return "/loginerror";
        } else {
            return "/login";
        }
    }

    @GetMapping("/process-logout")
    public String logout() {
        return "redirect:/";
    }

    @GetMapping("/donnees")
    public String DataToday() {
        return "/today/donnees";
    }

    @GetMapping("/daystate")
    public String StateToday() {
        return "/today/daystate";
    }

    @GetMapping("/daystats")
    public String StatsToday() {
        return "/today/daystats";
    }

    public void montantGlobal(String url, double[] tableau) {
        JSONParser parser = new JSONParser();

        try {
            URL oracle = new URL(url);
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                JSONArray a = (JSONArray) parser.parse(inputLine);
                JSONArray jsonArray = (JSONArray) a.get(0);
                tableau[0] = (double) jsonArray.get(1);
                tableau[1] = (double) jsonArray.get(2);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void montantMensuel(String url, double[] tableau) {
        JSONParser parser = new JSONParser();

        try {
            URL oracle = new URL(url);
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                JSONArray a = (JSONArray) parser.parse(inputLine);
                JSONArray jsonArray = (JSONArray) a.get(0);
                tableau[0] = (double) jsonArray.get(1);
                tableau[1] = (double) jsonArray.get(2);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void montantQuotidienne(String url, double[] tableau) {
        JSONParser parser = new JSONParser();

        try {
            URL oracle = new URL(url);
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                JSONArray a = (JSONArray) parser.parse(inputLine);
                JSONArray jsonArray = (JSONArray) a.get(0);
                tableau[0] = (double) jsonArray.get(1);
                tableau[1] = (double) jsonArray.get(2);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void fac_rapGlobal(String url, double[] tableau) {
        JSONParser parser = new JSONParser();

        try {
            URL oracle = new URL(url);
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                JSONArray a = (JSONArray) parser.parse(inputLine);
                JSONArray jsonArray = (JSONArray) a.get(0);
                tableau[0] = (double) jsonArray.get(1);
                tableau[1] = (double) jsonArray.get(2);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void fac_rapMonth(String url, double[] tableau) {
        JSONParser parser = new JSONParser();

        try {
            URL oracle = new URL(url);
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                JSONArray a = (JSONArray) parser.parse(inputLine);
                JSONArray jsonArray = (JSONArray) a.get(0);
                tableau[0] = (double) jsonArray.get(1);
                tableau[1] = (double) jsonArray.get(2);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void fac_rapDay(String url, double[] tableau) {
        JSONParser parser = new JSONParser();

        try {
            URL oracle = new URL(url);
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                JSONArray a = (JSONArray) parser.parse(inputLine);
                JSONArray jsonArray = (JSONArray) a.get(0);
                tableau[0] = (double) jsonArray.get(1);
                tableau[1] = (double) jsonArray.get(2);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/")
    public String show(Model model) {
        JSONObject obj = new JSONObject();
        Date d = new Date();
        int year = d.getYear();
        int month = d.getMonth();
        int day = d.getDay();
        double[] table = new double[5];
        /*montantGlobal("http://localhost:8080/api/totauxglobaux", table);
        obj.put("g3", table[1]);
        obj.put("g4", table[2]);
        montantMensuel("http://localhost:8080/api/totauxmonth/"+year+"/"+month, table);
        obj.put("m3", table[1]);
        obj.put("m4", table[2]);
        montantQuotidienne("http://localhost:8080/api/totauxday"+year+"/"+month+"/"+day, table);
        obj.put("d3", table[1]);
        obj.put("d4", table[2]);
        fac_rapGlobal("http://localhost:8080/api/totauxglobaux", table);
        obj.put("g1", table[1]);
        obj.put("g2", table[2]);
        fac_rapMonth("http://localhost:8080/api/totauxglobaux", table);
        obj.put("m1", table[1]);
        obj.put("m2", table[2]);
        fac_rapDay("http://localhost:8080/api/totauxglobaux", table);
        obj.put("d1", table[1]);
        obj.put("d2", table[2]);
        for (int i = 0; i < 3; i++) {
            System.out.println(table[i]);
        }*/

        Contribuable contribuable = new Contribuable();
        model.addAttribute("contribuable", contribuable);
        //model.addAttribute("afficher", contribuableService.getAllContribuable());
        return "/index";
    }
}
