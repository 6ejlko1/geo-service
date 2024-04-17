package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class GeoServiceTest {

    @Test
    void GeoServiceImplTest() {
        GeoService geoService = new GeoServiceImpl();
        Country expected = geoService.byIp("172.123.12.19").getCountry();
        Country result = Country.RUSSIA;
        Assertions.assertEquals(expected, result);
    }
}