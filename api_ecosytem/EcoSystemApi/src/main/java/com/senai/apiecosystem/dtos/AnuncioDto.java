package com.senai.apiecosystem.dtos;


import jakarta.validation.constraints.NotBlank;

public record AnuncioDto (
        @NotBlank String titulo,
        LocalDate data_cadastro,
        @NotBlank String disponibilidade,
        @NotBlank  String periodo,
        @NotBlank String url_imagem

) {
}
