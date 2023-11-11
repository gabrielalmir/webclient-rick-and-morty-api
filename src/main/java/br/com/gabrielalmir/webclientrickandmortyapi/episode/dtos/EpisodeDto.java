package br.com.gabrielalmir.webclientrickandmortyapi.episode.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record EpisodeDto(
    String id,
    String name,
    String air_date,
    String episode,
    List<String> characters,
    String url
) {}
