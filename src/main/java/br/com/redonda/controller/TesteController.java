/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.redonda.controller;

import br.com.redonda.model.Borda;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author eduardo
 */
@RestController("teste")
public class TesteController {
    
    
    
    @GetMapping
    public Borda tipo() {
        return new Borda("teste", "11111111");
    }
    
}
