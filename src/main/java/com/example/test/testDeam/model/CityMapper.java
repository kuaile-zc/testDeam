package com.example.test.testDeam.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author Corey Zhang
 * @create 2019-11-03 18:18
 */
@Component
public class CityMapper {

    List<City> cityList = new ArrayList<>();

    public List<City> getAllCities(){
        return cityList;
    }

    public void insert(City city){
        cityList.add(city);
    }
}
