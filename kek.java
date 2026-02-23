interface Shape {
    public void area();
}

interface Print {
    public void display();
}

class Circle implements Shape, Print {

    double ra = 5;

    public void area() {
        double ar = 3.14 * ra * ra;
        System.out.println("Area of Circle = " + ar);
    }

    public void display() {
        System.out.println("Radius of Circle = " + ra);
    }

    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.display();
        obj.area();
    }
}