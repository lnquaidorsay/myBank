package com.ln.myBank.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Adresse extends AbstractEntity {

	private String avenue;

	private Integer numero;

	private Integer codePostal;

	private String ville;

	private String pays;

	@OneToOne
	@JoinColumn(name = "id_Client")
	private Client client;

}
