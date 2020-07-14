package by.tc.task01.entity;

import java.util.Objects;

public class Oven extends Appliance{

    private double power_consumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    private Oven(OvenBuilder newOven) {
        this.power_consumption = newOven.power_consumption;
        this.weight = newOven.weight;
        this.capacity = newOven.capacity;
        this.depth = newOven.depth;
        this.height = newOven.height;
        this.width = newOven.width;
    }

    public static class OvenBuilder{
        private double power_consumption;
        private double weight;
        private double capacity;
        private double depth;
        private double height;
        private double width;

        public OvenBuilder() {
        }

        public OvenBuilder setPower_consumption(double power_consumption) {
            this.power_consumption = power_consumption;
            return this;
        }

        public OvenBuilder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public OvenBuilder setCapacity(double capacity) {
            this.capacity = capacity;
            return this;
        }

        public OvenBuilder setDepth(double depth) {
            this.depth = depth;
            return this;
        }

        public OvenBuilder setHeight(double height) {
            this.height = height;
            return this;
        }

        public OvenBuilder setWidth(double width) {
            this.width = width;
            return this;
        }
        public Oven build(){
            return new Oven(this);
        }
    }



    public double getPower_consumption() {
        return power_consumption;
    }
    public double getWeight() {
        return weight;
    }
    public double getCapacity() {
        return capacity;
    }
    public double getDepth() {
        return depth;
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Oven)) return false;
        Oven oven = (Oven) o;
        return Double.compare(oven.getPower_consumption(), getPower_consumption()) == 0 &&
                Double.compare(oven.getWeight(), getWeight()) == 0 &&
                Double.compare(oven.getCapacity(), getCapacity()) == 0 &&
                Double.compare(oven.getDepth(), getDepth()) == 0 &&
                Double.compare(oven.getHeight(), getHeight()) == 0 &&
                Double.compare(oven.getWidth(), getWidth()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPower_consumption(), getWeight(), getCapacity(), getDepth(), getHeight(), getWidth());
    }

    @Override
    public String toString() {
        return "Oven{" +
                "power_consumption=" + power_consumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}' ;
    }
}
