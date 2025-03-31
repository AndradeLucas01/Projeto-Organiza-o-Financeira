package Repositorios;

import Entidades.Transactions.Transacoes;
import Entidades.Users.Pessoa;
import java.util.ArrayList;

public class TransacoesRepository {

    private final ArrayList<Transacoes> transacoes;

    public TransacoesRepository() {
        this.transacoes = new ArrayList<>();
    }

    public void adicionarTransacao(Transacoes transacao) {
        if (transacao == null) {
            throw new IllegalArgumentException("Transação não pode ser nula");
        }
        
        try {
            transacao.setCategoria(transacao.getCategoria());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Não foi possível adicionar a transação: " + e.getMessage());
        }
        
        transacoes.add(transacao);
    }

    public void listarTransacoes() {
        if (transacoes.isEmpty()) {
            System.out.println("Nenhuma transação registrada.");
        } else {
            System.out.println("📜 Histórico de Transações:");
            for (Transacoes t : transacoes) {
                t.exibirDetalhes();
                System.out.println("----------------------");
            }
        }
    }

    public void listarTransacoesPorPessoa(Pessoa pessoa) {
        if (pessoa == null) {
            throw new IllegalArgumentException("Pessoa não pode ser nula");
        }
        System.out.println("📜 Histórico de Transações da " + pessoa.getNome() + ":");
        for (Transacoes t : transacoes) {
            if (t.getUsuario().equals(pessoa)) {
                t.exibirDetalhes();
                System.out.println("----------------------");
            }
        }
    }
}