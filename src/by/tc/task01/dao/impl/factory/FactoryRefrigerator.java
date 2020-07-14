package by.tc.task01.dao.impl.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class FactoryRefrigerator implements Factory {

    public Appliance setApplianceValue(Map<String, String> paramValue) {
        double power_consumption;
        double weight;
        double freezer_capacity;
        double overall_capacity;
        double height;
        double width;

        //инициализируем переменные класса через поиск по ХешМепе исходя из Енам класса
        power_consumption = Double.parseDouble(paramValue.get(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString()));
        weight = Double.parseDouble(paramValue.get(SearchCriteria.Refrigerator.WEIGHT.toString()));
        freezer_capacity = Double.parseDouble(paramValue.get(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString()));
        overall_capacity = Double.parseDouble(paramValue.get(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString()));
        height = Double.parseDouble(paramValue.get(SearchCriteria.Refrigerator.HEIGHT.toString()));
        width = Double.parseDouble(paramValue.get(SearchCriteria.Refrigerator.WIDTH.toString()));

        Refrigerator newRefrigerator = new Refrigerator.RefrigeratorBuilder().setPower_consumption(power_consumption).
                setWeight(weight).setFreezer_capacity(freezer_capacity).setOverall_capacity(overall_capacity).
                setHeight(height).setWidth(width).build();

        return newRefrigerator;


    }


}
