package org.dimigo.interfaces;

public interface IDBManager {
	String ORACLE_DATABASE = "ORACLE";
	String SYBASE_DATABASE = "SYBASE";
	void insert();
	void search();
	void update();
	void delete();
	static IDBManager getDBObject(String database){
		if(database.equals(ORACLE_DATABASE))
			return new OracleDB();
		else if(database.equals(SYBASE_DATABASE))
			return new SybaseDB();
		else return null;
	}
	
}
