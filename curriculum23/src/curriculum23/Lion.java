package curriculum23;

public class Lion {
	private String name;
	private double length;
	private int speed;

	//getterを使用
	public String getname() {
		return name;
	}

	public double getlength() {
		return length;
	}

	public int getspeed() {
		return speed;
	}

	//setterを使用
	public void setName(String name, double length, int speed) {
		this.name = name;
		this.length = length;
		this.speed = speed;
	}
}
