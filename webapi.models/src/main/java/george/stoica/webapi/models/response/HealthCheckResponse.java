package george.stoica.webapi.models.response;

/**
 * Created on 8/9/2018.
 */
public class HealthCheckResponse {
    private boolean healthy;

    public HealthCheckResponse(boolean healthy) {
        this.healthy = healthy;
    }

    public boolean isHealthy() {
        return healthy;
    }
}
