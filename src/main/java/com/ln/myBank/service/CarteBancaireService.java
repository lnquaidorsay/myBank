package com.ln.myBank.service;

import com.ln.myBank.Dto.CarteBancaireDto;
import com.ln.myBank.Dto.request.CarteBancaireRequest;

public interface CarteBancaireService extends AbstractService<CarteBancaireRequest> {

	CarteBancaireDto creerCarteBancaire(CarteBancaireDto cb, String email);

}
