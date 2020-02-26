package caom.example.gettersetter;

public class MainGetterSetter {

	public static void main(String[] args) {
		
		Cat barsik = new Cat("Барсик", 5, 4);
		
		System.out.println("Имя кота " + barsik.getName());
		System.out.println("Возраст кота " + barsik.getEar() + " лет");
		System.out.println("Вес кота " + barsik.getWeight() + " кг");
		

	}

}
