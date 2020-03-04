package co.gc.WeatherApi.model;

import java.util.List;

public class Time {

	private List<String> startPeriodName;

	@Override
	public String toString() {
		return "Time [startPeriodName=" + startPeriodName + "]";
	}

	public List<String> getStartPeriodName() {
		return startPeriodName;
	}

	public void setStartPeriodName(List<String> startPeriodName) {
		this.startPeriodName = startPeriodName;
	}

}
