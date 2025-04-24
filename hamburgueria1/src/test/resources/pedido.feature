# language: pt

Funcionalidade: Pedido de hambúrguer

  Cenário: Cliente faz um pedido válido
    Dado que o cardápio está carregado
    Quando o cliente pedir o hambúrguer "Cheddar Bacon"
    Então o sistema deve confirmar o pedido de "Cheddar Bacon"

  Cenário: Cliente pede um hambúrguer que não existe
    Dado que o cardápio está carregado
    Quando o cliente pedir o hambúrguer "X-Salada"
    Então o sistema deve informar que o hambúrguer não está disponível
