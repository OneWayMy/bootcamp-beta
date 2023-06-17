package ru.faang.school.hashmap.task_4;

import ru.faang.school.hashmap.task_4.weatherData.WeatherData;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static final Map<String, WeatherData> cashWeather = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(weatherDataCash("Barnayl").toString());
        cashWeather.put("Mamontovo", new WeatherData("Mamontovo", "23", 49));
        cashWeather.put("Moscow", new WeatherData("Moscow", "25", 38));
        removeWeatherData("Moscow");
        allWeatherData();
    }

    private static WeatherData weatherDataCash(String city) {
        if (cashWeather.containsKey(city)) {
            return cashWeather.get(city);
        }
        updateWeatherData(city);
        return cashWeather.get(city);
    }

    private static void updateWeatherData(String city) {
        cashWeather.put(city, new WeatherData("Barnayl", "34", 50));
    }

    private static void removeWeatherData(String city) {
        cashWeather.remove(city);
    }
    private static void allWeatherData() {
        cashWeather.forEach((key, value) -> System.out.println(value.toString()));
    }
}
