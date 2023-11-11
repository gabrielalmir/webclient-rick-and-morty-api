package br.com.gabrielalmir.webclientrickandmortyapi.location.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Getter;

@Getter
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class LocationDto {
    private String id;
    private String name;
    private String type;
    private List<String> residents;
    private String url;
}
