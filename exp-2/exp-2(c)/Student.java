class Student {

    String sname;
    int sage;
    double smarks;

    Student(String name, int age, double marks) {
        sname = name;
        sage = age;
        smarks = marks;
    }

    void display() {
        System.out.println("Name: " + sname);
        System.out.println("Age: " + sage);
        System.out.println("Marks: " + smarks);
    }
}

