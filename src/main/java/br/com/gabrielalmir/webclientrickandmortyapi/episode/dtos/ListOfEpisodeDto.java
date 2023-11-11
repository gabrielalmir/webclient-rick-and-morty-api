package br.com.gabrielalmir.webclientrickandmortyapi.episode.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record ListOfEpisodeDto(
    List<EpisodeDto> results
) {}
