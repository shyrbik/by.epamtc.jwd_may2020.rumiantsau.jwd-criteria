package by.tc.task01.entity;

import java.util.Objects;

public class Refrigerator extends Appliance{

    private double power_consumption;
    private double weight;
    private double freezer_capacity;
    private double overall_capacity;
    private double height;
    private double width;

    private Refrigerator(RefrigeratorBuilder newRefrigerator) {
        this.power_consumption = newRefrigerator.power_consumption;
        this.weight = newRefrigerator.weight;
        this.freezer_capacity = newRefrigerator.freezer_capacity;
        this.overall_capacity = newRefrigerator.overall_capacity;
        this.height = newRefrigerator.height;
        this.width = newRefrigerator.width;
    }

    public static class RefrigeratorBuilder{
        private double power_consumption;
        private double weight;
        private double freezer_capacity;
        private double overall_capacity;
        private double height;
        private double width;

        public RefrigeratorBuilder() {
        }

        public Refrigerator build(){
            return new Refrigerator(this);
        }

        public RefrigeratorBuilder setPower_consumption(double power_consumption) {
            this.power_consumption = power_consumption;
            return this;
        }

        public RefrigeratorBuilder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public RefrigeratorBuilder setFreezer_capacity(double freezer_capacity) {
            this.freezer_capacity = freezer_capacity;
            return this;
        }

        public RefrigeratorBuilder setOverall_capacity(double overall_capacity) {
            this.overall_capacity = overall_capacity;
            return this;
        }

        public RefrigeratorBuilder setHeight(double height) {
            this.height = height;
            return this;
        }

        public RefrigeratorBuilder setWidth(double width) {
            this.width = width;
            return this;
        }
    }


    public Refrigerator() {
    }



    public double getPower_consumption() {
        return power_consumption;
    }
    public double getWeight() {
        return weight;
    }
    public double getFreezer_capacity() {
        return freezer_capacity;
    }
    public double getOverall_capacity() {
        return overall_capacity;
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
        if (!(o instanceof Refrigerator)) return false;
        Refrigerator that = (Refrigerator) o;
        return Double.compare(that.getPower_consumption(), getPower_consumption()) == 0 &&
                Double.compare(that.getWeight(), getWeight()) == 0 &&
                Double.compare(that.getFreezer_capacity(), getFreezer_capacity()) == 0 &&
                Double.compare(that.getOverall_capacity(), getOverall_capacity()) == 0 &&
                Double.compare(that.getHeight(), getHeight()) == 0 &&
                Double.compare(that.getWidth(), getWidth()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPower_consumption(), getWeight(), getFreezer_capacity(),
                getOverall_capacity(), getHeight(), getWidth());
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "power_consumption=" + power_consumption +
                ", weight=" + weight +
                ", freezer_capacity=" + freezer_capacity +
                ", overall_capacity=" + overall_capacity +
                ", height=" + height +
                ", width=" + width +
                '}' ;
    }
}
