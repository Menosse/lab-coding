package fit.core;

import java.util.Date;

public class Spend {
    private String name;
    private Date date;
    private double value;

    public void setName(String name) {
        this.name = name;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public String getName() {
        return name;
    }
    public Date getDate() {
        return date;
    }
    public double getValue() {
        return value;
    }
}
