package com.jackson.adoteumpet.api.adocao.controllers;

import com.jackson.adoteumpet.api.adocao.mappers.AdocaoMapper;
import com.jackson.adoteumpet.core.repositories.AdocaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdocaoController {

    @Autowired
    private AdocaoRepository adocaoRepository;

    @Autowired
    private AdocaoMapper adocaoMapper;
}
