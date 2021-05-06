package com.applicatincontext;

public class Oracle implements Connection 
{

	@Override
	public void commit() {
		System.out.println("Commit Method of Oracle");
		
	}

	@Override
	public void rollback() {
	System.out.println("Rollback method of Oracle");
		
	}
	
}