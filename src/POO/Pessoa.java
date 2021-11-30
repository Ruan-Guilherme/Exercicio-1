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
public class Pessoa {

    String nome;
    String CorDosOlhos;
    int idade;
    String DataDeNacimento;
    carro Carro;
    
    void ligarCarro(){
        Carro.ligar();
    }
    void desligarCarro(){
        Carro.Desligar();
    }
    void acelerarCarro(){
        Carro.Acelerar();
    }
    void frearCarro(){
        Carro.Frear();
    }
    void setCambioMarcha(int marcha){
        Carro.setCambio(marcha);   
    }
    
    
    void imprimirDadosPessoa(){
        System.out.println("----------PESSOA----------");
        System.out.println("Nome: " + nome);
        System.out.println("Cor dos olhos: " + CorDosOlhos);
        System.out.println("Idade: " + idade);
        System.out.println("Date de nacimento: " + DataDeNacimento);
        

    }

    public carro getCarro() {
        return Carro;
    }

    public void setCarro(carro Carro) {
        this.Carro = Carro;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorDosOlhos() {
        return CorDosOlhos;
    }

    public void setCorDosOlhos(String CorDosOlhos) {
        this.CorDosOlhos = CorDosOlhos;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataDeNacimento() {
        return DataDeNacimento;
    }

    public void setDataDeNacimento(String DataDeNacimento) {
        this.DataDeNacimento = DataDeNacimento;
    }
    
    
}
