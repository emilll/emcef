/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emcef.controller;

import com.emcef.model.Contribuable;
import com.emcef.service.ContribuableService;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Holy
 */
@Controller
public class IndexController {

    @Autowired
    ContribuableService contribuableService;
    
    @GetMapping("/facttoday")
    public String facturesToday(){
        return "/today/today";
    }
    
    @GetMapping("/machinessignales")
    public String MachSignToday(){
        return "/today/machinessignales";
    }
    
    @GetMapping("/machinesnonsignales")
    public String MachNonSignToday(){
        return "/today/machinesnonsignales";
    }
    
    @GetMapping("/journalaudit")
    public String AuditToday(){
        return "/today/audit";
    }
    
    @GetMapping("/donnees")
    public String DataToday(){
        return "/today/donnees";
    }
    
    @GetMapping("/daystate")
    public String StateToday(){
        return "/today/daystate";
    }
    
    @GetMapping("/daystats")
    public String StatsToday(){
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
