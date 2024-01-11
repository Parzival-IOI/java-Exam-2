public class Ex2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 4);
        System.out.println("Area of Rectangle : " + r.getArea());
        System.out.println("Parimeter of Rectangle : " + r.getParimeter());

        System.out.println("\n");
        Square s = new Square(2);
        System.out.println("Area of Square : " + s.getArea());
        System.out.println("Parimeter of Square : " + s.getParimeter());
    }
}

class Rectangle {
 private double width;
 private double length;
 public Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
 }
 public double getArea() {
    return width * length;
 }
 public double getParimeter() {
     double temp = width + length;
    return (temp*2);
 }
}

class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}