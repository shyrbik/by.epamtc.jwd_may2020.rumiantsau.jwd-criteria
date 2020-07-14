package by.tc.task01.dao.impl.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class FactoryTabletPC implements Factory{
    public Appliance setApplianceValue(Map<String, String> paramValue) {
        double battery_capacity;
        double display_inches;
        double memory_rom;
        double flash_memory_capacity;
        String color;
        //инициализируем переменные класса через поиск по ХешМепе исходя из Енам класса
        battery_capacity = Double.parseDouble(paramValue.get(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString()));
        display_inches = Double.parseDouble(paramValue.get(SearchCriteria.TabletPC.DISPLAY_INCHES.toString()));
        memory_rom = Double.parseDouble(paramValue.get(SearchCriteria.TabletPC.MEMORY_ROM.toString()));
        flash_memory_capacity = Double.parseDouble(paramValue.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString()));
        color = paramValue.get(SearchCriteria.TabletPC.COLOR.toString());

        TabletPC newTabletPC = new TabletPC.TabletPCBuilder().setBattery_capacity(battery_capacity)
                .setDisplay_inches(display_inches).setMemory_rom(memory_rom)
                .setFlash_memory_capacity(flash_memory_capacity).setColor(color).build();

        return newTabletPC;
    }
}
