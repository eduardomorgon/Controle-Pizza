/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.redonda.builder;

import br.com.redonda.model.Endereco;

/**
 *
 * @author eduardo
 */
public class EnderecoBuilder {

    private String rua = "";
    private int numero;
    private String bairro = "";
    private String referencia = "";
    
    public EnderecoBuilder comRua(String rua) {
        this.rua = rua;
        return this;
    }
    
    public EnderecoBuilder comNumero(int numero) {
        this.numero = numero;
        return this;
    }
    
    public EnderecoBuilder comBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }
    
    public EnderecoBuilder comReferencia(String referencia) {
        this.referencia = referencia;
        return this;
    }
    
    public Endereco criar() {
        return new Endereco(rua, numero, bairro, referencia);
    }
    
    
}
