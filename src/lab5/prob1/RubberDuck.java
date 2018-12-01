package lab5.prob1;

public class RubberDuck extends Duck {

	public RubberDuck() {
		this.setFlyBehavior(new CannotFly());
		this.setQuackBehavior(new Squeak());
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("displaying");
	}

}
