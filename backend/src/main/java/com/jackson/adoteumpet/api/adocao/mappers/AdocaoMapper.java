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
        var adocao = new Adocao();
        adocao.setEmail(adocaoRequest.getEmail());
        adocao.setValor(adocaoRequest.getValor());
        adocao.setPet(petRepossitory.findByIdOrElseThrow(adocaoRequest.getPetId()));
        return adocao;
    }

    public AdocaoResponse toResponse(Adocao adocao) {
        var adocaoResponse = new AdocaoResponse();
        adocaoResponse.setId(adocao.getId());
        adocaoResponse.setEmail(adocao.getEmail());
        adocaoResponse.setValor(adocao.getValor());
        adocaoResponse.setPet(petMapper.toResponse(adocao.getPet()));
        return adocaoResponse;

    }
}
