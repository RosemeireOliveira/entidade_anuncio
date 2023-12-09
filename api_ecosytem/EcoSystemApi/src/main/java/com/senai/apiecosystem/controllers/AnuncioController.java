package com.senai.apiecosystem.controllers;

import com.senai.apiecosystem.services.FileUploadService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*", allowedHeaders = "*")

@RestController

@RequestMapping(value="/anuncio",produces={"application/jsoon"})
public class AnuncioController {
    @Autowired

    AnuncioRepository anuncioRepository;

    @Autowired
    UserRepository uuserepository;
    @Autowired
    FileUploadService fileUploadService;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private TipoStatusRepository tipoStatusRepository;
    @Operation(summary = "metodo para consultar todos os anuncios nosistemas", method ="GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = 'dados retorno COM SUCESSO')
    })

}

