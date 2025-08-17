import java.util.Arrays;
import java.util.Scanner;

class MainClass
{
       public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("no of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter "+ n + " elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
public static void insertionSort(int arr[])
{
    for(int i = 1;i<arr.length;i++)
    {
        int current = arr[i];
        int j = i-1;    
        while(j>=0 && arr[j] > current)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = current; 
    }
}
}