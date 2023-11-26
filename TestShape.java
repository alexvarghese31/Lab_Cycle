abstract class Shape{
	abstract void numberOfSides();
}

class Rectangle extends Shape{
	void numberOfSides(){
		System.out.println("rectangle sides: 4");
	}
}

class Triangle extends Shape{
	void numberOfSides(){
		System.out.println("triangle sides: 3");
	}
}

class Hexagon extends Shape{
	void numberOfSides(){
		System.out.println("hexagon sides: 6");
	}
}

public class TestShape{
	public static void main(String args[]){
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Hexagon h = new Hexagon();
		r.numberOfSides();
		t.numberOfSides();
		h.numberOfSides();
	}
}
