/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.redonda.service;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.redonda.model.Pizza;
import br.com.redonda.repository.PizzaRepository;

/**
 *
 * @author eduardo
 */
@Service
@Transactional
public class PizzaServiceImpl implements PizzaService {

    private final PizzaRepository repository;

    @Autowired
    public PizzaServiceImpl(PizzaRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public void delete(Pizza pizza) {
        repository.delete(pizza);
    }

    @Override
    public Pizza find(Integer id) {
        return repository.findOne(id);
    }
    
    @Override
    public Pizza save(Pizza pizza) {
        return repository.save(pizza);
    }

    @Override
    public Iterable<Pizza> all() {
        return repository.findAll();
    }

    @Override
    public Page<Pizza> allPaginated (Pageable pageable) {
        return repository.findAll(pageable);
    }
    
}
