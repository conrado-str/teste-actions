package br.com.semaforos.semaforos_inteligentes.repository;

import br.com.semaforos.semaforos_inteligentes.model.StatusSemaforo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusSemaforoRepository extends JpaRepository<StatusSemaforo, Long> {
}
