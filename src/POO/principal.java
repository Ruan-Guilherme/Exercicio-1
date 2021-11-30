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
      
      Carro.setCor("vermelho");
      Carro.setNumporta(4);
      Carro.setTipo("mercedes");
      Carro.setPlaca("NEF-1501");
       
      Pessoa p = new Pessoa();
      
      p.setNome("Carlos");
      p.setCorDosOlhos("Azul");
      p.setIdade(18);
      p.setDataDeNacimento("30/11/2003");
      
      
      p.setCarro(Carro);
      p.ligarCarro();
      p.setCambioMarcha(1);
      p.acelerarCarro();
      p.setCambioMarcha(2);
      p.acelerarCarro();
      p.setCambioMarcha(3);
      p.acelerarCarro();
      p.setCambioMarcha(4);
      System.out.println("");
      
      p.getCarro().getCambio();
      
      
      Carro.setDono(p);
      
       Carro.imprimeDadosCarro();
       p.imprimirDadosPessoa();
       
       

              
               }
}
