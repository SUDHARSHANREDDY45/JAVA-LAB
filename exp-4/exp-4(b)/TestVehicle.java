class TestVehicle {
  public static void main(String args[]) {
    ElectricBike eBike=new ElectricBike();
    eBike.pedalType="straight";
    eBike.engineCapacity=200;
    eBike.batteryCapacity=500;
    eBike.showBicycleInfo();
    eBike.showMotorbikeInfo();
    eBike.showElectricBikeInfo();
  }
}
