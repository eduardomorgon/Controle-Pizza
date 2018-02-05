/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.redonda.repository;

import br.com.redonda.model.Borda;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eduardo
 */
@Repository
public interface BordaRepository extends CrudRepository<Borda, Integer> {
    
}
