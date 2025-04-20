package br.com.semaforos.semaforos_inteligentes.service;

import br.com.semaforos.semaforos_inteligentes.model.Cruzamento;
import br.com.semaforos.semaforos_inteligentes.repository.CruzamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CruzamentoService {

    private final CruzamentoRepository repository;

    public CruzamentoService(CruzamentoRepository repository) {
        this.repository = repository;
    }

    public Cruzamento salvar(Cruzamento cruzamento) {
        return repository.save(cruzamento);
    }

    public List<Cruzamento> listarTodos() {
        return repository.findAll();
    }

    public Optional<Cruzamento> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
