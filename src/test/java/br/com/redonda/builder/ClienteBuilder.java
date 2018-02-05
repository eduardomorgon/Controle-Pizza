/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.redonda.builder;

import br.com.redonda.model.Cliente;
import br.com.redonda.model.Endereco;

/**
 *
 * @author eduardo
 */
public class ClienteBuilder {
    
    private String telefone;
    private String nome;
    private Endereco endereco;
    
    public ClienteBuilder comTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }
    
    public ClienteBuilder comNome(String nome) {
        this.nome = nome;
        return this;
    }
    public ClienteBuilder comEnderecos(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }
    
    public Cliente criar() {
        return new Cliente(telefone, nome, endereco);
    }
    
}
