package Carros;


import Abstract.CarroPopular;

/**
 * Concret Product A2
 */
public class Fiesta implements CarroPopular {
    
    public Fiesta(){
        exibirInfoPopular();
    }

    @Override
    public void exibirInfoPopular() {
        System.out.println("Modelo: Fiesta\nFábrica: Ford\nCategoria:Popular\n");
    }
}
