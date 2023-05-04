package org.epos.library.covjson;

public class Symbol {
	
    public String type;
    public String value;
    
    
    
	public Symbol(String type, String value) {
		super();
		this.type = type;
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
    
    
    
}
