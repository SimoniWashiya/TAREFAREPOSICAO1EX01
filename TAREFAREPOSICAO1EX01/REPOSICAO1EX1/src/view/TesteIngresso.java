package view;

import model.Ingresso;
import model.IngressoVip;


public class TesteIngresso {
    public static void main(String[] args) {
       
        Ingresso ingressoComum = new Ingresso("A001", 50.0f);
    
        float valorFinalComum = ingressoComum.valorFinal(5.0f);
        System.out.println("Valor final do ingresso comum: R$" + valorFinalComum);

    
        IngressoVip ingressoVip = new IngressoVip("V001", 100.0f, "VIP Gold");
    
        float valorFinalVIP = ingressoVip.valorFinal(5.0f);
        System.out.println("Valor final do ingresso VIP: R$" + valorFinalVIP);
    }
}
