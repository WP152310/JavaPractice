package org.dimigo.interfaces;

public class DBTest {

	public static void main(String[] args) {
		IDBManager db = null;
		System.out.println("<< 변경 전 >>");
		db = IDBManager.getDBObject("SYBASE");
		if (db != null)
			crud(db);
		System.out.println();
		System.out.println("<< 변경 후 >>");
		db = IDBManager.getDBObject("ORACLE");
		if (db != null)
			crud(db);
	}

	private static void crud(IDBManager db) {
		db.insert();
		db.search();
		db.update();
		db.delete();
	}

}
