package com.ln.myBank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ln.myBank.Entities.OperationsBancaires;

public interface OperationsBancaireRepository extends JpaRepository<OperationsBancaires, Long> {

}
