import java.util.*;
import java.util.ArrayList;

public class BucketSort
{
    //With Integers and Floating point values
    public void bucketSort_Nr(float arr[], int n)
    {
        float 
            max = maximum(arr), 
            min = minimum(arr);
        int noOfBuckets = (int)(max - min) + 1;
        
        //If the array is empty
        if (n <= 0)
            return;
 
        //ArrayList is better than Vector
        ArrayList<Float>[] arrayBucket = new ArrayList[noOfBuckets];
 
        for (int i = 0; i < noOfBuckets; i++) {
            arrayBucket[i] = new ArrayList<Float>();
        }
 
        // Putting all the array elements from arr[] in different buckets
        for (float elements : arr) {
            int idx = (int)((elements - min)/noOfBuckets);
            arrayBucket[idx].add(elements);
        }
 
        // Sorting individual buckets
        for (List<Float> bucket : arrayBucket) {
            //The insertion sort
            Collections.sort(bucket);
        }
 
        // Insert the sorted values in arr[]
        int index = 0;
        for (int i = 0; i < noOfBuckets; i++) {
            for (int j = 0; j < arrayBucket[i].size(); j++) {
                arr[index++] = arrayBucket[i].get(j);
            }
        }
    }
    
    //With Floating point values only and no integers
    public void bs_Prototype4(float arr[], int n)
    {
        //If length is zero
        if (n <= 0)
            return;
 
        //ArrayList is better than Vector
        ArrayList<Float>[] arrayBucket = new ArrayList[n];
 
        for (int i = 0; i < n; i++) {
            arrayBucket[i] = new ArrayList<Float>();
        }
 
        // Putting all the array elements in different buckets
        for (int i = 0; i < n; i++) {
            int idx = (int)arr[i] * n;
            arrayBucket[idx].add(arr[i]); 
        }
 
        // Sorting individual buckets
        for (List<Float> bucket : arrayBucket) {
            //The insertion sort
            Collections.sort(bucket);
        }
 
        // Concatenating all buckets into arr[]
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arrayBucket[i].size(); j++) {
                arr[index++] = arrayBucket[i].get(j);
            }
        }
    }
    
    private float minimum(float array[]) {
        float minEl = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minEl) {
                minEl = array[i];
            }
        }
        
        return minEl;
    }
    
    private float maximum(float array[]) {
        float maxEl = array[0];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxEl) {
                maxEl = array[i];
            }
        }
        
        return maxEl;
    }
}
