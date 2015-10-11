package health;

public class DataBean {
	private String name;
	private short wellness;
	private String comment;

    public String getName ()
    {
        return name;
    }


    public void setName (final String name)
    {
        this.name = name;
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


