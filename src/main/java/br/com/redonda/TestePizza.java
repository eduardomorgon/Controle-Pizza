/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.redonda;

import br.com.redonda.model.Cliente;
import br.com.redonda.model.Endereco;
import br.com.redonda.model.Item;
import br.com.redonda.model.Pedido;
import br.com.redonda.model.Pizza;
import br.com.redonda.model.Borda;
import br.com.redonda.model.TipoDePizza;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author eduardo
 */
public class TestePizza {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        
        System.out.println(em);
        
        em.getTransaction().begin();
        
        Endereco endereco1 = new Endereco("Rua Teste", 12, "Jardim Teste", "Av nova");
        Endereco endereco2 = new Endereco("Rua Teste2", 122, "Jardim 2", "Av 2");
        Cliente cliente = new Cliente("2222-3333", "Maria", endereco1);
//        endereco.setCliente(cliente);
//        Pizza mussarela = new Pizza("Mussarela", "Pizza de mussarela, com rodelas de tomates");
//        mussarela.criarPrecos(new BigDecimal("18.00"), new BigDecimal("24.00"), new BigDecimal("30.00"));
//        Borda catupiry = new Borda("Catupiry", "Borda de Catupiry");
//        Pizza calabresa = new Pizza("Calabresa", "Pizza de calabresa, com cebola");
//        calabresa.criarPrecos(new BigDecimal("18.00"), new BigDecimal("24.00"), new BigDecimal("30.00"));
        
        
//        em.persist(mussarela);
//        em.persist(calabresa);
//        Item item1 = new Item(mussarela, TipoDePizza.MEDIA, catupiry, "Bastante molho", 1);
//        Item item2 = new Item(calabresa, TipoDePizza.GRANDE, catupiry, "Bastante molho", 1);
        
        
//        Pedido pedido = new Pedido(cliente, endereco1, Arrays.asList(item1, item2));
//        
        em.persist(cliente);
        
        em.getTransaction().commit();

        ObjectMapper mapper = new ObjectMapper();
        // mapper.writeValue(out, value);
        
//        em.createQuery("SELECT c FROM Pizza c").getResultList().forEach(System.out::println);
        // try {
                em.createQuery("SELECT c FROM Cliente c ")
                .getResultList()
                .forEach(System.out::println);
        // } catch (Exception | IOException | JsonGenerationException |JsonMappingException  e) {
        //         //TODO: handle exception
        // }
        
//        Pedido pedido1 = em.find(Pedido.class, 1L);
//        System.out.println(pedido1);
//        pedido1.getValorTotal();
//        
//        List<Pizza> resultList = em.createQuery("SELECT c FROM Pizza c").getResultList();
//        Optional<BigDecimal> map = resultList.get(0).getPrecos().stream().filter(p -> p.getTipoDePizza().equals(TipoDePizza.GRANDE)).findFirst().map(p -> p.getPreco());
//        System.out.println(map.get());
////        em.createQuery("SELECT c FROM Item c").getResultList().forEach((Item i) -> i.getPizza().pegarValorPizza(i.getTipoDePizza()));
//        
        em.close();
        
        emf.close();
//
//        
//        Pizza mussarela = new Pizza(1, "Mussarela", "Pizza de mussarela, com rodelas de tomates", BigDecimal.valueOf(30.0));
//        Pizza calabresa = new Pizza(2, "Calabresa", "Pizza de calabresa, com cebolas", BigDecimal.valueOf(30.0));
//        
//        Stream.of(calabresa, mussarela)
//                .sorted(Comparator.comparing(Pizza::getNome))
//                .forEach(System.out::println);
    }
    
}
