package com.examplecat.itacademy.barcelonactiva.barberoprieto.oscar.s04.t02.n02.S04T02N02_BarberoPrieto_Oscar.model.service;


import com.examplecat.itacademy.barcelonactiva.barberoprieto.oscar.s04.t02.n02.S04T02N02_BarberoPrieto_Oscar.model.domain.Fruita;
import java.util.List;

public interface FruitaService {

    public Fruita addFruita(Fruita fruita);

    public List<Fruita> getAllFruites();

    public Fruita getFruita(int Id);

    public Fruita updateFruita(Fruita fruita);

    public void deleteFruita(int Id);

}