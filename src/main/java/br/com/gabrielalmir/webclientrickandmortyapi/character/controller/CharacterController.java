package br.com.gabrielalmir.webclientrickandmortyapi.character.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gabrielalmir.webclientrickandmortyapi.character.dtos.CharacterDTO;
import br.com.gabrielalmir.webclientrickandmortyapi.web.service.WebClientService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/characters")
public class CharacterController {
    @Autowired
    private WebClientService webClientService;

    @GetMapping("{id}")
    public Mono<CharacterDTO> getCharacterById(@PathVariable String id) {
        return webClientService.findCharacterById(id);
    }
}
