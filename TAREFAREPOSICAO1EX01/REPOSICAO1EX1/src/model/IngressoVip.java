
package model;

//Subclasse que representa um ingresso VIP
public class IngressoVip extends Ingresso {
 // Atributo adicional para fun��o desempenhada
 private String funcaoDesempenhada;

 // Construtor
 public IngressoVip(String codigoIdentificador, float valor, String funcaoDesempenhada) {
     super(codigoIdentificador, valor);
     this.funcaoDesempenhada = funcaoDesempenhada;
 }

 // Sobrescrevendo o m�todo valorFinal para aplicar a taxa de 18% para VIPs
 @Override
 public float valorFinal(float taxaConveniencia) {
     // Calcula o valor final com a taxa de conveni�ncia e adiciona 18% para VIPs
     return super.valorFinal(taxaConveniencia) * 1.18f;
 }

 // Getter e Setter para a fun��o desempenhada
 public String getFuncaoDesempenhada() {
     return funcaoDesempenhada;
 }

 public void setFuncaoDesempenhada(String funcaoDesempenhada) {
     this.funcaoDesempenhada = funcaoDesempenhada;
 }
}

