package by.tc.task01.dao.impl.factory;

import by.tc.task01.entity.Appliance;

import java.util.Map;

public class FactoryAppliance implements Factory{

   public Appliance createAppliance(String applianceName, Map<String, String> paramValue){
      Appliance newAppliance = null;

      switch (applianceName) {
         case "Laptop":
            newAppliance = new FactoryLaptop().setApplianceValue(paramValue);
            break;
         case "Oven":
            newAppliance = new FactoryOven().setApplianceValue(paramValue);
            break;
         case "Refrigerator":
            newAppliance = new FactoryRefrigerator().setApplianceValue(paramValue);
            break;
         case "Speakers":
            newAppliance = new FactorySpeakers().setApplianceValue(paramValue);
            break;
         case "TabletPC":
            newAppliance = new FactoryTabletPC().setApplianceValue(paramValue);
            break;
         case "VacuumCleaner":
            newAppliance = new FactoryVacuumCleaner().setApplianceValue(paramValue);
            break;
         default:
            System.out.println("We dont have such appliance");
            break;
      };
      return newAppliance;
   }



}
