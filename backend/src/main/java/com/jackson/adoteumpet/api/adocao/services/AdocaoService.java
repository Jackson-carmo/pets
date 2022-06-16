package com.jackson.adoteumpet.api.adocao.services;

import com.jackson.adoteumpet.api.adocao.dtos.AdocaoRequest;
import com.jackson.adoteumpet.api.adocao.dtos.AdocaoResponse;
import com.jackson.adoteumpet.api.adocao.mappers.AdocaoMapper;
import com.jackson.adoteumpet.core.repositories.AdocaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AdocaoService {

    @Autowired
    private AdocaoRepository adocaoRepository;

    @Autowired
    private AdocaoMapper adocaoMapper;


    public AdocaoResponse create(@RequestBody AdocaoRequest adocaoRequest) {
        var adocaoToCreate = adocaoMapper.toModel(adocaoRequest);
        var createdAdocao = adocaoRepository.save(adocaoToCreate);
        return adocaoMapper.toResponse(createdAdocao);
    }
}
