package com.rpramadhan.sbliquibase.service;

import com.rpramadhan.sbliquibase.model.Book;

public interface IBookService {
	
	public Book findById(Long id);
	
	public void saveOrUpdate(Book book) throws Exception;

}
