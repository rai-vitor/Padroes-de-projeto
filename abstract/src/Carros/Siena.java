package Carros;


import Abstract.CarroSedan;

/**
 * Abstract Product B2
 */
public class Siena implements CarroSedan {

    public Siena(){
        exibirInfoSedan();
    }
        
    @Override
    public void exibirInfoSedan() {
        System.out.println("Modelo: Siena\nFábrica: Fiat\nCategoria:Sedan\n");
    }

}
