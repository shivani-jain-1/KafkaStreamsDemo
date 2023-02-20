package org.example;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Weather {

 // ,,,,,,,,,,,,,,,,,,,,,
// 8,24.3,0,3.4,6.3,NW,30,SW,NW,6,20,68,29,1019.7,1015,7,7,14.4,23.6,No,3.6,Yes
    @JsonFormat
    private Double MinTemp;
    @JsonFormat
    private Double MaxTemp;
    @JsonFormat
    private Double Rainfall;

    public Double getMinTemp() {
        return MinTemp;
    }

    public void setMinTemp(Double minTemp) {
        MinTemp = minTemp;
    }

    public Double getMaxTemp() {
        return MaxTemp;
    }

    public void setMaxTemp(Double maxTemp) {
        MaxTemp = maxTemp;
    }

    public Double getRainfall() {
        return Rainfall;
    }

    public void setRainfall(Double rainfall) {
        Rainfall = rainfall;
    }

    public Double getEvaporation() {
        return Evaporation;
    }

    public void setEvaporation(Double evaporation) {
        Evaporation = evaporation;
    }

    public Double getSunshine() {
        return Sunshine;
    }

    public void setSunshine(Double sunshine) {
        Sunshine = sunshine;
    }

    public String getWindGustDir() {
        return WindGustDir;
    }

    public void setWindGustDir(String windGustDir) {
        WindGustDir = windGustDir;
    }

    public Double getWindGustSpeed() {
        return WindGustSpeed;
    }

    public void setWindGustSpeed(Double windGustSpeed) {
        WindGustSpeed = windGustSpeed;
    }

    public String getWindDir3pm() {
        return WindDir3pm;
    }

    public void setWindDir3pm(String windDir3pm) {
        WindDir3pm = windDir3pm;
    }

    public String getWindDir9am() {
        return WindDir9am;
    }

    public void setWindDir9am(String windDir9am) {
        WindDir9am = windDir9am;
    }

    public Double getWindSpeed9am() {
        return WindSpeed9am;
    }

    public void setWindSpeed9am(Double windSpeed9am) {
        WindSpeed9am = windSpeed9am;
    }

    public Double getWindSpeed3pm() {
        return WindSpeed3pm;
    }

    public void setWindSpeed3pm(Double windSpeed3pm) {
        WindSpeed3pm = windSpeed3pm;
    }

    public Double getHumidity9am() {
        return Humidity9am;
    }

    public void setHumidity9am(Double humidity9am) {
        Humidity9am = humidity9am;
    }

    public Double getHumidity3pm() {
        return Humidity3pm;
    }

    public void setHumidity3pm(Double humidity3pm) {
        Humidity3pm = humidity3pm;
    }

    public Double getPressure9am() {
        return Pressure9am;
    }

    public void setPressure9am(Double pressure9am) {
        Pressure9am = pressure9am;
    }

    public Double getPressure3pm() {
        return Pressure3pm;
    }

    public void setPressure3pm(Double pressure3pm) {
        Pressure3pm = pressure3pm;
    }

    public Double getCloud9am() {
        return Cloud9am;
    }

    public void setCloud9am(Double cloud9am) {
        Cloud9am = cloud9am;
    }

    public Double getCloud3pm() {
        return Cloud3pm;
    }

    public void setCloud3pm(Double cloud3pm) {
        Cloud3pm = cloud3pm;
    }

    public Double getTemp9am() {
        return Temp9am;
    }

    public void setTemp9am(Double temp9am) {
        Temp9am = temp9am;
    }

    public Double getTemp3pm() {
        return Temp3pm;
    }

    public void setTemp3pm(Double temp3pm) {
        Temp3pm = temp3pm;
    }

    public String getRainToday() {
        return RainToday;
    }

    public void setRainToday(String rainToday) {
        RainToday = rainToday;
    }

    public Double getRISK_MM() {
        return RISK_MM;
    }

    public void setRISK_MM(Double RISK_MM) {
        this.RISK_MM = RISK_MM;
    }

    public String getRainTomorrow() {
        return RainTomorrow;
    }

    public void setRainTomorrow(String rainTomorrow) {
        RainTomorrow = rainTomorrow;
    }

    @JsonFormat
    private Double Evaporation;
    @JsonFormat
    private Double Sunshine;
    @JsonFormat
    private String WindGustDir;
    @JsonFormat
    private Double WindGustSpeed;
    @JsonFormat
    private String WindDir3pm;
    @JsonFormat
    private String WindDir9am;
    @JsonFormat
    private Double WindSpeed9am;
    @JsonFormat
    private Double WindSpeed3pm;
    @JsonFormat
    private Double Humidity9am;
    @JsonFormat
    private Double Humidity3pm;
    @JsonFormat
    private Double Pressure9am;
    @JsonFormat
    private Double Pressure3pm;
    @JsonFormat
    private Double Cloud9am;
    @JsonFormat
    private Double Cloud3pm;
    @JsonFormat
    private Double Temp9am;
    @JsonFormat
    private Double Temp3pm;
    @JsonFormat
    private String RainToday;
    @JsonFormat
    private Double RISK_MM;
    @JsonFormat
    private String RainTomorrow;


    public Weather() {
    }

    public Weather(Double minTemp, Double maxTemp, Double rainfall, Double evaporation, Double sunshine, String windGustDir, Double windGustSpeed, String windDir9am, String windDir3pm, Double windSpeed9am, Double windSpeed3pm, Double humidity9am, Double humidity3pm, Double pressure9am, Double pressure3pm, Double cloud9am, Double cloud3pm, Double temp9am, Double temp3pm, String rainToday, Double RISK_MM, String rainTomorrow) {
        MinTemp = minTemp;
        MaxTemp = maxTemp;
        Rainfall = rainfall;
        Evaporation = evaporation;
        Sunshine = sunshine;
        WindGustDir = windGustDir;
        WindGustSpeed = windGustSpeed;
        WindDir9am = windDir9am;
        WindDir3pm = windDir3pm;
        WindSpeed9am = windSpeed9am;
        WindSpeed3pm = windSpeed3pm;
        Humidity9am = humidity9am;
        Humidity3pm = humidity3pm;
        Pressure9am = pressure9am;
        Pressure3pm = pressure3pm;
        Cloud9am = cloud9am;
        Cloud3pm = cloud3pm;
        Temp9am = temp9am;
        Temp3pm = temp3pm;
        RainToday = rainToday;
        this.RISK_MM = RISK_MM;
        RainTomorrow = rainTomorrow;
    }
}


