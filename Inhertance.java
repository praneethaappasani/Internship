class Animal
{
	void bark()
	{

		System.out.println("dog barks");
	}
}
class cat extends Animal
{
	void bark()
	{

		System.out.println("cat meows");
	}
}
class Inhertance
{

public static void main(String args[])
{	
	Animal a=new Animal();
	cat c=new cat();
	c.bark();
	a.bark();
}
}
	
	