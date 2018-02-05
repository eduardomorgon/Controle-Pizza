/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.redonda.model;

import br.com.redonda.builder.ItemBuilder;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author eduardo
 */
public class ItemTest {
    
    private Pizza mussarela;
    private Item item;
    
    public ItemTest() {
    }
    
    @Before
    public void setUp() {

        item = new ItemBuilder()
                .criarPizza("Mussarela")
                .precos(14.0, 20.0, 28.0)
                .comBordaDe("Alho")
                .tamanhoPizza(TipoDePizza.GRANDE)
                .comQuantidade(2)
                .comObservacao("Bastante Molho")
                .criar(); 
    }
    
    @Test
    public void testValorTotalDoItem() {
        assertEquals(56.0, item.getValorItem().doubleValue(), 0.000001);
    }
    
    @Test
    public void testQuantidadeItem() {
        assertEquals(2, item.getQuantidade());
    }

    @Test
    public void testPrecosPizza() {
        assertEquals(14.0, item.getPizza().pegarValorPizza(TipoDePizza.BROTO).doubleValue(), 0.000001);
        assertEquals(20.0, item.getPizza().pegarValorPizza(TipoDePizza.MEDIA).doubleValue(), 0.000001);
        assertEquals(28.0, item.getPizza().pegarValorPizza(TipoDePizza.GRANDE).doubleValue(), 0.000001);
    }
    
    @Test
    public void testSaborPizzaEBordaEObservacao() {
        assertEquals("Mussarela", item.getPizza().getNome());
        assertEquals("Alho", item.getTipoDeBorda().getNome());
        assertEquals("Bastante Molho", item.getObservacao());
    }
    
    
}
