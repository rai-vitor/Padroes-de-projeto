package teste;

import Ponto.ControleDePonto;
import Ponto.ControleDePontoAdapter;
import Ponto.Funcionario;

/**
 * Classe Cliente
 */
public class TesteControleDePonto {
    public static void main ( String [] args ) throws InterruptedException {
        //ControleDePonto controleDePonto = new ControleDePonto ();
        ControleDePonto controleDePonto = new ControleDePontoAdapter();
        Funcionario funcionario = new Funcionario ("Raí Vitor");
        controleDePonto.registrarEntrada(funcionario);
        Thread.sleep(3000) ;
        controleDePonto.registrarSaida( funcionario );
    }
}