package org.epos.library.covjson;

public class ObservedProperty {
    public String id;
    public Label label;
    
	public ObservedProperty(String id, Label label) {
		super();
		this.id = id;
		this.label = label;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Label getLabel() {
		return label;
	}
	public void setLabel(Label label) {
		this.label = label;
	}
    
    
}
