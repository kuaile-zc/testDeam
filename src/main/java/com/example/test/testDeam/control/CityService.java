package com.example.test.testDeam.control;

import com.example.test.testDeam.model.City;
import com.example.test.testDeam.model.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @author Corey Zhang
 * @create 2019-11-03 18:27
 */
@Service
public class CityService {

    @Autowired
    private CityMapper cityMapper;

    public List<City> getAllCities(){
        return cityMapper.getAllCities();
    }

    public void save(City city){
        cityMapper.insert(city);
    }
}
