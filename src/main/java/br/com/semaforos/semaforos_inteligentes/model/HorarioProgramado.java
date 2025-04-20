package br.com.semaforos.semaforos_inteligentes.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

@Entity
@Data
public class HorarioProgramado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalTime horarioInicio;

    private LocalTime horarioFim;

    @ManyToOne
    @JoinColumn(name = "semaforo_id")
    private Semaforo semaforo;
}
