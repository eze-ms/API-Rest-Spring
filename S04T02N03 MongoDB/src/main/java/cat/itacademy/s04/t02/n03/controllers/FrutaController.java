package cat.itacademy.s04.t02.n03.controllers;

import cat.itacademy.s04.t02.n03.model.Fruta;
import cat.itacademy.s04.t02.n03.services.FrutaService;
import cat.itacademy.s04.t02.n03.exception.FrutaNotFoundException;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruta")
public class FrutaController {

    private final FrutaService frutaService;

    public FrutaController(FrutaService frutaService) {
        this.frutaService = frutaService;
    }

    @PostMapping("/add")
    public ResponseEntity<Fruta> addFruta(@Valid @RequestBody Fruta fruta)  {
        return ResponseEntity.ok(frutaService.save(fruta));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Fruta> updateFruta(@PathVariable String id, @RequestBody Fruta fruta) {
        return ResponseEntity.ok(frutaService.update(id, fruta));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFruta(@PathVariable String id)  {
        frutaService.remove(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruta> getFrutaById(@PathVariable String id)  {
        return ResponseEntity.ok(frutaService.findById(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruta>> getAllFrutas() {
        return ResponseEntity.ok(frutaService.findAll());
    }
}
