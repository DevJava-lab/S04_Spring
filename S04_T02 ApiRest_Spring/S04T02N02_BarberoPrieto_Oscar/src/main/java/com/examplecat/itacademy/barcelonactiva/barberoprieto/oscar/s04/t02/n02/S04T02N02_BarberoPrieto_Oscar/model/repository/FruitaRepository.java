package com.examplecat.itacademy.barcelonactiva.barberoprieto.oscar.s04.t02.n02.S04T02N02_BarberoPrieto_Oscar.model.repository;

import com.examplecat.itacademy.barcelonactiva.barberoprieto.oscar.s04.t02.n02.S04T02N02_BarberoPrieto_Oscar.model.domain.Fruita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface FruitaRepository extends JpaRepository<Fruita, Integer> {

}

