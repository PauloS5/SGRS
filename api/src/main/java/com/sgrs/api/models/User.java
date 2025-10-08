package com.sgrs.api.models;

public class User {
    private Long id;
    private String name;
    private int capacity;
    private String localization;
    
    public Long getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public int getCapacity() {
        return this.capacity;
    }
    public String getLocalization() {
        return this.localization;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setLocalization(String localization) {
        this.localization = localization;
    }
}
