package br.com.gabrielalmir.webclientrickandmortyapi.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import br.com.gabrielalmir.webclientrickandmortyapi.character.dtos.CharacterDto;
import br.com.gabrielalmir.webclientrickandmortyapi.episode.dtos.EpisodeDto;
import br.com.gabrielalmir.webclientrickandmortyapi.location.dtos.LocationDto;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class WebClientService {
    @Autowired
    private WebClient webClient;

    public Mono<CharacterDto> findCharacterById(String id) {
        log.info("Buscando o personagem no ID [{}]", id);
        return webClient
            .get()
            .uri("/character/" + id)
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .onStatus(HttpStatusCode::is4xxClientError, error -> Mono.error(new RuntimeException("Verifique o parâmetro informado.")))
            .bodyToMono(CharacterDto.class);
    }

    public Mono<LocationDto> findLocationById(String id) {
        log.info("Buscando a localização pelo ID [{}]", id);
        return webClient
            .get()
            .uri("/location/" + id)
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .onStatus(HttpStatusCode::is4xxClientError, error -> Mono.error(new RuntimeException("Verifique o parâmetro informado.")))
            .bodyToMono(LocationDto.class);
    }

    public Mono<EpisodeDto> findEpisodeById(String id) {
        log.info("Buscando o episódio pelo ID [{}]", id);
        return webClient
            .get()
            .uri("/episode/" + id)
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .onStatus(HttpStatusCode::is4xxClientError, error -> Mono.error(new RuntimeException("Verifique o parâmetro informado.")))
            .bodyToMono(EpisodeDto.class);
    }
}
