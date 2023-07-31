package com.examplecat.itacademy.barcelonactiva.barberoprieto.oscar.s04.t02.n02.S04T02N02_BarberoPrieto_Oscar.model.service;

import com.examplecat.itacademy.barcelonactiva.barberoprieto.oscar.s04.t02.n02.S04T02N02_BarberoPrieto_Oscar.model.domain.Fruita;
import com.examplecat.itacademy.barcelonactiva.barberoprieto.oscar.s04.t02.n02.S04T02N02_BarberoPrieto_Oscar.model.repository.FruitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitaServiceImpl implements FruitaService{

    @Autowired
    private FruitaRepository fruitaRepository;

    @Override
    public Fruita addFruita(Fruita fruita) {
        return fruitaRepository.save(fruita);

    }

    @Override
    public List<Fruita> getAllFruites() {
        return fruitaRepository.findAll();

    }

    @Override
    public Fruita getFruita(int Id) {
        return fruitaRepository.findById(Id).orElse(null);

    }

    @Override
    public Fruita updateFruita(Fruita fruita) {
        return fruitaRepository.save(fruita);
    }

    @Override
    public void deleteFruita(int Id) {
        fruitaRepository.deleteById(Id);

    }

}
