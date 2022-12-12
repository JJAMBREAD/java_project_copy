package ch12_map.hashmap_1024;

public class AnimalHashMapTest {

	public static void main(String[] args) {
		AnimalHashMap animalHashMap = new AnimalHashMap();
		
		Animal Animal1 = new Animal(1001, "고양이");
		Animal Animal2 = new Animal(1002, "강아지");
		Animal Animal3 = new Animal(1003, "토끼");
		Animal Animal4 = new Animal(1004, "호랑이");
		
	
		animalHashMap.addAnimal(Animal1);
		animalHashMap.addAnimal(Animal2);
		animalHashMap.addAnimal(Animal3);
		animalHashMap.addAnimal(Animal4);
	
		
		animalHashMap.showAllAnimal();
		
		animalHashMap.removeAnimal(1004);
		animalHashMap.showAllAnimal();
	}
}
	
