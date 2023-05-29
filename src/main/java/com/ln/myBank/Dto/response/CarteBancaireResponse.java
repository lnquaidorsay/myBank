package com.ln.myBank.Dto.response;

import com.ln.myBank.Entities.CarteBancaire;
import com.ln.myBank.Entities.Client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class CarteBancaireResponse {
	private long id;
	private int numCB;
	private int anneeFinCB;
	private int moisFinCB;
	private long idClient;

	CarteBancaire toEntity(CarteBancaireResponse cb) {
		return CarteBancaire.builder().id(cb.getId()).numCB(cb.getNumCB()).anneeFinCB(cb.getAnneeFinCB())
				.moisFinCB(cb.getMoisFinCB()).client(Client.builder().id(cb.getIdClient()).build()).build();
	}

	CarteBancaireResponse toDto(CarteBancaire cb) {
		return CarteBancaireResponse.builder().id(cb.getId()).numCB(cb.getNumCB()).anneeFinCB(cb.getAnneeFinCB())
				.moisFinCB(cb.getMoisFinCB()).idClient(cb.getClient().getId()).build();
	}

}
