package cat.itacademy.s04.t02.n02.services;

import cat.itacademy.s04.t02.n02.model.Fruta;

import java.util.List;

public interface FrutaService {
    List<Fruta> findAll();
    Fruta findById(int id);
    Fruta save(Fruta fruta);
    Fruta update(int id, Fruta fruta);
    void remove(int id);
}
