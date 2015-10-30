
package pl.model;

import java.util.Date;

public class Expense {
    
    private String code;
    private String description;
    private int value;
    private Date date;

    public Expense(String code, String description, int value, Date date) {
        this.code = code;
        this.description = description;
        this.value = value;
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
