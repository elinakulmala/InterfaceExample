public class InterfaceExample {

	public static void main(String[] args) {

		Square s = new Square(5);
		// square1.calcArea();	
		s.printArea();
	}
}


interface Shape
{
	public double calcArea();
    public void printArea();
}

class Square implements Shape
{
	private double side;
	
	public Square(int side)
	{
		this.side = side;
	}

	@Override
	public double calcArea() {
		return side*side;
	}

	@Override
	public void printArea() {
		System.out.println(side*side);
	}

}