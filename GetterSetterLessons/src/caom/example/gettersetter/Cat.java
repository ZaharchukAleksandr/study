package caom.example.gettersetter;

public class Cat {
	
	private String name;
	private int ear;
	private int weight;
	
	public Cat (String name, int ear, int weight) {
		
		this.setName(name);
		this.setEar(ear);
		this.setWeight(weight);
		
	}
	
	public void cat() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getEar() {
		return ear;
	}

	public void setEar(int ear) {
		this.ear = ear;
	}
	
//	public Cat() {
//		
//		System.out.println("У нас нет кошки");
//		
//	}
//	
//	public void sayMeow() {
//		
//		System.out.println("Кошка говорит мяю");
//		
//	}
}
