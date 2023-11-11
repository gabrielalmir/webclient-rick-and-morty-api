package br.com.gabrielalmir.webclientrickandmortyapi.character.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Getter;

@Getter
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class CharacterDto {
    private String id;
    private String name;
    private String status;
    private String species;
    private String image;
    private List<String> episodes;
}
