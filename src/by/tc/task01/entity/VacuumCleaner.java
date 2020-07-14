package by.tc.task01.entity;

import java.util.Objects;

public class VacuumCleaner extends Appliance{
    private double power_consumption;
    private String filter_type;
    private String bag_type;
    private String wand_type;
    private double motor_speed_regulation;
    private double cleaning_width;

    public static class VacuumCleanerBuilder{
        private double power_consumption;
        private String filter_type;
        private String bag_type;
        private String wand_type;
        private double motor_speed_regulation;
        private double cleaning_width;

        public VacuumCleanerBuilder() {
        }

        public VacuumCleaner build(){
            return new VacuumCleaner (this);
        }

        public VacuumCleanerBuilder setPower_consumption(double power_consumption) {
            this.power_consumption = power_consumption;
            return this;
        }

        public VacuumCleanerBuilder setFilter_type(String filter_type) {
            this.filter_type = filter_type;
            return this;
        }

        public VacuumCleanerBuilder setBag_type(String bag_type) {
            this.bag_type = bag_type;
            return this;
        }

        public VacuumCleanerBuilder setWand_type(String wand_type) {
            this.wand_type = wand_type;
            return this;
        }

        public VacuumCleanerBuilder setMotor_speed_regulation(double motor_speed_regulation) {
            this.motor_speed_regulation = motor_speed_regulation;
            return this;
        }

        public VacuumCleanerBuilder setCleaning_width(double cleaning_width) {
            this.cleaning_width = cleaning_width;
            return this;
        }
    }


    private VacuumCleaner(VacuumCleanerBuilder newVacuumCleanerBuilder) {
        this.power_consumption = newVacuumCleanerBuilder.power_consumption;
        this.filter_type = newVacuumCleanerBuilder.filter_type;
        this.bag_type = newVacuumCleanerBuilder.bag_type;
        this.wand_type = newVacuumCleanerBuilder.wand_type;
        this.motor_speed_regulation = newVacuumCleanerBuilder.motor_speed_regulation;
        this.cleaning_width = newVacuumCleanerBuilder.cleaning_width;
    }

    public double getPower_consumption() {
        return power_consumption;
    }
    public String getFilter_type() {
        return filter_type;
    }
    public String getBag_type() {
        return bag_type;
    }
    public String getWand_type() {
        return wand_type;
    }
    public double getMotor_speed_regulation() {
        return motor_speed_regulation;
    }
     public double getCleaning_width() {
        return cleaning_width;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VacuumCleaner)) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return Double.compare(that.getPower_consumption(), getPower_consumption()) == 0 &&
                Double.compare(that.getMotor_speed_regulation(), getMotor_speed_regulation()) == 0 &&
                Double.compare(that.getCleaning_width(), getCleaning_width()) == 0 &&
                getFilter_type().equals(that.getFilter_type()) &&
                getBag_type().equals(that.getBag_type()) &&
                getWand_type().equals(that.getWand_type());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPower_consumption(), getFilter_type(), getBag_type(),
                getWand_type(), getMotor_speed_regulation(), getCleaning_width());
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "power_consumption=" + power_consumption +
                ", filter_type='" + filter_type + '\'' +
                ", bag_type='" + bag_type + '\'' +
                ", wand_type='" + wand_type + '\'' +
                ", motor_speed_regulation=" + motor_speed_regulation +
                ", cleaning_width=" + cleaning_width +
                '}' ;
    }
}
