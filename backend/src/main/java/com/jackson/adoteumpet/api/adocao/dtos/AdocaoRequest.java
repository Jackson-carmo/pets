package com.jackson.adoteumpet.api.adocao.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdocaoRequest {

    private String email;

    private BigDecimal valor;

    private Long petId;

}
