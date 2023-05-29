package com.ln.myBank.service;

import com.ln.myBank.Dto.AdresseDto;

public interface AdresseService extends AbstractService<AdresseDto> {

	AdresseDto creerAdresseClient(AdresseDto adr, String email);

}
