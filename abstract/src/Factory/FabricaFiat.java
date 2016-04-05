package Factory;


import Carros.Palio;
import Carros.Siena;
import Abstract.FabricaDeCarro;
import Abstract.CarroSedan;
import Abstract.CarroPopular;

/**
 * Concrete Factory 1
 */
public class FabricaFiat implements FabricaDeCarro {

    @Override
    public CarroSedan criarCarroSedan() {
        return new Siena();
    }

    @Override
    public CarroPopular criarCarroPopular() {
        return new Palio();
    }

}
