class Rectangle extends Figure {
  Rectangle(double length,double breadth) {
    super(length,breadth);
  }
  double area() {
    double result=dim1*dim2;
    return result;
  }
}
