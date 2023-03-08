package Cau1;

public class Main_Normal_value {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println("Diện tích hình h1: "+ c1.getArea() +
                ", chu vi hình h1: " + c1.getCircumference());
        System.out.println("Diện tích hình h2: "+ c2.getArea() +
                ", chu vi hình h2: " + c2.getCircumference());
    }
}
