import java.util.Scanner;

public class BinarySearch {

    int list[];
    int size;

    BinarySearch(int size) {
        this.size = size;
        list = new int[size];
    }

    void SetList() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter " + size + " sorted elements:");

        for (int i = 0; i < size; i++) {
            list[i] = sc.nextInt();
        }
    }

    void GetList() {
        System.out.println("Elements in the list are:");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    int binarySearch(int key) {

        int low = 0;
        int high = size - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (list[mid] == key) {
                return mid;   
            }
            else if (list[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1;   
    }
}
