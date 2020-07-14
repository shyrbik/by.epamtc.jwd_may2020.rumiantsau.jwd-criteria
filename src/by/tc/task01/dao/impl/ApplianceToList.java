package by.tc.task01.dao.impl;

import by.tc.task01.dao.impl.factory.FactoryAppliance;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplianceToList {

    List<Appliance> addApplianceToList(List<String> linesWithParameters, Criteria criteria){
        List<Appliance> resultListWithAppliance = new ArrayList<>();

        for (String lineOfParametr : linesWithParameters) {
            String[] pairsCharacterValue = null;
            //получаем массив строк характеристика = значение
            pairsCharacterValue = lineOfParametr.replace(";", "")
                    .split(" : ")[1].split(", ");
            Map<String, String> paramValue = new HashMap();
            //Заносим в хешмепу paramValue значения: КЛЮЧ - название характиристики, ВЭЛЬЮ - значение характеристики
            for (String pairCharacterValue : pairsCharacterValue) {
                paramValue.put(pairCharacterValue.split("=")[0], pairCharacterValue.split("=")[1]);
            }

            //передаем сформированную хешмапу параметр=значения в фабрику для создания устройства и
            // добавляем новое устройства в наш лист

            FactoryAppliance newAppliance = new FactoryAppliance();
            resultListWithAppliance.add(newAppliance.createAppliance(criteria.getGroupSearchName(), paramValue));

        }

        return resultListWithAppliance;
    }


}
