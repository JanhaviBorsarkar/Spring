package com.beanFactory;

public class MySql implements Connection
{

	@Override
	public void commit() {
		System.out.println("Commit method of MySql");
		
	}

	@Override
	public void rollback() {
	System.out.println("Rollback method of Mysql");
	}
	
}
