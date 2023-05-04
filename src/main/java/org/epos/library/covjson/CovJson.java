package org.epos.library.covjson;

import java.util.HashMap;

public class CovJson {
	    public String type;
	    public Domain domain;
	    public HashMap<String, Parameter> parameters;
	    public HashMap<String, Range> ranges;
	    
		public CovJson(String type, Domain domain) {
			super();
			this.type = type;
			this.domain = domain;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Domain getDomain() {
			return domain;
		}
		public void setDomain(Domain domain) {
			this.domain = domain;
		}
		public HashMap<String, Parameter> getParameters() {
			return parameters;
		}
		public void setParameters(HashMap<String, Parameter> parameters) {
			this.parameters = parameters;
		}
		public HashMap<String, Range> getRanges() {
			return ranges;
		}
		public void setRanges(HashMap<String, Range> ranges) {
			this.ranges = ranges;
		}
		@Override
		public String toString() {
			return "CovJson [type=" + type + ", domain=" + domain + ", parameters=" + parameters + ", ranges=" + ranges
					+ "]";
		}
	    
	    
}
