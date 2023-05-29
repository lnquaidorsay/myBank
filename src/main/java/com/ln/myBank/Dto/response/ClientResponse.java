package com.ln.myBank.Dto.response;

import com.ln.myBank.Entities.Client;
import com.ln.myBank.utils.Civilite;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ClientResponse {
	private long id;
	private Civilite civilite;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String photo;

	Client toEntity(ClientResponse cr) {
		return Client.builder().id(cr.getId()).civilite(cr.getCivilite()).nom(cr.getNom()).prenom(cr.getPrenom())
				.email(cr.getEmail()).telephone(cr.getTelephone()).photo(cr.getPhoto()).build();
	}

	ClientResponse toDto(Client cl) {
		return ClientResponse.builder().id(cl.getId()).civilite(cl.getCivilite()).nom(cl.getNom())
				.prenom(cl.getPrenom()).email(cl.getEmail()).telephone(cl.getTelephone()).photo(cl.getPhoto()).build();
	}
}
