package br.com.gabrielalmir.webclientrickandmortyapi.location.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record LocationDto(
    String id,
    String name,
    String type,
    List<String> residents,
    String url
) {
}
