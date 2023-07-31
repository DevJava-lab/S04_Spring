package cat.itacademy.barcelonactiva.barberoprieto.oscar.s04.t02.n01.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.barberoprieto.oscar.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.barberoprieto.oscar.s04.t02.n01.model.repository.FruitaRepository;

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
