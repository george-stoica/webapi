package george.stoica.webapi.config;

import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.context.annotation.Bean;

/**
 * Created on 8/9/2018.
 */
public class HttpServerConfig {

    @Bean
    public UndertowServletWebServerFactory containerFactory() {
        UndertowServletWebServerFactory factory = new UndertowServletWebServerFactory();

        factory.addBuilderCustomizers(builder -> {
            builder.addHttpListener(8080, "localhost");
        });

        return factory;
    }
}
