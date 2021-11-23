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
public class principal {

    public static void main(String[] args) {

        carro Carro = new carro();

        Carro.setCor("Azul");
        Carro.setNumporta(4);
        Carro.setPlaca("NFT-2488");
        Carro.setTipo("gol");
        
        //Carro.imprimeDadosCarro();
        
        double a=3, b=2;
        System.out.println("quadrado de "+a+" e: "+ Calculo.elevar(a, b));
       
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Carlos");
        pessoa.setCorDosOlhos("Verde");
        pessoa.setIdade(17);
        pessoa.setDataDeNacimento("30/05/2004");

        pessoa.imprimirDadosPessoa();
    }

}
