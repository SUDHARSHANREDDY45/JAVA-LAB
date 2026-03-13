class Sum {

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Sum s = new Sum();

        System.out.println("Result of adding two integers: " + s.sum(36, 46));

        System.out.println("Result of adding two double values: " + s.sum(30.1, 40.5));

        System.out.println("Result of adding three integers: " + s.sum(20, 36, 46));
    }
}
