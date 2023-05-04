package org.epos.library.covjson;

import java.util.ArrayList;
import java.util.HashMap;

public class Channel {
	
	private String label;
	private HashMap<String, ArrayList<Float>> axis = new HashMap<String, ArrayList<Float>>();
	private ArrayList<String> temporal = new ArrayList<String>();
	private Double latitude = null, longitude = null;
	private HashMap<String,Range> ranges = new HashMap<String,Range>();
	private HashMap<String,Parameter> parameters = new HashMap<String,Parameter>();
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public HashMap<String, ArrayList<Float>> getAxis() {
		return axis;
	}
	public void setAxis(HashMap<String, ArrayList<Float>> axis) {
		this.axis = axis;
	}
	public ArrayList<String> getTemporal() {
		return temporal;
	}
	public void setTemporal(ArrayList<String> temporal) {
		this.temporal = temporal;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public HashMap<String, Range> getRanges() {
		return ranges;
	}
	public void setRanges(HashMap<String, Range> ranges) {
		this.ranges = ranges;
	}
	public HashMap<String, Parameter> getParameters() {
		return parameters;
	}
	public void setParameters(HashMap<String, Parameter> parameters) {
		this.parameters = parameters;
	}

}
