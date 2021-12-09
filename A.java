class Animal {
	void eat()
	{
		System.out.println("Is Man Eating?");
	}
}
class Dog extends Animal{
	void bark()
	{
		System.out.println("Dog is Barking");
	}
}
class Cat extends Animal{
	void meow()
	{
		System.out.println("Cat is Meowing");
}
}
class A
{
	public static void main(String args[])
	{
		Cat c = new Cat();
		c.meow();
		
	}
}