package br.com.semaforos.semaforos_inteligentes.repository;

import br.com.semaforos.semaforos_inteligentes.model.Semaforo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemaforoRepository extends JpaRepository<Semaforo, Long> {
}
