package Abstract;


import Abstract.CarroSedan;
import Abstract.CarroPopular;

/**
 * Abstract Factory
 */
public interface FabricaDeCarro {

    CarroSedan criarCarroSedan();

    CarroPopular criarCarroPopular();
}
