import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceTest {

    @Test
    void GeoServiceImplTest() {
        GeoService geoService = new GeoServiceImpl();
        Country expected = geoService.byIp("172.123.12.19").getCountry();
        Country result = Country.RUSSIA;
        Assertions.assertEquals(expected, result);

    }
}