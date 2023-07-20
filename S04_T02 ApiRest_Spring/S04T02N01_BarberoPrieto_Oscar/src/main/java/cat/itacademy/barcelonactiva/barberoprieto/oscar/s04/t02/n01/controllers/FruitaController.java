package cat.itacademy.barcelonactiva.barberoprieto.oscar.s04.t02.n01.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.barberoprieto.oscar.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.barberoprieto.oscar.s04.t02.n01.model.service.FruitaService;

@RestController
@RequestMapping(value = "/fruita")
public class FruitaController {

	@Autowired
	private FruitaService fruitaService;

	@GetMapping(value = "/getAll")
	public List<Fruita> getAllFruites() {

		return fruitaService.getAllFruites();
	}

	@GetMapping(value = "/getOne/{id}")
	public Fruita getFruita(@PathVariable int id) {
		return fruitaService.getFruita(id);

	}

	@PostMapping(value = "/add")
	public Fruita addFruita(@RequestBody Fruita fruita) {
		return fruitaService.addFruita(fruita);
		
	}

	@PutMapping(value = "/update")
	public Fruita updateFruita(@RequestBody Fruita fruita) {
		return fruitaService.updateFruita(fruita);

	}

	@DeleteMapping(value = "/delete/{id}")
	public void deleteFruita(@PathVariable int id) {
		fruitaService.deleteFruita(id);

	}

}
