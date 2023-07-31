package cat.itacademy.barcelonactiva.barberoprieto.oscar.s04.t02.n01.model.service;

import java.util.List;

import cat.itacademy.barcelonactiva.barberoprieto.oscar.s04.t02.n01.model.domain.Fruita;

public interface FruitaService {

	public Fruita addFruita(Fruita fruita);

	public List<Fruita> getAllFruites();

	public Fruita getFruita(int Id);

	public Fruita updateFruita(Fruita fruita);

	public void deleteFruita(int Id);

}
