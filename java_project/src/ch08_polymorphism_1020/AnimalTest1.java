package ch08_polymorphism_1020;

import java.util.ArrayList;

class Animal{
	
	// 각자 좋아하는 동물 클래스는 만듭니다. ex) Dog
	// 각 동물들의 공통 기능, move, eat,
	// 공통 기능 추가 소리나는 기능 추가. sound
	// Animal 있고, 각 하위 클래스에서 재정의해서 사용을 합니다.
	// 좋아하는 동물 클래스를 move, eat, sound 실행해보기.
	
	public void move()
	{
		System.out.println("동물이 움직입니다.");
	}


public void eat()
{
	System.out.println("동물이 밥 먹었다.");
}

public void sound(){
	System.out.println("동물이 울음소리를 냅니다. ");
	}
}

class Human extends Animal{
	public void move()
	{
		System.out.println("사람이 두 발로 걷습니다. ");
	}
	
	public void readBook()
	{
		System.out.println("사람이 책을 읽습니다. ");
	}
	public void sound(){
		System.out.println("사람이 말소리를 냅니다. ");
		}

public void eat()
{
	System.out.println("사람이 밥을 먹는다. ");
}
}

class Tiger extends Animal{
	public void move()
	{
		System.out.println("호랑이가 네 발로 뜁니다. ");
	}
	
	public void hunting() 
	{
		System.out.println("호랑이가 사냥을 합니다. ");
	}
	public void sound(){
		System.out.println("호랑이가 어흥어흥 소리를 냅니다. ");
		}

public void eat()
{
	System.out.println("호랑이는 고기를 먹는다. ");
}}

class Eagle extends Animal{
	public void move()
	{
		System.out.println("독수리가 하늘을 납니다 ");
	}
	
	public void flying() 
	{
		System.out.print("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
	}
	public void sound(){
		System.out.println("독수리가 울음 소리를 냅니다. ");
		}
public void eat()
{
	System.out.println("독수리는 고기를 먹는다. ");
}}

class Lsy extends Animal{
	public void move()
	{
		System.out.println("이상용 걸어감.");
	}
	
	public void read() 
	{
		System.out.println("이상용 책 봄.");
	}
	
	public void sound(){
		System.out.println("이상용이 말을 함 ");
		}

public void eat()
{
	System.out.println("이상용이 밥 먹음 ");
}}


class Cat extends Animal{
	public void move()
	{
		System.out.println("고양이가 네 발로 걷습니다. ");
	}
	
	public void eat(){
	System.out.println("고양이는 사료를 먹는다. ");
	}
	
	public void sound(){
		System.out.println("고양이는 야옹야옹 소리를 냅니다. ");
		}

}


public class AnimalTest1 {
	//상속이라는 개념이 
	// 재사용성, 중복제거. 
	// 다형성 -> 재할당을 할 때 , 받을 수 있는 매개변수의 범위를 넓히자. 
	// 한계 , 상속이 한번만, 그러면, 기능을 다르게 매번 구현을 할려면, 
	// 자식 클래스에서 구현 하고 싶은 기능이 다양함, 하지만, 반드시 이기능은 꼭 써주세요 라는 부분이 있더라. 
	// 강제성이 필요할 때가 있음. 
	// 해당 기능을 각 자식 클래스에서 다르게 구현을 유연하게 하기 위해서 -> 인터페이스, 추상클래스. 
	
	 public static void main(String[] args) {
		  AnimalTest1 aTest = new AnimalTest1();
//		  Human h1 = new Human();
//		  aTest.moveAnimal(h1);
		  aTest.moveAnimal(new Human());
		  aTest.moveAnimal(new Tiger());
		  aTest.moveAnimal(new Eagle());
		  aTest.soundAnimal(new Cat());
		  Cat cat = new Cat();
		  Lsy lsy = new Lsy();
		  Tiger tiger = new Tiger();
		  aTest.eatAnimal(tiger);
		  aTest.moveAnimal(lsy);
		  aTest.soundAnimal(cat);
		  Human h1 = new Human();
		  aTest.soundAnimal(h1);
	 }

		 
	
	 public void moveAnimal(Animal animal) {
		  animal.move();                     }

	 public void soundAnimal(Animal animal) {
		  animal.sound();}
	 
	 public void eatAnimal(Animal animal) {
	  animal.eat(); 
	 
	 } }
	 




