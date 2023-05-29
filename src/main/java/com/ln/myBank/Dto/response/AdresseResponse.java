package com.ln.myBank.Dto.response;

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
public class AdresseResponse {
	private long id;
	private String avenue;
	private Integer numero;
	private Integer codePostal;
	private String ville;
	private String pays;
	private long idClient;

	Adresse toEntity(AdresseResponse adressResponse) {
		return Adresse.builder().id(adressResponse.getId()).avenue(adressResponse.getAvenue())
				.numero(adressResponse.getNumero()).codePostal(adressResponse.getCodePostal())
				.ville(adressResponse.getVille()).pays(adressResponse.getPays())
				.client(Client.builder().id(adressResponse.getIdClient()).build()).build();
	}

	AdresseResponse toDto(Adresse adresse) {
		return AdresseResponse.builder().id(adresse.getId()).avenue(adresse.getAvenue()).numero(adresse.getNumero())
				.codePostal(adresse.getCodePostal()).ville(adresse.getVille()).pays(adresse.getPays())
				.idClient(adresse.getClient().getId()).build();
	}

}
