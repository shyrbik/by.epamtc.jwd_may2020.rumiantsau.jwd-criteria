package by.tc.task01.entity;

import java.util.Objects;

public class Speakers extends Appliance{
    private double power_consumption;
    private double number_of_speakers;
    private String frequency_range;
    private double cord_length;

    public static class SpeakersBuilder{
        private double power_consumption;
        private double number_of_speakers;
        private String frequency_range;
        private double cord_length;

        public SpeakersBuilder() {
        }
        public Speakers build(){
            return new Speakers (this);
        }

        public SpeakersBuilder setPower_consumption(double power_consumption) {
            this.power_consumption = power_consumption;
            return this;
        }

        public SpeakersBuilder setNumber_of_speakers(double number_of_speakers) {
            this.number_of_speakers = number_of_speakers;
            return this;
        }

        public SpeakersBuilder setFrequency_range(String frequency_range) {
            this.frequency_range = frequency_range;
            return this;
        }

        public SpeakersBuilder setCord_length(double cord_length) {
            this.cord_length = cord_length;
            return this;
        }
    }

    private Speakers(SpeakersBuilder newSpeakers) {
        this.power_consumption = newSpeakers.power_consumption;
        this.number_of_speakers = newSpeakers.number_of_speakers;
        this.frequency_range = newSpeakers.frequency_range;
        this.cord_length = newSpeakers.cord_length;
    }

    public double getPower_consumption() {
        return power_consumption;
    }
    public double getNumber_of_speakers() {
        return number_of_speakers;
    }
    public String getFrequency_range() {
        return frequency_range;
    }
    public double getCord_length() {
        return cord_length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Speakers)) return false;
        Speakers speakers = (Speakers) o;
        return Double.compare(speakers.getPower_consumption(), getPower_consumption()) == 0 &&
                Double.compare(speakers.getNumber_of_speakers(), getNumber_of_speakers()) == 0 &&
                Double.compare(speakers.getCord_length(), getCord_length()) == 0 &&
                Objects.equals(getFrequency_range(), speakers.getFrequency_range());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPower_consumption(), getNumber_of_speakers(), getFrequency_range(), getCord_length());
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "power_consumption=" + power_consumption +
                ", number_of_speakers=" + number_of_speakers +
                ", frequency_range='" + frequency_range + '\'' +
                ", cord_length=" + cord_length +
                '}' ;
    }
}
