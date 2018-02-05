/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.redonda.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.redonda.model.Pizza;

/**
 *
 * @author eduardo
 */
public interface PizzaService {

    void delete(Pizza pizza);

    Pizza find(Integer id);

    Pizza save(Pizza pizza);

    Iterable<Pizza> all();

    Page<Pizza> allPaginated(Pageable pageable);

}
