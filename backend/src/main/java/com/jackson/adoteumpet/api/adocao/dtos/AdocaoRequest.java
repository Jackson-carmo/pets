package com.jackson.adoteumpet.api.adocao.dtos;



import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.validation.constraints.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AdocaoRequest {

    @NotNull
    @Email
    @NotEmpty
    @Size(max = 255)
    private String email;

    @NotNull
    @Min(10)
    @Max(150)
    private BigDecimal valor;

    @NotNull
    @Positive
    private Long petId;

}
