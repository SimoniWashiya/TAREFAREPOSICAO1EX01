
package model;

public class IngressoVip extends Ingresso {

 private String funcaoDesempenhada;

 public IngressoVip(String codigoIdentificador, float valor, String funcaoDesempenhada) {
     super(codigoIdentificador, valor);
     this.funcaoDesempenhada = funcaoDesempenhada;
 }
 
 @Override
 public float valorFinal(float taxaConveniencia) {
  
     return super.valorFinal(taxaConveniencia) * 1.18f;
 }

 public String getFuncaoDesempenhada() {
     return funcaoDesempenhada;
 }

 public void setFuncaoDesempenhada(String funcaoDesempenhada) {
     this.funcaoDesempenhada = funcaoDesempenhada;
 }
}

