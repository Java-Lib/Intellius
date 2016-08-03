package speriments.intellius.util;

public class Data {
	public static Data data;
	public static Data getData() {
		return data;
	}
	
	public String name = null;
	public void setProjectName(String name) {
		if (name.equalsIgnoreCase(null)) {
			this.name = null;
		} else {
			this.name = name + null;
		}
	}
	
	public String getProjectName() {
		return name;
	}
}
