package by.tc.task01.dao.impl.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class FactoryVacuumCleaner implements Factory{
    public Appliance setApplianceValue(Map<String, String> paramValue) {
        double power_consumption;
        String filter_type;
        String bag_type;
        String wand_type;
        double motor_speed_regulation;
        double cleaning_width;

        power_consumption = Double.parseDouble(paramValue.get(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString()));
        filter_type = paramValue.get(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString());
        bag_type = paramValue.get(SearchCriteria.VacuumCleaner.BAG_TYPE.toString());
        wand_type = paramValue.get(SearchCriteria.VacuumCleaner.WAND_TYPE.toString());
        motor_speed_regulation = Double.parseDouble(paramValue.get(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString()));
        cleaning_width = Double.parseDouble(paramValue.get(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString()));

        VacuumCleaner newVacuumCleaner = new VacuumCleaner.VacuumCleanerBuilder().setPower_consumption(power_consumption)
                .setBag_type(bag_type).setFilter_type(filter_type).setWand_type(wand_type)
                .setMotor_speed_regulation(motor_speed_regulation).setCleaning_width(cleaning_width).build();

        return newVacuumCleaner;
    }
}
