package hello.world;

import java.util.Scanner;

abstract class Figure {
	double dim1;

	abstract void findArea();

	abstract void findPerimeter();
}

class Circle extends Figure {

	Circle(double dim1) {
		this.dim1 = dim1;
	}

	@Override
	void findArea() {
		double area = (Math.PI * (Math.pow(dim1, 2)));
		System.out.println("Circle Area: " + area);
	}

	@Override
	void findPerimeter() {
		double perimeter = (2 * Math.PI * dim1);
		System.out.println("Circle perimeter: " + perimeter);
	}

}

class Rectangle extends Figure {
	double dim2;

	Rectangle(double dim1, double dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	@Override
	void findArea() {
		double area = (dim1 * dim2);
		System.out.println("Rectangle area: " + area);
	}

	@Override
	void findPerimeter() {
		double perimeter = ((2 * dim1) + (2 * dim2));
		System.out.println("Rectangle perimeter: " + perimeter);
	}

}

class Triangle extends Figure {
	double dim2;
	double dim3;

	Triangle(double dim1, double dim2, double dim3) {
		this.dim1 = dim1;
		this.dim2 = dim2;
		this.dim3 = dim3;
	}

	@Override
	void findArea() {
		double p = (dim1 + dim2 + dim3) / 2;
		double area = Math.sqrt(p * (p - dim1) * (p - dim2) * (p - dim3));
		System.out.println("Tringle area: " + area);
	}

	@Override
	void findPerimeter() {
		double perimeter = dim1 + dim2 + dim3;
		System.out.println("Traingle perimeter: " + perimeter);
	}

}

public class Figures {

	public static void main(String[] args) {

		double dim1, dim2, dim3;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Circle radius: ");
		dim1 = scan.nextDouble();
		Circle c = new Circle(dim1);
		c.findArea();
		c.findPerimeter();
		System.out.println();

		System.out.println("Enter Rectangle side 1: ");
		dim1 = scan.nextDouble();
		System.out.println("Enter Rectangle side 2: ");
		dim2 = scan.nextDouble();
		Rectangle r = new Rectangle(dim1, dim2);
		r.findArea();
		r.findPerimeter();
		System.out.println();
		
		System.out.println("Enter Triangle side 1: ");
		dim1 = scan.nextDouble();
		System.out.println("Enter Triangle side 2: ");
		dim2 = scan.nextDouble();
		System.out.println("Enter Triangle side 3: ");
		dim3 = scan.nextDouble();
		Triangle t = new Triangle(dim1, dim2, dim3);
		t.findArea();
		t.findPerimeter();
		System.out.println();

	}
}
