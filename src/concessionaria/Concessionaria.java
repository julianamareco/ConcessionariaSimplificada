/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria;

/**
 * Classe que modela o comportamento da Concessionária Alegrete.
 * @author alinemello
 */
public class Concessionaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        inicializaEstoque(estoque);
        
        Carro carroDesejado = new Carro("", 41000, "Gol 1.4", 0);
        Carro carro = estoque.procura(carroDesejado);
        if(carro != null){
            System.out.println("Talvez você goste deste carro:");
            System.out.println("Chassi: " + carro.getChassi());
            System.out.println("Modelo: " + carro.getModelo());
            System.out.println("Numero de Portas: " +carro.getNroPortas());
            System.out.println("Preco: "+carro.getPreco());
        }
        else{
            System.out.println("Desculpe, não temos nenhum carro para você");
        }
    }
    
    /**
     * Inicializa o estoque, adicionando carros.
     * @param estoque 
     */
    private static void inicializaEstoque(Estoque estoque){
        estoque.addCarro("9BWZZZ377VT004251", 45999.00, "Gol 1.4", 4);
        estoque.addCarro("9BWZZZ377VT004252", 75600.00, "Golf", 4);
        estoque.addCarro("9BWZZZ377VT004253", 40999.00, "Gol 1.4", 2);
        estoque.addCarro("9BWZZZ377VT004254", 25999.00, "Golf", 4);
    }
    
}
