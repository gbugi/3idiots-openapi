package com.idiots.openapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@RequiredArgsConstructor
@Service
public class OpenapiService {

    private final WebClient webClient;

    @Value("${openapi.serviceKey}")
    private String SERVICE_KEY;

    public Object getOpenapi() {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("serviceKey", SERVICE_KEY)
                        .queryParam("dataType", "JSON")
                        .queryParam("base_date", "20240506")
                        .queryParam("base_time", "0630")
                        .queryParam("nx", 120)
                        .queryParam("ny", 60)
                        .build())
                .retrieve()
                .bodyToMono(String.class);

    }
}