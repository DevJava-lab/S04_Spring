package cat.itacademy.barcelonactiva.barberoprieto.oscar.s04.t02.n01.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
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
	public ResponseEntity<List<Fruita>> getAllFruites() {

		return ResponseEntity.status(HttpStatus.OK).body(fruitaService.getAllFruites());

	}

	@GetMapping(value = "/getOne/{id}")
	public ResponseEntity<Fruita> getFruita(@PathVariable int id) {

		return ResponseEntity.status(HttpStatus.OK).body(fruitaService.getFruita(id));

	}

	@PostMapping(value = "/add")
	public ResponseEntity<Fruita> addFruita(@RequestBody Fruita fruita) {

		return ResponseEntity.status(HttpStatus.OK).body(fruitaService.addFruita(fruita));

	}

	@PutMapping(value = "/update")
	public ResponseEntity<Fruita> updateFruita(@RequestBody Fruita fruita) {

		return ResponseEntity.status(HttpStatus.OK).body(fruitaService.updateFruita(fruita));

	}

	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<?> deleteFruita(@PathVariable int id) {

		String message = "";
		String fruit = fruitaService.getFruita(id).getNom();

		fruitaService.deleteFruita(id);

		message = "Fruita eliminada : " + fruit;
		return ResponseEntity.status(HttpStatus.OK).body(message);

	}

}
