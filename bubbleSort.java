import java.util.Arrays;
import java.util.Scanner;

class mainClass
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
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
public static void bubbleSort(int arr[])
{
    for(int i=0;i<arr.length-1;i++)
    {
        boolean swapped = false;
        for(int j=0;j<arr.length-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp; 
                swapped = true;
            }
        }
    if(!swapped)
    {
        break;
    }
    }
}
}   