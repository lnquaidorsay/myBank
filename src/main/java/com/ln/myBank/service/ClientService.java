package com.ln.myBank.service;

import com.ln.myBank.Dto.ClientDto;

public interface ClientService extends AbstractService<ClientDto> {

	ClientDto creerNouveauClient(ClientDto clientDto);

}
