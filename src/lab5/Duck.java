package lab5;

public abstract class Duck {
	
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;

	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	public void swim() {
		System.out.println("swimming");
	}	
	public void display() {}
		
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public void quack() {
		quackBehavior.quack();
	}
	public void fly() {
		flyBehavior.fly();
	}

	
}
