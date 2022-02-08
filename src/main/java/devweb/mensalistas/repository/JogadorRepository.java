package devweb.mensalistas.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import devweb.mensalistas.model.Jogador;


public interface JogadorRepository extends CrudRepository<Jogador, Long> {
    List<Jogador> findByNomeContaining(String nome);

    Optional<Jogador> findById(long cod_jogador);
}