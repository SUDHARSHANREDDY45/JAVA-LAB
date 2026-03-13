class Employee extends Person {
  double annualSalary;
  int yearOfJoin;
  String nationalInsuranceNumber;
  Employee(String name,int age,double annualSalary,int yearOfJoin,String nationalInsuranceNumber) {
    super(name,age);
    this.annualSalary=annualSalary;
    this.yearOfJoin=yearOfJoin;
    this.nationalInsuranceNumber=nationalInsuranceNumber;
  }
  void displayEmployeeDetails() {
    displayPersonDetails();
    System.out.println("Annual Salary is :"+annualSalary);
    System.out.println("Year of Join :"+yearOfJoin);
    System.out.println("National Insurance Number :"+nationalInsuranceNumber);
  }
}
