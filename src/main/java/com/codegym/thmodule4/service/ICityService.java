package com.codegym.thmodule4.service;

import com.codegym.thmodule4.model.City;

public interface ICityService extends IGeneralService<City> {
    City findCityByName(String cityName);
}
