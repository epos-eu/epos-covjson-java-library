package org.epos.library.covjson;

import java.util.ArrayList;

public class Parameter {
	
	public String type;
    public Description description;
    public Unit unit;
    public ObservedProperty observedProperty;
    
	public String getType() {
		
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Description getDescription() {
		return description;
	}
	public void setDescription(Description description) {
		this.description = description;
	}
	public Unit getUnit() {
		return unit;
	}
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	public ObservedProperty getObservedProperty() {
		return observedProperty;
	}
	public void setObservedProperty(ObservedProperty observedProperty) {
		this.observedProperty = observedProperty;
	}
}
