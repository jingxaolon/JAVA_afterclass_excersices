
public class Nine_Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fan newFan1 = new Fan();
		Fan newFan2 = new Fan();
		
		//newFan1
		newFan1.setSpeed(Fan.FAST);
		newFan1.setRadius(10);
		newFan1.setColor("yellow");
		newFan1.setOn(true);
		System.out.println(newFan1.toString());
		
		//newFan2
		newFan2.setSpeed(Fan.MEDIUM);
		newFan1.setRadius(5);
		newFan1.setColor("blue");
		newFan1.setOn(false);
		System.out.println(newFan2.toString());
	}

}

class Fan {
	static int SLOW = 1;
	static int MEDIUM = 2;
	static int FAST = 3;
	
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";
	
	public Fan() {
		
	}
	
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setOn(boolean newOn) {
		on = newOn;
	}
	
	public boolean getOn() {
		return on;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public String getColor() {
		return color;
	}
	
	public String toString() {
		String result = "";
		if (on) {
			result = "fan is ";
			result += "on, ";
			result += "the speed of fan is " + speed + ", ";
			result += "the color of fan is " + color + ", ";
			result += "the radius of fan is " + radius;
		}
		else {
			result = "fan is off, ";
			result += "the color of fan is " + color + ", ";
			result += "the radius of fan is " + radius;
		}
		
		return result;
	}
}