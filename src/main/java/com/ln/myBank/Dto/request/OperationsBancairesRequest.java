package com.ln.myBank.Dto.request;

import java.time.LocalDateTime;

import com.ln.myBank.Entities.CarteBancaire;
import com.ln.myBank.Entities.OperationsBancaires;
import com.ln.myBank.utils.TypeOperation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class OperationsBancairesRequest {
	private TypeOperation typeOperation;
	private String intituleOperation;
	private LocalDateTime dateHeureOperation;
	private double montantOperation;
	private long idCarteBancaire;

	OperationsBancaires toEntity(OperationsBancairesRequest op) {
		return OperationsBancaires.builder().typeOperation(op.getTypeOperation())
				.intituleOperation(op.getIntituleOperation()).dateHeureOperation(LocalDateTime.now())
				.montantOperation(op.getMontantOperation())
				.carteBancaire(CarteBancaire.builder().id(op.idCarteBancaire).build()).build();
	}

	OperationsBancairesRequest toDto(OperationsBancaires op) {
		return OperationsBancairesRequest.builder().typeOperation(op.getTypeOperation())
				.intituleOperation(op.getIntituleOperation()).dateHeureOperation(LocalDateTime.now())
				.montantOperation(op.getMontantOperation()).idCarteBancaire(op.getCarteBancaire().getId()).build();
	}

}
