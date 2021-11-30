/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author IFSC
 */
public class carro {

    String tipo;
    String cor;
    String placa;
    int numporta;
    int Cambio;
     Pessoa dono;
    
    void ligar(){
        System.out.println("Ligando   Carro");
    }
    void Desligar(){
        System.out.println("Desligando  Carro");
    }
    void Acelerar(){
        System.out.println("Acelerando  Carro");
    }
    void Frear(){
        System.out.println("Freando  Carro");
    }
    
   

    
    public carro(){
        
    }
    

    void imprimeDadosCarro() {
        System.out.println("----------CARRO----------");
        System.out.println("Cor do Carro: " + cor);
        System.out.println("Numero de porta: " + numporta);
        System.out.println("Placa do carro: " + placa);
        System.out.println("Modelo de carro: " + tipo);
        System.out.println("Dono: "+dono.nome);

    }

    public int getCambio() {
        System.out.println("Marcha: "+this.Cambio);
        return Cambio;
    }

    public void setCambio(int cambio) {
        this.Cambio = cambio;
    }
    
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumporta() {
        return numporta;
    }

    public void setNumporta(int numporta) {
        this.numporta = numporta;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }
    

}
