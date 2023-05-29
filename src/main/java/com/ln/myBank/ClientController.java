package com.ln.myBank;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ln.myBank.Dto.ClientDto;
import com.ln.myBank.service.ClientService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/clients/")
@RequiredArgsConstructor
public class ClientController {

	private final ClientService clientService;

	@PostMapping
	public ResponseEntity<ClientDto> ajoutClient(@RequestBody ClientDto clientRequest) {

		ClientDto nouvClient = clientService.creerNouveauClient(clientRequest);

		return new ResponseEntity<ClientDto>(nouvClient, HttpStatus.CREATED);
	}

}
