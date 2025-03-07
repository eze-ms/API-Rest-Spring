package cat.itacademy.s04.t02.n03.services;

import cat.itacademy.s04.t02.n03.model.Fruta;

import java.util.List;

public interface FrutaService {
    List<Fruta> findAll();
    Fruta findById(String id);
    Fruta save(Fruta fruta);
    Fruta update(String id, Fruta fruta);
    void remove(String id);
}

