
public class Nine_Nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RegularPolygon new1 = new RegularPolygon();
		RegularPolygon new2 = new RegularPolygon(6, 4);
		RegularPolygon new3 = new RegularPolygon(10, 4, 5.6, 7.8);
	}

}

class RegularPolygon {
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	
	public RegularPolygon() {
		
	}
	
	public RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
	}
	
	public RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public int getN() {
		return n;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getY() {
		return y;
	}
	
	public double getPerimeter() {
		return this.n * this.side;
	}
	
	public double getArea() {
		//s = 2rsin(pi/5). r是中心到顶点的距离
		double r = 0;
		
		double s = 2 * r * Math.sin(Math.PI / 5);
		return (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
	}
}