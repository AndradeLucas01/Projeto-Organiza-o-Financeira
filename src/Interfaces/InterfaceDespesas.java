package Interfaces;

import Entidades.Transactions.Despesa;
import java.util.List;

public interface InterfaceDespesas {
    void salvar(Despesa despesa);
    void remover(Despesa despesa);
    void alterar(int id, Despesa novaDespesa);
    List<Despesa> listar();
}
