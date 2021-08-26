import java.util.Scanner;

public class MainClass
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        BucketSort bucketSort = new BucketSort();
        
        int arraySize;
        float array[];
        int arrayLength;
        
        System.out.print("How many values do you want to enter? ");
        arraySize = scan.nextInt();
        
        array = new float[arraySize];
        arrayLength = array.length;
        
        System.out.println();
        for (int i = 0; i < arrayLength; i++) {
            String inputLabel = String.format("Enter a decimal number in array[%d]: ", i);
            System.out.print(inputLabel);
            array[i] = scan.nextFloat();
        }
        
        System.out.println();
        System.out.println("The elements in the array were:");
        for (float el : array) {
            System.out.print(el + " ");
        }
        System.out.println();
        
        bucketSort.bucketSort_Nr(array, arrayLength);
 
        System.out.println();
        System.out.println("Sorted array is:");
        for (float el : array) {
            System.out.print(el + " ");
        }
    }
}