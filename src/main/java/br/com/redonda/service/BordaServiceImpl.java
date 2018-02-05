/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.redonda.service;

import br.com.redonda.model.Borda;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.redonda.repository.BordaRepository;

/**
 *
 * @author eduardo
 */
@Service
@Transactional
//@Scope(value = WebApplicationContext.SCOPE_REQUEST)
public class BordaServiceImpl implements BordaService {

    private final BordaRepository repository;

    @Autowired
    public BordaServiceImpl(BordaRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public void delete(Borda tipoDeBorda) {
        repository.delete(tipoDeBorda);
    }

    @Override
    public Borda find(Integer id) {
        return repository.findOne(id);
    }

    @Override
    public Borda save(Borda tipoDeBorda) {
        repository.save(tipoDeBorda);
        return tipoDeBorda;
    }

    @Override
    public Iterable<Borda> all() {
        return repository.findAll();
    }
    
}
