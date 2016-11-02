import org.springframework.test.annotation.AbstractAnnotationAwareTransactionalTests;

/**
 * Created by drome on 16/11/2.
 */
public class BaseTest extends AbstractAnnotationAwareTransactionalTests {

    @Override
    protected String[] getConfigLocations() {
        String[] config = {
                "classpath:spring/spring-config.xml"
//                "classpath:carriage-advert-dao-beans.xml",
//                "classpath:carriage-advert-service-beans.xml"
//				"classpath:carriage-shop-beans.xml"
        };

        return config;
    }
}
