package com.jackson.adoteumpet.api.adocao.mappers;

import com.jackson.adoteumpet.api.adocao.dtos.AdocaoRequest;
import com.jackson.adoteumpet.api.adocao.dtos.AdocaoResponse;
import com.jackson.adoteumpet.api.pet.mappers.PetMapper;
import com.jackson.adoteumpet.core.models.Adocao;
import com.jackson.adoteumpet.core.repositories.PetRepossitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdocaoMapper {

    @Autowired
    private PetRepossitory petRepossitory;

    @Autowired
    private PetMapper petMapper;

    public Adocao toModel(AdocaoRequest adocaoRequest) {
        return Adocao.builder()
                .email(adocaoRequest.getEmail())
                .valor(adocaoRequest.getValor())
                .pet(petRepossitory.findByIdOrElseThrow(adocaoRequest.getPetId()))
                .build();
    }

    public AdocaoResponse toResponse(Adocao adocao) {
        return AdocaoResponse.builder()
                .id(adocao.getId())
                .email(adocao.getEmail())
                .valor(adocao.getValor())
                .pet(petMapper.toResponse(adocao.getPet()))
                .build();

    }
}
