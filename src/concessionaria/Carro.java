/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria;

/**
 * A classe Carro contém as informações referente a um carro.
 * @author alinemello
 */
public class Carro {
   private String chassi;
   private double preco;
   private String modelo;
   private int nroPortas;

   /**
    * Contrutor que inicializa os atributos de um carro com as informações passadas por prâmetros.
    * @param chassi Chassi
    * @param preco Preço
    * @param modelo Modelo
    * @param nroPortas Número de Portas
    */
   public Carro(String chassi, double preco, String modelo, int nroPortas){
       this.chassi = chassi;
       this.preco = preco;
       this.modelo = modelo;
       this.nroPortas = nroPortas;
   }
   
    /**
     * @return the chassi
     */
    public String getChassi() {
        return chassi;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the nroPortas
     */
    public int getNroPortas() {
        return nroPortas;
    }

    /**
     * @param nroPortas the nroPortas to set
     */
    public void setNroPortas(int nroPortas) {
        this.nroPortas = nroPortas;
    }
   
   
}
