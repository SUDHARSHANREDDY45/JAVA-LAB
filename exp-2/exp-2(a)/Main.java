class Main {

    public static void main(String[] args) {

        Rectangle rect = new Rectangle();

        rect.length = 10;
        rect.breadth = 5;

        double area = rect.area();
        double perimeter = rect.perimeter();
        System.out.println("Area of given rectangle: " + area);
        System.out.println("Perimeter of given rectangle: " + perimeter);
    }
}
