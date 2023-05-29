package com.ln.myBank.Dto.response;

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
public class OperationsBancairesResponse {
	private long id;
	private TypeOperation typeOperation;
	private String intituleOperation;
	private LocalDateTime dateHeureOperation;
	private double montantOperation;
	private long idCarteBancaire;

	OperationsBancaires toEntity(OperationsBancairesResponse op) {
		return OperationsBancaires.builder().id(op.getId()).typeOperation(op.getTypeOperation())
				.intituleOperation(op.getIntituleOperation()).dateHeureOperation(LocalDateTime.now())
				.montantOperation(op.getMontantOperation())
				.carteBancaire(CarteBancaire.builder().id(op.idCarteBancaire).build()).build();
	}

	OperationsBancairesResponse toDto(OperationsBancaires op) {
		return OperationsBancairesResponse.builder().id(op.getId()).typeOperation(op.getTypeOperation())
				.intituleOperation(op.getIntituleOperation()).dateHeureOperation(LocalDateTime.now())
				.montantOperation(op.getMontantOperation()).idCarteBancaire(op.getCarteBancaire().getId()).build();
	}
}
