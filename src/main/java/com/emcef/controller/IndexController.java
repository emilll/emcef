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
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @ResponseBody
    public void export(HttpServletResponse response) throws JRException, FileNotFoundException, IOException {
        FactureSelonSpecification facture = factureService.findAllByUid("soOsis36-608b-WRtG-lXxX-Kh2QZV6U5pKd");
        createPdfReport(ligneDeFactureService.articles(facture), facture, response);
    }

    // Method to create the pdf file using the employee list datasource.
    private void createPdfReport(final List<LigneDeFacture> article, FactureSelonSpecification facture, HttpServletResponse response) throws JRException, FileNotFoundException, IOException {
        DateTime time = new DateTime();
        File file = ResourceUtils.getFile("classpath:facture.jrxml");
        JasperReport liste = JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(article);
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
        parameters.put("ttc", facture.getTotal());
        parameters.put("tva", facture.getTotal_tax());
        parameters.put("ht", facture.getTotal_taxable());
        parameters.put("qr", facture.getFactureNormalisee().getQrCode());
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
        String path = "Facture" + time.toYearMonthDay() + "-" + time.getHourOfDay() + "H" + time.getMinuteOfHour() + "M" + time.getSecondOfMinute() + ".pdf";
        JasperPrint impression = JasperFillManager.fillReport(liste, parameters, new JREmptyDataSource());
        response.setContentType("application/x-download");
        response.addHeader("Content-disposition", "attachment; filename="+path);
        OutputStream out = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(impression, out);
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

    @GetMapping("/")
    public String show() {
        return "/index";
    }
}
