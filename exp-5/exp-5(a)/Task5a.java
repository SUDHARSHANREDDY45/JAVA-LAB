interface Sortable
{
    void sort(int arr[]);
}

class BubbleSort implements Sortable
{
    public void sort(int arr[])
    {
        int n = arr.length;

        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements Sortable
{
    public void sort(int arr[])
    {
        int n = arr.length;

        for(int i=0;i<n-1;i++)
        {
            int min = i;

            for(int j=i+1;j<n;j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}

public class Task5a
{
    public static void main(String args[])
    {
        int arr1[] = {34,12,45,7,19};
        int arr2[] = {25,10,30,5,15};

        Sortable ref;

        ref = new BubbleSort();
        ref.sort(arr1);

        System.out.println("Array sorted using BubbleSort");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        ref = new SelectionSort();
        ref.sort(arr2);

        System.out.println("Array sorted using SelectionSort");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i] + " ");
        }
    }
}
