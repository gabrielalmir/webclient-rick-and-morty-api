package br.com.gabrielalmir.webclientrickandmortyapi.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    @Bean
    WebClient webClient(WebClient.Builder builder) {
        return builder.baseUrl("https://rickandmortyapi.com/api").build();
    }
}
