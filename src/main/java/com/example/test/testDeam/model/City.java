package com.example.test.testDeam.model;

/**
 * Description:
 *
 * @author Corey Zhang
 * @create 2019-11-03 18:20
 */
public class City {

    private Long id;
    private String name;
    private String state;
    private String country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
