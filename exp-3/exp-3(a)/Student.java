class Student{
  String name;
  int age;
  double marks;
Student(){
}
Student(String name,int age,double marks){
  this.name=name;
  this.age=age;
  this.marks=marks;
}
void display(){
  System.out.println("Name :"+name);
  System.out.println("age :"+age);
  System.out.println("marks :"+marks);
}
}
