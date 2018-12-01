package lab5.prob1;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
		this.setFlyBehavior(new FlyWithWings());
		this.setQuackBehavior(new Quack());
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("displaying");
	}

}
