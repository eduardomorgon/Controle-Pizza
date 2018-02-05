/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.redonda.service;

import br.com.redonda.model.Borda;

/**
 *
 * @author eduardo
 */
public interface BordaService {
    
    void delete(Borda borda);

    Borda find(Integer id);
    
    Borda save(Borda borda);

    Iterable<Borda> all();
    
}
