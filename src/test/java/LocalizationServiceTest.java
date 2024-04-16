import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceTest {

    @Test
    public void testsCheckReturnedText() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();
        String localization = localizationService.locale(Country.RUSSIA);
        String expected = "Добро пожаловать";
        Assertions.assertEquals(expected, localization);
    }
}

