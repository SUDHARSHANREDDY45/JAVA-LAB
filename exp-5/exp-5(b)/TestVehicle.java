public class  TestVehicle
{
    public static void main(String args[])
    {
        Vehicle v;

        v = new Car();
        v.run();

        v = new Bike();
        v.run();

        v = new Vehicle();
        v.run();
    }
}
