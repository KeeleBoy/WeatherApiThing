package co.gc.WeatherApi.model;

public class Weather {

	private Location location;
	private Data data;
	private String productionCenter;

	public String getProductionCenter() {
		return productionCenter;
	}

	public void setProductionCenter(String productionCenter) {
		this.productionCenter = productionCenter;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

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
