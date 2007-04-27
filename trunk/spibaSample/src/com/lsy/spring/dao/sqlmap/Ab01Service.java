package com.lsy.spring.dao.sqlmap;

public class Ab01Service {

	private Ab01DaoSqlMap dao ;

	public int getAb01Nums(){
		return dao.getAb01Nums();
	}
	
	public Ab01DaoSqlMap getDao() {
		return dao;
	}

	public void setDao(Ab01DaoSqlMap dao) {
		this.dao = dao;
	}
	
	
}
