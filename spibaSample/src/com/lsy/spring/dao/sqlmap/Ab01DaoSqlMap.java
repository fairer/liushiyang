package com.lsy.spring.dao.sqlmap;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;


public class Ab01DaoSqlMap extends org.springframework.orm.ibatis.support.SqlMapClientDaoSupport{

	public Ab01DaoSqlMap() {
		
	}

	public int getAb01Nums(){
		Integer integer = null;
		Map map = new HashMap();
			integer = (Integer)super.getSqlMapClientTemplate().queryForObject("getAb01Nums", "map");
		
		return integer.intValue();
	}
}
