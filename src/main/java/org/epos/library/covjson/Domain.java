package org.epos.library.covjson;

import java.util.ArrayList;

public class Domain {
	public String type;
    public String domainType;
    public Axes axes;
    public ArrayList<Referencing> referencing;
	public Domain(String type, String domainType) {
		super();
		this.type = type;
		this.domainType = domainType;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDomainType() {
		return domainType;
	}
	public void setDomainType(String domainType) {
		this.domainType = domainType;
	}
	public Axes getAxes() {
		return axes;
	}
	public void setAxes(Axes axes) {
		this.axes = axes;
	}
	public ArrayList<Referencing> getReferencing() {
		return referencing;
	}
	public void setReferencing(ArrayList<Referencing> referencing) {
		this.referencing = referencing;
	}
    
    
}
