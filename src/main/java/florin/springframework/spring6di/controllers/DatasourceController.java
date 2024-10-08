package florin.springframework.spring6di.controllers;

import florin.springframework.spring6di.services.DatasourceService;
import org.springframework.stereotype.Controller;

@Controller
public class DatasourceController {
    private final DatasourceService datasourceService;

    public DatasourceController(DatasourceService datasourceService) {
        this.datasourceService = datasourceService;
    }

    public String getDatasource() {
        return datasourceService.returnDatasource();
    }
}
