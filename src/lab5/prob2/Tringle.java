package lab5.prob2;

public final class Tringle implements IShape {
	
	private double base;
	private double height;
	
	public double geBase() {
	    return base;
	}
	
	public double getHeight() {
	    return height;
	}
	
	public Tringle(double base,double height) {
		this.base=base;
		this.height=height;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return 1/2 * base * height;
	}

}
