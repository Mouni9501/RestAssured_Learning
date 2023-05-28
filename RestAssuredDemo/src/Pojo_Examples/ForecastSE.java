package Pojo_Examples;

import java.util.Date;

public class ForecastSE
{
   private Date date;
    private TemperatureSE temperature;
    private String description;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TemperatureSE getTemperature() {
        return temperature;
    }

    public void setTemperature(TemperatureSE temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
