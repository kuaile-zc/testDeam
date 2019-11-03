package com.example.test.testDeam.control;

import com.example.test.testDeam.model.City;
import com.example.test.testDeam.model.CityMapper;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;

/**
 * Description:
 *
 * @author Corey Zhang
 * @create 2019-11-03 18:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CityServiceUnitTest {
    @SpringBootApplication(scanBasePackages = "com.example.test.testDeam")
    private class InnerConfig{}

    @Autowired
    private CityService cityService;

    @MockBean
    private CityMapper cityMapper;

    @Test
    public void testInsert(){
        City city = new City();
        cityService.save(city);
        Mockito.verify(cityMapper).insert(city);
//        Mockito.verify(cityMapper, times(1)).insert(city);
    }

    @Test
    public void getAllCities(){
        City city = new City();
        city.setId(1L);
        city.setName("Wuhan");
        city.setCountry("China");
        city.setState("Hubie");

        Mockito.when(cityMapper.getAllCities())
                .thenReturn(Collections.singletonList(city));

        List<City> cities = cityService.getAllCities();
        Assertions.assertThat(cities.size()).isEqualTo(1);
        Assertions.assertThat(cities.get(0).getName()).isEqualTo("Wuhan");
    }

}
