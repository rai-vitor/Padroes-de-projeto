package Ponto;

/**
 * Classe Adapter
 */
public class ControleDePontoAdapter extends ControleDePontoNovo implements ControleDePonto {
    @Override
    public void registrarEntrada(Funcionario f) {
        this.registra(f, true);
    }

    @Override
    public void registrarSaida(Funcionario f) {
        this.registra(f, false);
    }
}
