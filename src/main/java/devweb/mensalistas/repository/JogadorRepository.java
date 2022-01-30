package devweb.mensalistas.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import devweb.mensalistas.model.Jogador;


public interface JogadorRepository extends CrudRepository<Jogador, Long> {
    List<Jogador> findByNome(String nome);

    Jogador findById(long cod_jogador);
}