class Main {

    public static void main(String[] args) {

        BinarySearch bs = new BinarySearch(10);

        bs.SetList();
        bs.GetList();

        int index = bs.binarySearch(10);

        if (index == -1) {
            System.out.println("Key item does not exist");
        }
        else {
            System.out.println("Key item exists at index: " + index);
        }
    }
}
