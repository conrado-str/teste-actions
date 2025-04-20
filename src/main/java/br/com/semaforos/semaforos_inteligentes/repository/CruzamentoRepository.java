package br.com.semaforos.semaforos_inteligentes.repository;

import br.com.semaforos.semaforos_inteligentes.model.Cruzamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CruzamentoRepository extends JpaRepository<Cruzamento, Long> {
}
