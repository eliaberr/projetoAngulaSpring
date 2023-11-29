package br.com.fatec.primeiroprojeto.resources;

import org.springframework.web.bind.annotation.GetMapping;

public class TesteController {
    @GetMapping("teste")
    public String teste(){
        return "Teste java";
    }
}
