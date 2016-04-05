package Carros;


import Abstract.CarroSedan;

/**
 * Abstract Product B1
 */
public class FiestaSedan implements CarroSedan {
    
    public FiestaSedan(){
        exibirInfoSedan();
    }
    
    @Override
    public void exibirInfoSedan() {
        System.out.println("Modelo: Fiesta\nFábrica:Ford\nCategoria:Sedan\n");
    }

}
