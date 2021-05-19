package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    public double calculateAvgTemperature() {

        double sum = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
        }
        return sum / temperatures.getTemperatures().size();
    }
    public double calculateMedianTemp() {

        double median=0;
        List<Double> tempArray = new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            tempArray.add(temperature.getValue());
        }
        Collections.sort(tempArray);

        if(tempArray.size() % 2 == 0){
            median = (tempArray.get((tempArray.size()/2)-1) + tempArray.get((tempArray.size()/2)-1));
        }
        else{
            median = tempArray.get(((tempArray.size()+1)/2)-1);
        }
        return median;
    }
    }