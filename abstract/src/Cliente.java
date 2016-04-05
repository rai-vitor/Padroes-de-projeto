
import Factory.FabricaFiat;
import Factory.FabricaFord;
import Abstract.FabricaDeCarro;
import Abstract.CarroSedan;
import Abstract.CarroPopular;

/**
 * Cliente
 */
public class Cliente {

    public static void main(String[] args) {
        FabricaDeCarro fabrica = new FabricaFiat();
        CarroSedan sedan = fabrica.criarCarroSedan();
        CarroPopular popular = fabrica.criarCarroPopular();

        fabrica = new FabricaFord(); /* Criando uma fábrica de outra familia */ 
        sedan = fabrica.criarCarroSedan();
        popular = fabrica.criarCarroPopular();
    }
}
