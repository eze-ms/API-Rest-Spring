package cat.itacademy.s04.t02.n02.controllers;

import cat.itacademy.s04.t02.n02.model.Fruta;
import cat.itacademy.s04.t02.n02.services.FrutaService;
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
    public ResponseEntity<Fruta> addFruta(@Valid @RequestBody Fruta fruta) {
        return ResponseEntity.ok(frutaService.save(fruta));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Fruta> updateFruta(@PathVariable int id, @RequestBody Fruta fruta) {
        return ResponseEntity.ok(frutaService.update(id, fruta));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFruta(@PathVariable int id) {
        frutaService.remove(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruta> getFrutaById(@PathVariable int id) {
        return ResponseEntity.ok(frutaService.findById(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruta>> getAllFrutas() {
        return ResponseEntity.ok(frutaService.findAll());
    }
}
