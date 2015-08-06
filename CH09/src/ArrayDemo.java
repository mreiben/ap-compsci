/**
 * Practice using arrays
 * 
 * @author jason
 *
 */

import java.util.Arrays;

public class ArrayDemo
{
  // display the array
  public static void printArray(int[] arr)
  {
   for (int i = 0; i < arr.length; i++)
   {
     System.out.print(arr[i] + "  ");
   }
   System.out.println();
  }

  // display using for-each loop
  public static void displayForEachArray(int[] arr)
  {
   for (int elem : arr)
   {
     System.out.print(elem + "  ");
   }
  }
  // display backwards
  public static void printArrayBackwards(int[] arr)
  {
   for (int i = arr.length - 1; i > 0; i--)
   {
     System.out.print(arr[i] + "  ");
   }
  }
  // find the maximum value
  public static int maxArray(int[] arr)
  {
    int max = arr[0];
    for (int elem : arr)
    {
      if (elem > max)
      {
        max = elem;
      }
    }
    return max;
  }
  // double each value
  public static void doubleArray(int[] arr)
  {
   for (int i = 0; i < arr.length; i++)
   {
     int val = arr[i] * 2;
     System.out.print(val + "  ");
   }
  }

  // alternate add and subtract

  // find sum of odd values
  public static void sumOddArray(int[] arr)
  {
   int sum = 0;
   for (int i = 0; i < arr.length; i++)
   {
     if (Math.abs(arr[i]) % 2 == 1)
     {
       sum += arr[i];
     }
   }
   System.out.print("The sum of the odd array elements is: " + sum);
  }
  // square each value
  public static void squareValues(int[] arr)
  {
    for (int i = 0; i < arr.length; i++)
    {
      arr[i] = arr[i]*arr[i];
    }
  }
  public static void squareValues2(int[] arr) // ERROR - won't work, for-each loop can't modify array values
  {
    for (int elem : arr)
    {
      elem *= elem;
    }
  }

  // sort in ascending order, needed to import java.util.Arrays

  //
  public static void main(String[] args)
  {
    // int[] nums = new int[10];
    // System.out.println(nums[1]); //local variable array of int initialzed to
    // 0 when undefined
    //
    // double[] nums2 = new double[10];
    // System.out.println(nums2[1]); //local variable array of double
    // initialized to 0.0 when undefined
    //
    // String[] words = new String[10]; //local variable array of Strings
    // initialized to null when undefined
    // System.out.println(words[1]);
    //
    // boolean[] flags = new boolean[10]; //local variable array of booleans
    // initialized to false when undefined
    // System.out.println(flags[1]);
    int[] nums = {3, 7, 30, -5, 0, 2};

    //printArray(nums);
    //displayForEachArray(nums);
    //printArrayBackwards(nums);
    //maxArray(nums);
    //doubleArray(nums);
    //sumOddArray(nums);
    //printArray(nums);
    //squareValues(nums);
    //System.out.println();
    //printArray(nums);
    
    printArray(nums);
    Arrays.sort(nums);
    printArray(nums);
    
  }

}
