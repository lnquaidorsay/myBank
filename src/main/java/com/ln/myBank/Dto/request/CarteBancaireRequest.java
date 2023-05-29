package com.ln.myBank.Dto.request;

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
public class CarteBancaireRequest {
	private int numCB;
	private int anneeFinCB;
	private int moisFinCB;
	private long idClient;

	CarteBancaire toEntity(CarteBancaireRequest cb) {
		return CarteBancaire.builder().numCB(cb.getNumCB()).anneeFinCB(cb.getAnneeFinCB()).moisFinCB(cb.getMoisFinCB())
				.client(Client.builder().id(cb.getIdClient()).build()).build();
	}

	CarteBancaireRequest toDto(CarteBancaire cb) {
		return CarteBancaireRequest.builder().numCB(cb.getNumCB()).anneeFinCB(cb.getAnneeFinCB())
				.moisFinCB(cb.getMoisFinCB()).idClient(cb.getClient().getId()).build();
	}

}
