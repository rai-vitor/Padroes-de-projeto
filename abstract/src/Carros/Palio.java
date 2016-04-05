package Carros;


import Abstract.CarroPopular;

/**
 * Concret Product A1
 */
public class Palio implements CarroPopular {
    
    public Palio(){
        exibirInfoPopular();
    }
    
    @Override
    public void exibirInfoPopular() {
        System.out.println("Modelo: Palio\nFábrica: Fiat\nCategoria:Popular\n");
    }

}
