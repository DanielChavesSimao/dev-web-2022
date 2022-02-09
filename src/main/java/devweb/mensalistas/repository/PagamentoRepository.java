package devweb.mensalistas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import devweb.mensalistas.model.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
    // Iterable<Pagamento> findByCodJogador(long cod_jogador);
}