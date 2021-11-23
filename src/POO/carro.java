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

    public carro(String tipo, String cor, String placa, int numporta) {
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.numporta = numporta;
    }

    void imprimeDadosCarro() {
        System.out.println("----------CARRO----------");
        System.out.println("Cor do Carro: " + cor);
        System.out.println("Numero de porta: " + numporta);
        System.out.println("Placa do carro: " + placa);
        System.out.println("Modelo de carro: " + tipo);

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

}
