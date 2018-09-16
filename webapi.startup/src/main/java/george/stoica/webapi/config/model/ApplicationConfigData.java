package george.stoica.webapi.config.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created on 15/9/2018.
 */
//@Configuration
//@PropertySource("classpath:application.properties")
//@ConfigurationProperties(prefix = "test")
public class ApplicationConfigData {
    private int port;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
