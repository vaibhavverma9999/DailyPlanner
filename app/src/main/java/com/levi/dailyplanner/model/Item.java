package com.levi.dailyplanner.model;

import java.sql.Time;
import java.util.Date;

public class Item {
    String itemName;
    String description;
    Priority priority;
    Date itemDate;
    // TODO: change this to Time and update ItemAdapter accordingly
    String itemTime;
    Boolean isCompleted;

    public Item(String itemName, String description, Priority priority, Date itemDate, String itemTime, Boolean isCompleted) {
        this.itemName = itemName;
        this.description = description;
        this.priority = priority;
        this.itemDate = itemDate;
        this.itemTime = itemTime;
        this.isCompleted = isCompleted;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Date getItemDate() {
        return itemDate;
    }

    public void setItemDate(Date itemDate) {
        this.itemDate = itemDate;
    }

    public String getItemTime() {
        return itemTime;
    }

    public void setItemTime(String itemTime) {
        this.itemTime = itemTime;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }
}
