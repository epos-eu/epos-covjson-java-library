package org.epos.library.covjson;

import java.util.ArrayList;

public class Range {
	
	private ArrayList<Integer> shape;
	private String dataType;
	private ArrayList<Float> values;
	private ArrayList<String> axisNames;
	private String type;
	
	public ArrayList<Integer> getShape() {
		return shape;
	}
	public void setShape(ArrayList<Integer> shape) {
		this.shape = shape;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public ArrayList<Float> getValues() {
		return values;
	}
	public void setValues(ArrayList<Float> values) {
		this.values = values;
	}
	public ArrayList<String> getAxisNames() {
		return axisNames;
	}
	public void setAxisNames(ArrayList<String> axisNames) {
		this.axisNames = axisNames;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	
	
}
