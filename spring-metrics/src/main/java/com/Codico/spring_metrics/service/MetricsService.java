package com.Codico.spring_metrics.service;



import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Map;

@Service
public class MetricsService {

    private final RestTemplate restTemplate = new RestTemplate();

    public Map<String, Object> getMetrics(String appUrl) {
        // Fetch metrics from another Spring Boot app
        String metricsEndpoint = appUrl + "/actuator/metrics";
        return restTemplate.getForObject(metricsEndpoint, Map.class);
    }
}
