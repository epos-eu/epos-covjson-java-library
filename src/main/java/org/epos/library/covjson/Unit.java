package org.epos.library.covjson;

public class Unit {
	
    public Symbol symbol;
    public Label label;
    
    
    
	public Unit(Symbol symbol, Label label) {
		super();
		this.symbol = symbol;
		this.label = label;
	}
	public Symbol getSymbol() {
		return symbol;
	}
	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}
	public Label getLabel() {
		return label;
	}
	public void setLabel(Label label) {
		this.label = label;
	}
    
    
    
}
