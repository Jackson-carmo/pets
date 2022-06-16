package com.jackson.adoteumpet.api.adocao.controllers;

import com.jackson.adoteumpet.api.adocao.dtos.AdocaoRequest;
import com.jackson.adoteumpet.api.adocao.dtos.AdocaoResponse;
import com.jackson.adoteumpet.api.adocao.services.AdocaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdocaoController {

    @Autowired
    private AdocaoService adocaoService;

    @PostMapping("/api/adocoes")
    @ResponseStatus(code = HttpStatus.CREATED)
    public AdocaoResponse create(@RequestBody AdocaoRequest adocaoRequest) {
        return adocaoService.create(adocaoRequest);
    }
}
