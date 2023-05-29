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

@Service
public class AdresseServiceImpl implements AdresseService {

	@Autowired
	private AdresseRepository adresseRepository;

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public long save(AdresseDto dto) {
		// TODO Auto-generated method stub
		return (Long) null;
	}

	@Override
	public List<AdresseDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdresseDto findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public AdresseDto creerAdresseClient(AdresseDto adr, String email) {
		Client cl = clientRepository.findByEmail(email);
		ClientDto clDto = ClientDto.mapToDto(cl);
		adr.setClient(clDto);
		Adresse adrToSave = AdresseDto.mapToEntity(adr);
		adrToSave.setCreatedDate(LocalDateTime.now());
		Adresse adresseSaved = adresseRepository.save(adrToSave);
		return AdresseDto.mapToDto(adresseSaved);
	}

}
