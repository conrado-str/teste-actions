package br.com.semaforos.semaforos_inteligentes.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class StatusSemaforo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
}
