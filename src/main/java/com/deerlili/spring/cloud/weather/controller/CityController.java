package com.deerlili.spring.cloud.weather.controller;

import com.deerlili.spring.cloud.weather.entity.City;
import com.deerlili.spring.cloud.weather.service.CityDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/citys")
@Api(value = "城市API微服务接口",description = "城市API微服务接口")
public class CityController {

    @Autowired
    private CityDataService cityDataService;

    @GetMapping
    @ApiOperation(value = "城市API微服务接口", notes = "城市API微服务接口")
    public List<City> listCity() throws Exception {
        return cityDataService.listCity();
    }

}
