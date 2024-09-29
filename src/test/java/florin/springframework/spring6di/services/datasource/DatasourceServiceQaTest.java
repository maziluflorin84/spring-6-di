package florin.springframework.spring6di.services.datasource;

import florin.springframework.spring6di.services.DatasourceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"qa", "EN"})
@SpringBootTest
class DatasourceServiceQaTest {

    @Autowired
    DatasourceService datasourceService;

    @Test
    void returnDatasource() {
        System.out.println("qa");
    }
}