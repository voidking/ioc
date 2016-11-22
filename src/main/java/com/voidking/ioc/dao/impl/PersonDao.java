package com.voidking.ioc.dao.impl;


import com.voidking.ioc.dao.IPersonDao;

public class PersonDao implements IPersonDao {

	@Override
	public void save() {
		System.out.println("------------from PersonDao.save()");
	}

}

