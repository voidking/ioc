package com.voidking.ioc.service.impl;


import com.voidking.ioc.dao.IPersonDao;
import com.voidking.ioc.service.IPersonService;

public class PersonService implements IPersonService {
	private IPersonDao personDao;
	
	public void setPersonDao(IPersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	public void processSave() {
		System.out.println("-------------from PersonService.processSave()");
		
		personDao.save();
	}

}

