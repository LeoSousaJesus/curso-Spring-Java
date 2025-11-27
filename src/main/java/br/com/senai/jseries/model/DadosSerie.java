package br.com.senai.jseries.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                        @JsonAlias("totalSeaseons") Integer totalTemporadas,
                        @JsonAlias("imdbRating") Double notasIMDB){

}
