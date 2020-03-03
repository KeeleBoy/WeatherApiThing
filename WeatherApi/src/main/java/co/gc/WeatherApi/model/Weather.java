package co.gc.WeatherApi.model;

public class Weather {

	private Location location;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Weather [location=" + location + "]";
	}

}
