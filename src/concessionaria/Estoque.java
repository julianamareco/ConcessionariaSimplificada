/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe estoque possui a relação de carros da concessionária.
 * @author alinemello
 */
public class Estoque {
    private List<Carro> carros;
    
    
    public Estoque(){
        carros = new ArrayList();
    }
    
    /**
     * Adiciona um carro no estoque com as características informadas por parâmetro.
     * @param chassi Número do chassi.
     * @param preco Preço.
     * @param modelo Modelo
     * @param nroPortas Número de portas.
     */
    public void addCarro(String chassi, double preco, String modelo, int nroPortas){
        Carro carro = new Carro(chassi, preco, modelo, nroPortas);
        carros.add(carro);
    }
    
    /**
     * Captura o carro com o chassi informado.
     * @param chassi Número de chassi.
     * @return Carro que possui o chassi informado. Caso nenhum carro possua o 
     * chassi informado então retorna null. 
     */
    public Carro getCarro(String chassi){
        for(Carro carro : carros){
            if(carro.getChassi().equalsIgnoreCase(chassi))
                return carro;
        }
        return null;
    }
    
    /**
     * Procura um carro com as mesmas características do carroDesejado.
     * @param carroDesejado Carro com as características desejadas.
     * @return Retorna o carro com as características desejadas. Caso não exista
     * nenhum carro que atenda todas as características então retorna null.
     */
    public Carro procura(Carro carroDesejado){
        String modeloDesejado = carroDesejado.getModelo();
        int nroPortasDesejado = carroDesejado.getNroPortas();
        double precoDesejado = carroDesejado.getPreco();
                
        for(Carro carro : carros){
            if((modeloDesejado != null) && (!modeloDesejado.equals("")) && (!modeloDesejado.equals(carro.getModelo())))
                continue;
            if((nroPortasDesejado != 0) && (nroPortasDesejado != carro.getNroPortas()))
                continue;
            if((precoDesejado != 0) && (precoDesejado < carro.getPreco()))
                continue;
            return carro;
        }
        return null;
    }
}
