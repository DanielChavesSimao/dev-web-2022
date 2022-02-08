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

import devweb.mensalistas.model.Pagamento;
import devweb.mensalistas.repository.PagamentoRepository;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @GetMapping("")
    public ResponseEntity<List<Pagamento>> listar() {
        try {
            List<Pagamento> pagamentos = new ArrayList<Pagamento>();
            this.pagamentoRepository.findAll().forEach(pagamentos::add);

            if (pagamentos.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(pagamentos, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("")
    public ResponseEntity<Pagamento> criar(@RequestBody Pagamento pagamento) {
        try {
            Pagamento novoPagamento = this.pagamentoRepository.save(new Pagamento(pagamento.getAno(), pagamento.getMes(), pagamento.getValor()));
            
            return new ResponseEntity<>(novoPagamento, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pagamento> show(@PathVariable long id) {
        Optional<Pagamento> data = this.pagamentoRepository.findById(id);

        if (data.isPresent())
            return new ResponseEntity<>(data.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}