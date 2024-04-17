package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceTest {

    @Test
    public void testsCheckReturnedText() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        String localization = localizationService.locale(Country.RUSSIA);
        String expected = "Добро пожаловать";
        Assertions.assertEquals(expected, localization);
    }
}