/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.redonda.builder;

import br.com.redonda.model.Item;
import br.com.redonda.model.Pizza;
import br.com.redonda.model.Borda;
import br.com.redonda.model.TipoDePizza;
import java.math.BigDecimal;

/**
 *
 * @author eduardo
 */
public class ItemBuilder {
    
    private Pizza pizza;
    private Borda borda;
    private int quatidade = 1;
    private String observacao = "";
    private TipoDePizza tipoDePizza = TipoDePizza.GRANDE;
    
    public ItemBuilder criarPizza(String sabor) {
        pizza = new Pizza(sabor, "Pizza para teste");
        return this;
    }
    
    public ItemBuilder precos(double ...valores) {
        pizza.criarPrecos(BigDecimal.valueOf(valores[0]), BigDecimal.valueOf(valores[1]), BigDecimal.valueOf(valores[2]));
        return this;
    }
    
    public ItemBuilder tamanhoPizza(TipoDePizza tipo) {
        this.tipoDePizza = tipo;
        return this;
    }
    
    public ItemBuilder comBordaDe(String sabor) {
        borda = new Borda(sabor, "Borda de teste");
        return this;
    }
    
    public ItemBuilder comQuantidade(int quantidade) {
        this.quatidade = quantidade;
        return this;
    }
    
    public ItemBuilder comObservacao(String observacao) {
        this.observacao = observacao;
        return this;
    }
    
    public Item criar() {
        return new Item(pizza, tipoDePizza, borda, observacao, quatidade);
    }
    
}
