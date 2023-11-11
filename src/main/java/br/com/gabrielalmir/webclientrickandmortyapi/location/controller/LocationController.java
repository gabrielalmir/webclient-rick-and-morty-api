package br.com.gabrielalmir.webclientrickandmortyapi.location.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gabrielalmir.webclientrickandmortyapi.location.dtos.LocationDto;
import br.com.gabrielalmir.webclientrickandmortyapi.web.service.WebClientService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    private WebClientService webClientService;

    @GetMapping("{id}")
    public Mono<LocationDto> getLocationById(@PathVariable String id) {
        return webClientService.findLocationById(id);
    }
}
