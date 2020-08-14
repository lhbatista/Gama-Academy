package br.batista.springfirst.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exemplo")
public class Controller {

    @RequestMapping("/hello")
    public ResponseEntity<String> get(){

        return ResponseEntity.ok("Olá, funcionou");
    }
    
}