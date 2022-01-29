package devweb.mensalistas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import devweb.mensalistas.model.Jogador;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
    
}