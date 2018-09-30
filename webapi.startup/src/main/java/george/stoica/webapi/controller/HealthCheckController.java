package george.stoica.webapi.controller;

import george.stoica.webapi.models.response.HealthCheckResponse;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;

import java.util.concurrent.CompletableFuture;

/**
 * Created on 8/9/2018.
 */
@RestController
@RequestMapping("/health")
public class HealthCheckController {
    private static Logger logger = LoggerFactory.getLogger("george.stoica.webapi.controller.HealthCheckController");

//    @Value("${test.port}")
//    private int port;

    @GetMapping("/status")
    @Async
    public CompletableFuture<HealthCheckResponse> GetStatus() {

        logger.info("Received Health check request.");

        return CompletableFuture.completedFuture(new HealthCheckResponse(true));
    }
}
