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
        sc.close();
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
public static void selectionSort(int arr[])
{
    for(int i=0;i<arr.length-1;i++)
    {
        int minIndex = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex = j;
                }
            }
            if(minIndex != i)
            {
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            }
    }
}
}   