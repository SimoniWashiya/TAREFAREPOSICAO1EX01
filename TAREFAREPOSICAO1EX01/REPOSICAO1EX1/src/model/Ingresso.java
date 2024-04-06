package model;

//Classe principal que representa um ingresso
public class Ingresso {
 // Atributos privados
 private String codigoIdentificador;
 private float valor;

 // Construtor
 public Ingresso(String codigoIdentificador, float valor) {
     this.codigoIdentificador = codigoIdentificador;
     this.valor = valor;
 }

 // Método para calcular o valor final do ingresso com taxa de conveniência
 public float valorFinal(float taxaConveniencia) {
     return this.valor + taxaConveniencia;
 }

 // Getters e Setters
 public String getCodigoIdentificador() {
     return codigoIdentificador;
 }

 public void setCodigoIdentificador(String codigoIdentificador) {
     this.codigoIdentificador = codigoIdentificador;
 }

 public float getValor() {
     return valor;
 }

 public void setValor(float valor) {
     this.valor = valor;
 }
}
