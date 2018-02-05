/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.redonda.model;

import br.com.redonda.builder.ClienteBuilder;
import br.com.redonda.builder.PedidoBuilder;
import br.com.redonda.builder.EnderecoBuilder;
import br.com.redonda.builder.ItemBuilder;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author eduardo
 */
public class PedidoTest {

    private Pedido pedido;
    private Endereco endereco;
    private Cliente cliente;
    private Item item1;
    private Item item2;

    @Before
    public void setUp() {
        this.endereco = new EnderecoBuilder()
                .comRua("Rua Teste")
                .comNumero(123)
                .comBairro("Jd. Testezinho")
                .comReferencia("proximo ao campo")
                .criar();
        this.cliente = new ClienteBuilder()
                .comTelefone("1234-3214")
                .comNome("Maria")
                .comEnderecos(this.endereco)
                .criar();
        this.item1 = new ItemBuilder()
                .criarPizza("Mussarela")
                .precos(14.0, 20.0, 28.0)
                .comBordaDe("Alho")
                .tamanhoPizza(TipoDePizza.GRANDE)
                .comQuantidade(2)
                .comObservacao("Bastante Molho")
                .criar();
        this.item2 = new ItemBuilder()
                .criarPizza("Calabresa")
                .precos(14.0, 20.0, 28.0)
                .comBordaDe("Alho")
                .tamanhoPizza(TipoDePizza.MEDIA)
                .comQuantidade(1)
                .comObservacao("Bastante Molho")
                .criar();
        pedido = new PedidoBuilder()
                .comEndereco(endereco)
                .comCliente(cliente)
                .comItens(item1, item2)
                .criar();

    }

    @Test
    public void testValorTotalDoPedido() {
        BigDecimal valorTotal = pedido.getValorTotal();
        Assert.assertEquals(76.0, valorTotal.doubleValue(), 0.000001);
    }

    @Test
    public void testQuantidadeDePizzasNoPedido() {
        int quantidade = pedido.getQuantidadeDePizza();
        Assert.assertEquals(3, quantidade);
    }
    
    @Test
    public void testNomeETelefoneCliente() {
        String nome = pedido.getCliente().getNome();
        String telefone = pedido.getCliente().getTelefone();
        
        Assert.assertEquals("Maria", nome);
        Assert.assertEquals("1234-3214", telefone);
        
    }
    
    @Test
    public void testEnderecoCliente() {
        String rua = pedido.getEndereco().getRua();
        int numero = pedido.getEndereco().getNumero();
        String bairro = pedido.getEndereco().getBairro();
        String referencia = pedido.getEndereco().getReferencia();
        
        Assert.assertEquals("Rua Teste", rua);
        Assert.assertEquals(123, numero);
        Assert.assertEquals("Jd. Testezinho", bairro);
        Assert.assertEquals("proximo ao campo", referencia);
        
    }


}
