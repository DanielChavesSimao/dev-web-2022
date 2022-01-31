package devweb.mensalistas.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import devweb.mensalistas.model.Jogador;
import devweb.mensalistas.model.Pagamento;
import devweb.mensalistas.repository.JogadorRepository;
import devweb.mensalistas.repository.PagamentoRepository;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {
    @Autowired
    private JogadorRepository jogadorRepository;

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @GetMapping("/")
    public Iterable<Jogador> listar() {
        return this.jogadorRepository.findAll();
    } 

    @GetMapping("/{id}")
    public Jogador show(@PathVariable long id) {
        return this.jogadorRepository.findById(id);
    }

    /* @GetMapping("/{id}/pagamentos")
    public Iterable<Pagamento> showPagamentosDoJogador(@PathVariable long id) {
        return this.pagamentoRepository.findByCodJogador(id);
    } */
}