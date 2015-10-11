package health;

import java.util.ArrayList;
import java.util.Date;

public class WellnessDatasetBean {

	private Date date;
	private short wellness;
	private String weather;
	private short temperature;
	private short humidity;
	private ArrayList<String> pollen;
	private short heartrate;
	private String comment;

	public short getWellness() {
		return this.wellness;
	}

	public void setWellness(short wellness) {
		this.wellness = wellness;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public short getHeartrate() {
		return heartrate;
	}

	public void setHeartrate(short heartrate) {
		this.heartrate = heartrate;
	}

	public short getTemperature() {
		return temperature;
	}

	public void setTemperature(short temperature) {
		this.temperature = temperature;
	}

	public short getHumidity() {
		return humidity;
	}

	public void setHumidity(short humidity) {
		this.humidity = humidity;
	}

	public ArrayList<String> getPollen() {
		return pollen;
	}

	public void setPollen(ArrayList<String> pollen) {
		this.pollen = pollen;
	}

}
