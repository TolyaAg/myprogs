package helpinstudy.com.firstbigprog;

public class Horse {
	private String name;
	private double speed;
	private double distance;
	
	public Horse(String name, double speed, double distance) {
		this.name = name;
		this.speed = speed;
		this.distance = distance;
	}
	
	//name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//speed
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	//distance
	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public void move() {
		distance += speed * Math.random();
	}
	
	public void print() {
		for(int i = 0; i < Math.round(distance); i++)
			System.out.print(".");
		System.out.println(name);
	}
	
}
