package br.com.semaforos.semaforos_inteligentes.repository;

import br.com.semaforos.semaforos_inteligentes.model.HorarioProgramado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorarioProgramadoRepository extends JpaRepository<HorarioProgramado, Long> {
}
