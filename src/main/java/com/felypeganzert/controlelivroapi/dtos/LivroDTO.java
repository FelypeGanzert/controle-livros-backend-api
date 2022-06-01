package com.felypeganzert.controlelivroapi.dtos;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LivroDTO {
    
    private Integer id;

    @NotBlank    
    private String titulo;

    @NotBlank
    private String autor;

    @Min(0)
    private int paginas;

    private String descricao;
    
    private String isbn10;
    private String isbn13;

}
