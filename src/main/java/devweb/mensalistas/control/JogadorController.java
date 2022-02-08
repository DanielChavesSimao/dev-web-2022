package devweb.mensalistas.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import devweb.mensalistas.model.Jogador;
import devweb.mensalistas.model.Pagamento;
import devweb.mensalistas.repository.JogadorRepository;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {
    @Autowired
    private JogadorRepository jogadorRepository;

    @GetMapping("")
    public ResponseEntity<List<Jogador>> listar() {
        try {
            List<Jogador> jogadores = new ArrayList<Jogador>();
            this.jogadorRepository.findAll().forEach(jogadores::add);

            if (jogadores.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(jogadores, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("")
    public ResponseEntity<Jogador> criar(@RequestBody Jogador jogador) {
        try {
            Jogador novoJogador = this.jogadorRepository.save(new Jogador(jogador.getNome(), jogador.getEmail(), jogador.getDataNasc()));
            
            return new ResponseEntity<>(novoJogador, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Jogador> show(@PathVariable long id) {
        Optional<Jogador> data = this.jogadorRepository.findById(id);

        if (data.isPresent())
            return new ResponseEntity<>(data.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{id}/pagamentos")
    public ResponseEntity<List<Pagamento>> showPagamentosDoJogador(@PathVariable long id) {
        Optional<Jogador> jogador = this.jogadorRepository.findById(id);

        if (jogador.isPresent()){
            List<Pagamento> pagamentos = jogador.get().getPagamentos();

            if (pagamentos.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(pagamentos, HttpStatus.OK);
        }

        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}