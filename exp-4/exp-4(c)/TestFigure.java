class TestFigure {
  public static void main(String[] args) {
    Figure f1=new Rectangle(15.3,23.7);
    Figure f2=new Triangle(13.5,18.2);
    System.out.println("Area of Rectangle :"+f1.area());
    System.out.println("Area of Triangle :"+f2.area());
  }
}
