package steps;

import static org.junit.Assert.*;
import io.cucumber.java.pt.*;
import java.util.*;

public class PedidoSteps {
    private List<String> cardapio;
    private String pedido;
    private String resposta;

    @Dado("que o cardápio está carregado")
    public void que_o_cardapio_esta_carregado() {
        cardapio = Arrays.asList("Cheddar Bacon", "X-Salada", "X-Burguer");
    }

    @Quando("o cliente pedir o hambúrguer {string}")
    public void o_cliente_pedir_o_hamburguer(String nome) {
        pedido = nome;
        if (cardapio.contains(nome)) {
            resposta = "Pedido confirmado: " + nome;
        } else {
            resposta = "Desculpe, o hambúrguer não está disponível";
        }
    }

    @Então("o sistema deve confirmar o pedido de {string}")
    public void o_sistema_deve_confirmar_o_pedido(String nome) {
        assertEquals("Pedido confirmado: " + nome, resposta);
    }

    @Então("o sistema deve informar que o hambúrguer não está disponível")
    public void o_sistema_deve_informar_que_o_hamburguer_nao_esta_disponivel() {
        assertEquals("Desculpe, o hambúrguer não está disponível", resposta);
    }
}

