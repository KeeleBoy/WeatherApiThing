package co.gc.WeatherApi.model;

public class Location {

	private String elevation;
	private String timezone;
	private String areaDescription;

	@Override
	public String toString() {
		return "Location [elevation=" + elevation + ", timezone=" + timezone + ", areaDescription=" + areaDescription
				+ "]";
	}

	public String getElevation() {
		return elevation;
	}

	public void setElevation(String elevation) {
		this.elevation = elevation;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getAreaDescription() {
		return areaDescription;
	}

	public void setAreaDescription(String areaDescription) {
		this.areaDescription = areaDescription;
	}

}
