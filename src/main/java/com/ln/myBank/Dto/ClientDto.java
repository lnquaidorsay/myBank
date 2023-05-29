package com.ln.myBank.Dto;

import java.util.List;

import com.ln.myBank.Entities.Adresse;
import com.ln.myBank.Entities.CarteBancaire;
import com.ln.myBank.Entities.Client;
import com.ln.myBank.utils.Civilite;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {
	private long id;
	private Civilite civilite;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String photo;
	private Adresse adresse;
	private List<CarteBancaire> carteBancaire;

	public static Client mapToEntity(ClientDto cl) {
		return Client.builder().id(cl.id).civilite(cl.getCivilite()).nom(cl.getNom()).prenom(cl.getPrenom())
				.email(cl.getEmail()).telephone(cl.getTelephone()).photo(cl.getPhoto()).adresse(cl.getAdresse())
				.carteBancaire(cl.getCarteBancaire()).build();
	}

	public static ClientDto mapToDto(Client cl) {
		return ClientDto.builder().id(cl.getId()).civilite(cl.getCivilite()).nom(cl.getNom()).prenom(cl.getPrenom())
				.email(cl.getEmail()).telephone(cl.getTelephone()).adresse(cl.getAdresse())
				.carteBancaire(cl.getCarteBancaire()).build();
	}

}
