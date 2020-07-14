package by.tc.task01.dao.impl.factory;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public class FactorySpeakers implements Factory {

    public Appliance setApplianceValue(Map<String, String> paramValue) {
        double power_consumption;
        double number_of_speakers;
        String frequency_range;
        double cord_length;

        //инициализируем переменные класса через поиск по ХешМепе исходя из Енам класса
        power_consumption = Double.parseDouble(paramValue.get(SearchCriteria.Speakers.POWER_CONSUMPTION.toString()));
        number_of_speakers = Double.parseDouble(paramValue.get(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString()));
        frequency_range = paramValue.get(SearchCriteria.Speakers.FREQUENCY_RANGE.toString());
        cord_length = Double.parseDouble(paramValue.get(SearchCriteria.Speakers.CORD_LENGTH.toString()));

        Speakers newSpeakers = new Speakers.SpeakersBuilder().setPower_consumption(power_consumption).
                setNumber_of_speakers(number_of_speakers).setFrequency_range(frequency_range).
                setCord_length(cord_length).build();

        return newSpeakers;

    }
}
