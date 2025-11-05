package com.Codico.spring_metrics.controller;


import com.Codico.spring_metrics.service.MetricsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class MetricsController {

    private final MetricsService metricsService;

    public MetricsController(MetricsService metricsService) {
        this.metricsService = metricsService;
    }

    @GetMapping("/monitor")
    public Map<String, Object> monitorApp(@RequestParam String appUrl) {
        return metricsService.getMetrics(appUrl);
    }
}
