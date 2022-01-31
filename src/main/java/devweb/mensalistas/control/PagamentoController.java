package devweb.mensalistas.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import devweb.mensalistas.model.Pagamento;
import devweb.mensalistas.repository.PagamentoRepository;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @GetMapping("/")
    public Iterable<Pagamento> listar() {
        return this.pagamentoRepository.findAll();
    }
}