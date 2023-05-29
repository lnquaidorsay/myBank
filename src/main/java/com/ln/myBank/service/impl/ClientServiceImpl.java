package com.ln.myBank.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ln.myBank.Dto.AdresseDto;
import com.ln.myBank.Dto.ClientDto;
import com.ln.myBank.Entities.Adresse;
import com.ln.myBank.Entities.Client;
import com.ln.myBank.repositories.AdresseRepository;
import com.ln.myBank.repositories.ClientRepository;
import com.ln.myBank.service.AdresseService;
import com.ln.myBank.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private AdresseRepository adresseRepository;
	@Autowired
	private AdresseService adresseService;

	@Override
	public long save(ClientDto dto) {
		Client currentCl = ClientDto.mapToEntity(dto);
		return clientRepository.save(currentCl).getId();
	}

	@Override
	public List<ClientDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClientDto findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public ClientDto creerNouveauClient(ClientDto clientDto) {
		/*
		 * Adresse adresse = clientDto.getAdresse();
		 * adresse.setCreatedDate(LocalDateTime.now()); Adresse adrClient =
		 * adresseRepository.save(adresse);
		 */

		Adresse adresse = clientDto.getAdresse();

		Client currentCl = ClientDto.mapToEntity(clientDto);
		currentCl.setCreatedDate(LocalDateTime.now());
		currentCl.setAdresse(adresse);
		Client clientSaved = clientRepository.save(currentCl);

		AdresseDto adrClientSaved = adresseService.creerAdresseClient(AdresseDto.mapToDto(clientDto.getAdresse()),
				clientSaved.getEmail());

		return ClientDto.mapToDto(clientSaved);
	}

}
