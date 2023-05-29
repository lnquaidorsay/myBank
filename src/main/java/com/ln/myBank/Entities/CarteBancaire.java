package com.ln.myBank.Entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
public class CarteBancaire extends AbstractEntity {

	private int numCB;
	private int anneeFinCB;
	private int moisFinCB;
	@OneToMany(mappedBy = "carteBancaire")
	private List<OperationsBancaires> operationsBancaires;
	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;

}
