package by.tc.task01.dao.impl;

import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ReadFileFindMatches {

    public List<String> lineWithParam(Criteria criteria, String filePath) {

    List<String> linesWithParameters = new ArrayList<>();
    String paramPlusValue = criteria.getCriteria().entrySet().toString().replace("[","")
                .replace("]", "");

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(filePath), StandardCharsets.UTF_8))){
            String line;
            while ((line = reader.readLine()) != null) {

                if(line.contains(criteria.getGroupSearchName()) && line.contains(paramPlusValue)){
                    linesWithParameters.add(line);
                }

            }
        } catch (IOException e) {
            //Дописать проброс исключений
            System.out.println("Error!");        }
        return linesWithParameters;
    }


        /*   for (String criteriaItem : criteria.getCriteria().keySet()) {
            System.out.println("1111111111111111");
            System.out.println(criteriaItem);
        }*/



}
