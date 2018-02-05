package br.com.redonda.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.redonda.model.Pizza;

@Repository
public interface PizzaRepository extends PagingAndSortingRepository<Pizza, Integer> {

}