package ru.faang.school.hashmap.task_4.weatherData;

public class WeatherData {
    private String city;
    private String temperature;
    private int humidity;

    public WeatherData(String city, String temperature, int humidity) {
        this.city = city;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "city='" + city + '\'' +
                ", temperature='" + temperature + '\'' +
                ", humidity=" + humidity +
                '}';
    }
}
