package lab5.prob2;

public class Circle implements IShape {
	
	private double radius;
	
	public double getRadius() {
	    return radius;
	}
	 
	public Circle(double radius) {
		this.radius=radius; 
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius ;
	}

}
