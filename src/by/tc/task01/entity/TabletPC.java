package by.tc.task01.entity;

import java.util.Objects;

public class TabletPC extends Appliance{
    private double battery_capacity;
    private double  display_inches;
    private double memory_rom;
    private double flash_memory_capacity;
    private String color;

    public static class TabletPCBuilder{
        private double battery_capacity;
        private double  display_inches;
        private double memory_rom;
        private double flash_memory_capacity;
        private String color;

        public TabletPCBuilder() {
        }

        public TabletPC build(){
            return new TabletPC (this);
        }

        public TabletPCBuilder setBattery_capacity(double battery_capacity) {
            this.battery_capacity = battery_capacity;
            return this;
        }

        public TabletPCBuilder setDisplay_inches(double display_inches) {
            this.display_inches = display_inches;
            return this;
        }

        public TabletPCBuilder setMemory_rom(double memory_rom) {
            this.memory_rom = memory_rom;
            return this;
        }

        public TabletPCBuilder setFlash_memory_capacity(double flash_memory_capacity) {
            this.flash_memory_capacity = flash_memory_capacity;
            return this;
        }

        public TabletPCBuilder setColor(String color) {
            this.color = color;
            return this;
        }
    }

    private TabletPC(TabletPCBuilder newTabletPC) {
        this.battery_capacity = newTabletPC.battery_capacity;
        this.display_inches = newTabletPC.display_inches;
        this.memory_rom = newTabletPC.memory_rom;
        this.flash_memory_capacity = newTabletPC.flash_memory_capacity;
        this.color = newTabletPC.color;
    }

    public double getBattery_capacity() {
        return battery_capacity;
    }
    public double getDisplay_inches() {
        return display_inches;
    }
    public double getMemory_rom() {
        return memory_rom;
    }
    public double getFlash_memory_capacity() {
        return flash_memory_capacity;
    }
    public String getColor() {
        return color;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TabletPC)) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Double.compare(tabletPC.getBattery_capacity(), getBattery_capacity()) == 0 &&
                Double.compare(tabletPC.getDisplay_inches(), getDisplay_inches()) == 0 &&
                Double.compare(tabletPC.getMemory_rom(), getMemory_rom()) == 0 &&
                Double.compare(tabletPC.getFlash_memory_capacity(), getFlash_memory_capacity()) == 0 &&
                getColor().equals(tabletPC.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBattery_capacity(), getDisplay_inches(), getMemory_rom(), getFlash_memory_capacity(), getColor());
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "battery_capacity=" + battery_capacity +
                ", display_inches=" + display_inches +
                ", memory_rom=" + memory_rom +
                ", flash_memory_capacity=" + flash_memory_capacity +
                ", color='" + color + '\'' +
                '}' ;
    }
}
