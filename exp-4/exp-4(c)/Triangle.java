class Triangle extends Figure {
  Triangle(double base,double height) {
    super(base,height);
  }
  double area() {
    double result=0.5*dim1*dim2;
    return result;
  }
}
