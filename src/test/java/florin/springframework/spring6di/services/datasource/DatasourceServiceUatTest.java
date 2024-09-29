package florin.springframework.spring6di.services.datasource;

import florin.springframework.spring6di.controllers.DatasourceController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"uat", "EN"})
@SpringBootTest
class DatasourceServiceUatTest {

    @Autowired
    DatasourceController datasourceController;

    @Test
    void returnDatasource() {
        System.out.println(datasourceController.getDatasource());
    }
}