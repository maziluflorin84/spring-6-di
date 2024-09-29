package florin.springframework.spring6di.services.datasource;

import florin.springframework.spring6di.services.DatasourceService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class DatasourceServiceProd implements DatasourceService {
    @Override
    public String returnDatasource() {
        return "prod";
    }
}
