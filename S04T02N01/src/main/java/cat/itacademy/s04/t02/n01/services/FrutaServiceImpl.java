package cat.itacademy.s04.t02.n01.services;

import cat.itacademy.s04.t02.n01.exception.FrutaNotFoundException;
import cat.itacademy.s04.t02.n01.model.Fruta;
import cat.itacademy.s04.t02.n01.repository.FrutaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FrutaServiceImpl implements FrutaService {

    private final FrutaRepository repository;

    public FrutaServiceImpl(FrutaRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Fruta> findAll() {
        return this.repository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Fruta findById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new FrutaNotFoundException("La fruta con id " + id + " no fue encontrada."));
    }

    @Transactional
    @Override
    public Fruta save(Fruta fruta) {
        return repository.save(fruta);
    }

    @Transactional
    @Override
    public Fruta update(int id, Fruta fruta) {
        Fruta existingFruta = findById(id);
        existingFruta.setNom(fruta.getNom());
        existingFruta.setQuantitatQuilos(fruta.getQuantitatQuilos());
        return repository.save(existingFruta);
    }

    @Transactional
    @Override
    public void remove(int id) {
        if (!repository.existsById(id)) {
            throw new FrutaNotFoundException("No se encontró la fruta con id " + id + " para eliminar.");
        }
        repository.deleteById(id);
    }
}
