package br.com.gabrielalmir.webclientrickandmortyapi.episode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gabrielalmir.webclientrickandmortyapi.episode.dtos.EpisodeDto;
import br.com.gabrielalmir.webclientrickandmortyapi.episode.dtos.ListOfEpisodeDto;
import br.com.gabrielalmir.webclientrickandmortyapi.web.service.WebClientService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/episodes")
public class EpisodeController {
    @Autowired
    private WebClientService webClientService;

    @GetMapping("{id}")
    public Mono<EpisodeDto> getEpisodeById(@PathVariable String id) {
        return webClientService.findEpisodeById(id);
    }

    @GetMapping()
    public Flux<ListOfEpisodeDto> getAllEpisodes() {
        return webClientService.getAllEpisodes();
    }
}
