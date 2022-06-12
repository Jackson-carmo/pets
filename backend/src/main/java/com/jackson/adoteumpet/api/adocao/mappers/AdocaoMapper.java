package com.jackson.adoteumpet.api.adocao.mappers;

import com.jackson.adoteumpet.api.adocao.dtos.AdocaoRequest;
import com.jackson.adoteumpet.core.models.Adocao;
import com.jackson.adoteumpet.core.repositories.PetRepossitory;
import org.springframework.stereotype.Component;

@Component
public class AdocaoMapper {

    private PetRepossitory petRepossitory;

    public Adocao toModel(AdocaoRequest adocaoRequest) {
        var adocao = new Adocao();
        adocao.setEmail(adocaoRequest.getEmail());
        adocao.setValor(adocaoRequest.getValor());
        adocao.setPet(petRepossitory.findByIdOrElseThrow(adocaoRequest.getPetId()));
        return adocao;
    }
}
