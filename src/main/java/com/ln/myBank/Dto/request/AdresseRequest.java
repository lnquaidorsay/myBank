package com.ln.myBank.Dto.request;

import com.ln.myBank.Entities.Adresse;
import com.ln.myBank.Entities.Client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class AdresseRequest {
	private String avenue;
	private Integer numero;
	private Integer codePostal;
	private String ville;
	private String pays;
	private long idClient;

	Adresse toEntity(AdresseRequest adressRequest) {
		return Adresse.builder().avenue(adressRequest.getAvenue()).numero(adressRequest.getNumero())
				.codePostal(adressRequest.getCodePostal()).ville(adressRequest.getVille()).pays(adressRequest.getPays())
				.client(Client.builder().id(adressRequest.getIdClient()).build()).build();
	}

	AdresseRequest toDto(Adresse adresse) {
		return AdresseRequest.builder().avenue(adresse.getAvenue()).numero(adresse.getNumero())
				.codePostal(adresse.getCodePostal()).ville(adresse.getVille()).pays(adresse.getPays())
				.idClient(adresse.getClient().getId()).build();
	}

}
