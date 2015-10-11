package health;

import java.util.ArrayList;

public class DataBean {
	
	private ArrayList<WellnessDatasetBean> data = new ArrayList<WellnessDatasetBean>();
	private short wellness;
	private String comment;
	
	public WellnessDatasetBean getDataset(int i) {
		return this.data.get(i);
	}
	
	public void removeDataset(int i) {
		this.data.remove(i);
	}
	
	public boolean addDataset() {
		WellnessDatasetBean ds = new WellnessDatasetBean();
		ds.setComment(this.comment);
		ds.setWellness(this.wellness);
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
	
}


