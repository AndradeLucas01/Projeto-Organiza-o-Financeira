package Servicos;

import Entidades.Transactions.Despesa;
import Interfaces.InterfaceDespesas;
import Repositorios.DepesasRepository;
import java.util.List;

public class DepesasService implements InterfaceDespesas {

    private final DepesasRepository despesasRepositorio;
    
    public DepesasService(DepesasRepository despesasRepositorio) {
        this.despesasRepositorio = despesasRepositorio;
    }
    
    @Override
    public void salvar(Despesa despesa) {
        despesasRepositorio.salvar(despesa);
    }
    
    @Override
    public void remover(Despesa despesa) {
        despesasRepositorio.remover(despesa);
    }
    
    @Override
    public void alterar(int id, Despesa novaDespesa) {
        despesasRepositorio.alterar(id, novaDespesa);
    }
    
    @Override
    public List<Despesa> listar() {
        return despesasRepositorio.listar();
    }
    
    public void exibirDespesas() {
        despesasRepositorio.listar().forEach(System.out::println);
    }
}