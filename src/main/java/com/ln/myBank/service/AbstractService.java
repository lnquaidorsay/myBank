package com.ln.myBank.service;

import java.util.List;

public interface AbstractService<T> {
	long save(T dto);

	List<T> findAll();

	T findById(long id);

	void delete(long id);
}
