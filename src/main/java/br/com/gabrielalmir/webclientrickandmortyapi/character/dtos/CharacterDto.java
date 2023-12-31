package br.com.gabrielalmir.webclientrickandmortyapi.character.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record CharacterDto(
    String id,
    String name,
    String status,
    String species,
    String image,
    List<String> episode
) {}
