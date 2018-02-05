/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.redonda.builder;

import br.com.redonda.model.Cliente;
import br.com.redonda.model.Endereco;
import br.com.redonda.model.Item;
import br.com.redonda.model.Pedido;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class PedidoBuilder {
    
    private List<Item> itens = new ArrayList<>();
    private Cliente cliente;
    private Endereco endereco;

    public PedidoBuilder() {
    }

    public PedidoBuilder comEndereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    public PedidoBuilder comCliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }

    public PedidoBuilder comItens(Item ...item) {
        itens.addAll(Arrays.asList(item));
        return this;
    }

    public Pedido criar() {
        return new Pedido(cliente, endereco, itens);
    }
    
}
