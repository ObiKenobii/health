package health;

import java.util.ArrayList;
import java.util.Date;

public class DataBean {
	
	private ArrayList<WellnessDatasetBean> data = new ArrayList<WellnessDatasetBean>();
	
	private short wellness;
	private String weather;
	private short temperature;
	private short humidity;
	private ArrayList<String> pollen;
	private short heartrate;
	private String comment;
	
		
	public WellnessDatasetBean getDataset(int i) {
		return this.data.get(i);
	}
	
	public void removeDataset(int i) {
		this.data.remove(i);
	}
	
	//TODO: Input Validation!
	public boolean addDataset() {
		WellnessDatasetBean ds = new WellnessDatasetBean();
		ds.setDate(new Date());
		ds.setWellness(this.wellness);
		ds.setWeather(this.weather);
		ds.setTemperature(this.temperature);
		ds.setHumidity(this.humidity);
		ds.setPollen(this.pollen);
		ds.setHeartrate(this.heartrate);
		ds.setComment(this.comment);
		this.data.add(ds);
		return true;
	}

	public ArrayList<WellnessDatasetBean> getData() {
		return this.data;
	}
	
	public void setData(ArrayList<WellnessDatasetBean> data) {
		this.data = data;
	}
	public short getWellness() {
		return wellness;
	}

	public void setWellness(short wellness) {
		this.wellness = wellness;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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


