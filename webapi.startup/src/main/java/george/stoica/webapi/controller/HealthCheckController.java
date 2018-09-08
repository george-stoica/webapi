package george.stoica.webapi.controller;

import george.stoica.webapi.models.response.HealthCheckResponse;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

/**
 * Created on 8/9/2018.
 */
@RestController
@RequestMapping("/health")
public class HealthCheckController {

    @GetMapping("/status")
    @Async
    public CompletableFuture<HealthCheckResponse> GetStatus() {
        return CompletableFuture.completedFuture(new HealthCheckResponse(true));
    }
}
