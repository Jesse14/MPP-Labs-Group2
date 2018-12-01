package lab5_2;

import lab5.DecoyDuck;
import lab5.Duck;
import lab5.MallardDuck;
import lab5.RedheadDuck;
import lab5.RubberDuck;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IShape[] shapes= {new Circle(1),new Rectangle(2,5),new Tringle(12,4)};
		
		double sumofarea=0;
		for(IShape s:shapes) {
			
			sumofarea+=s.computeArea();
		}
		
		System.out.println("Sum of Areas = "+sumofarea);
	}

}
