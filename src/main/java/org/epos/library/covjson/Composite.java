package org.epos.library.covjson;

import java.util.ArrayList;

public class Composite {
	
	private String dataType;
	private ArrayList<String> coordinates;
	private ArrayList<ArrayList<Double>> values;
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public ArrayList<String> getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(ArrayList<String> coordinates) {
		this.coordinates = coordinates;
	}
	public ArrayList<ArrayList<Double>> getValues() {
		return values;
	}
	public void setValues(ArrayList<ArrayList<Double>> values) {
		this.values = values;
	}
	
	
	
}
