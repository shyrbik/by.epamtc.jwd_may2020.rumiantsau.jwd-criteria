package by.tc.task01.dao.impl.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class FactoryOven implements Factory {
    public Appliance setApplianceValue(Map<String, String> paramValue) {
        double power_consumption;
        double weight;
        double capacity;
        double depth;
        double height;
        double width;
        //инициализируем переменные класса через поиск по ХешМепе исходя из Енам класса
        power_consumption = Double.parseDouble(paramValue.get(SearchCriteria.Oven.POWER_CONSUMPTION.toString()));
        weight = Double.parseDouble(paramValue.get(SearchCriteria.Oven.WEIGHT.toString()));
        capacity = Double.parseDouble(paramValue.get(SearchCriteria.Oven.CAPACITY.toString()));
        depth = Double.parseDouble(paramValue.get(SearchCriteria.Oven.DEPTH.toString()));
        height = Double.parseDouble(paramValue.get(SearchCriteria.Oven.HEIGHT.toString()));
        width = Double.parseDouble(paramValue.get(SearchCriteria.Oven.WIDTH.toString()));

         Oven newOven = new Oven.OvenBuilder().setPower_consumption(power_consumption).setWeight(weight).
                 setCapacity(capacity).setDepth(depth).setHeight(height).setWidth(width).build();

         return newOven;
    }

}
