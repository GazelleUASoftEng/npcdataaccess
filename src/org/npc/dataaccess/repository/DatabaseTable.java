package org.npc.dataaccess.repository;

public enum DatabaseTable {
	NONE(""),
	EMPLOYEE("employee"),
	TRANSACTION("transaction"),
	PRODUCT("product"),
	TRANSACTION_ENTRY("transactionentry");
	
	public String getLabel() {
		return label;
	}
	
	private final String label;
	
	private DatabaseTable(String label) {
		this.label = label;
	}
}
