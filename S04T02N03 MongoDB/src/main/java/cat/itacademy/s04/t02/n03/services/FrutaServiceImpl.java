package cat.itacademy.s04.t02.n03.services;

import cat.itacademy.s04.t02.n03.exception.FrutaNotFoundException;
import cat.itacademy.s04.t02.n03.model.Fruta;
import cat.itacademy.s04.t02.n03.repository.FrutaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FrutaServiceImpl implements FrutaService {

    private final FrutaRepository repository;

    public FrutaServiceImpl(FrutaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Fruta> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Fruta findById(String id)  {
        return repository.findById(id)
                .orElseThrow(() -> new FrutaNotFoundException("La fruta con id " + id + " no fue encontrada."));
    }

    @Override
    public Fruta save(Fruta fruta) {
        return repository.save(fruta);
    }

    @Override
    public Fruta update(String id, Fruta fruta) {
        Fruta existingFruta = findById(id);
        existingFruta.setNom(fruta.getNom());
        existingFruta.setQuantitatQuilos(fruta.getQuantitatQuilos());
        return repository.save(existingFruta);
    }

    @Override
    public void remove(String id) {
        if (!repository.existsById(id)) {
            throw new FrutaNotFoundException("No se encontró la fruta con id " + id + " para eliminar.");
        }
        repository.deleteById(id);
    }
}
