package Repositorios;

import Entidades.Transactions.Despesa;
import Interfaces.InterfaceDespesas;
import java.util.ArrayList;
import java.util.List;

public class DepesasRepository implements InterfaceDespesas {
    private final ArrayList<Despesa> listaDespesas;
    
    public DepesasRepository() {
        this.listaDespesas = new ArrayList<>();
    }
    
    public DepesasRepository(ArrayList<Despesa> despesas) {
        this.listaDespesas = despesas;
    }

    @Override
    public void salvar(Despesa despesa) {
        this.listaDespesas.add(despesa);
    }

    @Override
    public void alterar(int id, Despesa novaDespesa) {
        for (int i = 0; i < listaDespesas.size(); i++) {
            if (listaDespesas.get(i).getId() == id) {
                listaDespesas.set(i, novaDespesa);
                return;
            }
        }
    }

    @Override
    public void remover(Despesa despesa) {
        this.listaDespesas.remove(despesa);
    }

    @Override
    public List<Despesa> listar() {
        return listaDespesas;
    }
}