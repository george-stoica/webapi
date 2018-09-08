package george.stoica.webapi.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Created on 2/9/2018.
 */
@SpringBootApplication(scanBasePackages = {"george.stoica.webapi.config", "george.stoica.webapi.controller"})
@EnableAsync
public class WebApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApiApplication.class, args);
    }
}
