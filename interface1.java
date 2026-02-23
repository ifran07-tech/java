interface Shape {
    void area();
}

interface Print {
    void display();
}

class Circle implements Shape, Print {

    double r = 5;

    public void area() {
        double area = 3.14 * r * r;
        System.out.println("Area of Circle = " + area);
    }

    public void display() {
        System.out.println("Radius of Circle = " + r);
    }

    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.display();
        obj.area();
    }
}