package com.jackson.adoteumpet.api.adocao.dtos;

import com.jackson.adoteumpet.api.pet.dtos.PetResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdocaoResponse {

    private Long id;
    private String email;
    private BigDecimal valor;
    private PetResponse pet;
}
