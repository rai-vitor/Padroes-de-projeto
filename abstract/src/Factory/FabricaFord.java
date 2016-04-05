package Factory;


import Carros.Fiesta;
import Carros.FiestaSedan;
import Abstract.FabricaDeCarro;
import Abstract.CarroSedan;
import Abstract.CarroPopular;

/**
 * Concrete Factory 2
 */
public class FabricaFord implements FabricaDeCarro {

    @Override
    public CarroSedan criarCarroSedan() {
        return new FiestaSedan();
    }

    @Override
    public CarroPopular criarCarroPopular() {
        return new Fiesta();
    }

}
