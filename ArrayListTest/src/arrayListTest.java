

import java.util.*;

public class arrayListTest {

	public static void main(String[] args) {
		   ArrayList<Car> cars = new ArrayList<>();
		   Car ferrari = new Car("Ferrari spider");
		   Car lambo = new Car("Lamborgini mursilago");
		   Car pagani = new Car("Pagani zonda");
		   cars.add(pagani);
		   cars.add(ferrari);
		   cars.add(lambo);
		   System.out.println(cars.size() );
		}
}