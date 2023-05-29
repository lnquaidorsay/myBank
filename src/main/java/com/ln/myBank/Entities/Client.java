package com.ln.myBank.Entities;

import java.util.List;

import com.ln.myBank.utils.Civilite;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
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
public class Client extends AbstractEntity {
	@Enumerated(EnumType.STRING)
	private Civilite civilite;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String photo;
	@OneToOne(mappedBy = "client")
	private Adresse adresse;
	@OneToMany(mappedBy = "client")
	private List<CarteBancaire> carteBancaire;

}
