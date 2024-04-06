package view;

import model.Ingresso;
import model.IngressoVip;

// Classe de teste para as implementações de Ingresso e IngressoVIP
public class TesteIngresso {
    public static void main(String[] args) {
        // Criando um ingresso comum
        Ingresso ingressoComum = new Ingresso("A001", 50.0f);
        // Calculando o valor final com uma taxa de conveniência de 5%
        float valorFinalComum = ingressoComum.valorFinal(5.0f);
        System.out.println("Valor final do ingresso comum: R$" + valorFinalComum);

        // Criando um ingresso VIP
        IngressoVip ingressoVip = new IngressoVip("V001", 100.0f, "VIP Gold");
        // Calculando o valor final com uma taxa de conveniência de 5%
        float valorFinalVIP = ingressoVip.valorFinal(5.0f);
        System.out.println("Valor final do ingresso VIP: R$" + valorFinalVIP);
    }
}
