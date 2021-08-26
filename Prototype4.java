import java.util.Scanner;

public class Prototype4
{
    public static void main() {
        //This will only work if all inputs do not have an integer
        // i.e. 0.535, 0.768, 0.12, ...
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
        
        bucketSort.bs_Prototype4(array, arrayLength);
 
        System.out.println();
        System.out.println("Sorted array is:");
        for (float el : array) {
            System.out.print(el + " ");
        }
    }
}
