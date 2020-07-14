package by.tc.task01.dao.impl.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.Map;

public class FactoryLaptop implements Factory{
    public Appliance setApplianceValue(Map<String, String> paramValue){
        double battery_capacity;
        String os;
        double memory_rom;
        double system_memory;
        double cpu;
        double display_inchs;
        //инициализируем переменные класса через поиск по ХешМепе исходя из Енам класса
        battery_capacity = Double.parseDouble(paramValue.get(SearchCriteria.Laptop.BATTERY_CAPACITY.toString()));
        os = paramValue.get(SearchCriteria.Laptop.OS.toString());
        memory_rom = Double.parseDouble(paramValue.get(SearchCriteria.Laptop.MEMORY_ROM.toString()));
        system_memory = Double.parseDouble(paramValue.get(SearchCriteria.Laptop.SYSTEM_MEMORY.toString()));
        cpu = Double.parseDouble(paramValue.get(SearchCriteria.Laptop.CPU.toString()));
        display_inchs = Double.parseDouble(paramValue.get(SearchCriteria.Laptop.DISPLAY_INCHS.toString()));
        //Создаем объекткласса через билдер
        Laptop newLaptop = new Laptop.LaptopBuilder().setBattery_capacity(battery_capacity).setOs(os).
                setMemory_rom(memory_rom).setSystem_memory(system_memory).setCpu(cpu).
                setDisplay_inchs(display_inchs).build();

        //System.out.println(newLaptop);

        return newLaptop;
    }

}
