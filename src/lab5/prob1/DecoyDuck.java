package lab5.prob1;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		this.setFlyBehavior(new CannotFly());
		this.setQuackBehavior(new MuteQuack());
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("displaying");
		
	}

}
