package devweb.mensalistas.repository;

import org.springframework.data.repository.CrudRepository;

import devweb.mensalistas.model.Pagamento;

public interface PagamentoRepository extends CrudRepository<Pagamento, Long> {
    // Iterable<Pagamento> findByCodJogador(long cod_jogador);
}