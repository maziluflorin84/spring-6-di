package florin.springframework.spring6di.services.i18n;

import florin.springframework.spring6di.controllers.i18n.Myi18nController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("ES")
@SpringBootTest
class SpanishGreetingServiceTest {

    @Autowired
    Myi18nController myi18nController;

    @Test
    void sayGreeting() {
        System.out.println(myi18nController.sayHello());
    }
}