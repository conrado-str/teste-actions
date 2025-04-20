package br.com.semaforos.semaforos_inteligentes.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "semaforo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Semaforo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "semaforo_seq")
    @SequenceGenerator(name = "semaforo_seq", sequenceName = "seq_semaforo", allocationSize = 1)
    private Long id;

    @Column(nullable = false)
    private String identificador;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cruzamento_id", nullable = false)
    private Cruzamento cruzamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "status_id", nullable = false)
    private StatusSemaforo status;
}
