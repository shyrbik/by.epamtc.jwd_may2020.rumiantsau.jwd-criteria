package by.tc.task01.entity;

import java.util.Objects;

public class Laptop extends Appliance{
    private double battery_capacity;
    private String os;
    private double memory_rom;
    private double system_memory;
    private double cpu;
    private double display_inchs;

    private Laptop(LaptopBuilder newLaptop) {
        this.battery_capacity = newLaptop.battery_capacity;
        this.os = newLaptop.os;
        this.memory_rom = newLaptop.memory_rom;
        this.system_memory = newLaptop.system_memory;
        this.cpu = newLaptop.cpu;
        this.display_inchs = newLaptop.display_inchs;
    }

    public static class LaptopBuilder {
        private double battery_capacity;
        private String os;
        private double memory_rom;
        private double system_memory;
        private double cpu;
        private double display_inchs;

        public LaptopBuilder() {
        }

        public LaptopBuilder setBattery_capacity(double battery_capacity) {
            this.battery_capacity = battery_capacity;
            return this;
        }

        public LaptopBuilder setOs(String os) {
            this.os = os;
            return this;
        }

        public LaptopBuilder setMemory_rom(double memory_rom) {
            this.memory_rom = memory_rom;
            return this;
        }

        public LaptopBuilder setSystem_memory(double system_memory) {
            this.system_memory = system_memory;
            return this;
        }

        public LaptopBuilder setCpu(double cpu) {
            this.cpu = cpu;
            return this;
        }

        public LaptopBuilder setDisplay_inchs(double display_inchs) {
            this.display_inchs = display_inchs;
            return this;
        }

        public Laptop build(){
           return new Laptop(this);
        }

    }


    public double getBattery_capacity() {
        return battery_capacity;
    }

    public String getOs() {
        return os;
    }

    public double getMemory_rom() {
        return memory_rom;
    }

    public double getSystem_memory() {
        return system_memory;
    }

    public double getCpu() {
        return cpu;
    }

    public double getDisplay_inchs() {
        return display_inchs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.getBattery_capacity(), getBattery_capacity()) == 0 &&
                Double.compare(laptop.getMemory_rom(), getMemory_rom()) == 0 &&
                Double.compare(laptop.getSystem_memory(), getSystem_memory()) == 0 &&
                Double.compare(laptop.getCpu(), getCpu()) == 0 &&
                Double.compare(laptop.getDisplay_inchs(), getDisplay_inchs()) == 0 &&
                getOs().equals(laptop.getOs());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBattery_capacity(), getOs(), getMemory_rom(), getSystem_memory(), getCpu(), getDisplay_inchs());
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery_capacity=" + battery_capacity +
                ", os='" + os + '\'' +
                ", memory_rom=" + memory_rom +
                ", system_memory=" + system_memory +
                ", cpu=" + cpu +
                ", display_inchs=" + display_inchs +
                '}' ;
    }
}
