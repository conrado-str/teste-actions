package br.com.semaforos.semaforos_inteligentes.controller;

import br.com.semaforos.semaforos_inteligentes.model.HorarioProgramado;
import br.com.semaforos.semaforos_inteligentes.service.HorarioProgramadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/horarios-programados")
public class HorarioProgramadoController {

    @Autowired
    private HorarioProgramadoService service;

    @PostMapping
    public HorarioProgramado salvar(@RequestBody HorarioProgramado horario) {
        return service.salvar(horario);
    }

    @GetMapping
    public List<HorarioProgramado> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<HorarioProgramado> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
