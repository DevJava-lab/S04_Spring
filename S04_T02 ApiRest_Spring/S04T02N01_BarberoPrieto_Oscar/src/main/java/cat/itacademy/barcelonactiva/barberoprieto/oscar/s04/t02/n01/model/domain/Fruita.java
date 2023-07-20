package cat.itacademy.barcelonactiva.barberoprieto.oscar.s04.t02.n01.model.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fruiteria")
public class Fruita {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "nom")
	private String nom;
	@Column(name = "quilos")
	private int quantitatQuilos;

	public Fruita() {

	}

	public Fruita(int id, String nom, int quantitatQuilos) {
		super();
		this.id = id;
		this.nom = nom;
		this.quantitatQuilos = quantitatQuilos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getQuantitatQuilos() {
		return quantitatQuilos;
	}

	public void setQuantitatQuilos(int quantitatQuilos) {
		this.quantitatQuilos = quantitatQuilos;
	}

}
