/** 
 * Name: Kenneth Lapid David, cs8bwans
 * Date: January 11th, 2017
 * 
 * Compiler Error: Invalid Method Declaration
 * Incorrect: public static findMax(int[] array)
 * Fix: public static int findMax(int[] array)
 * Explanation: Since we are returing a value with type Int, we must specify so
 *              in the method header
 * 
 * Compiler Error: Invalid Statement
 * Incorrect: sum == array[i]
 * Fix: sum += array[i]
 * Explanation: "==" operator tests for equality using the boolean values
 *              true or false but we want to add up each successive int
 *              value in the int[], therefore we instead should use the
 *              "+=" operator  
 * 
 * Compiler Error: Cannot find symbol
 * Incorrect: min = array[0]
 * Fix: int min = array[0]
 * Explanation: The variable min was not initialized and could not be found
 *              therefore I initialized it to type int
 *              
 * 
 * Compiler Error: Lossy conversion from double to int
 * Incorrect: int average = ( sum / ( array.length ) );
 * Fix: double average = ( sum / ( array.length ) );
 * Explanation: Because sum is of type double, the calculated average will be 
 *              of type double
 * 
 * Compiler Error: Incomparable types: int and <nulltype>
 * Statement: if (array == null)
 * Incorrect: public static int[] arrayCopy(int array)
 * Fix: public static int[] arrayCopy(int[] array)
 * Explanation: I switched the type of array from an int to an int[]
 *              because we want to copy an int[] not a single int
 *              value
 * 
 * 
 * Runtime Error: Values of the Array are not printing out
 * Incorrect: if (array != null)
 * Correct: if (array == null)
 * Explanation: Program immediately terminated if array was not null due to the
 *              != (not equal) operator therefore I changed it to == (equal) 
 *              operator
 *
 *
 * */
 
public class FunWithIntArrays {

 // return the largest element in the input array
 public static int findMax(int[] array) {
  //short circuit protects null access
  if (array == null || array.length == 0)
   return -1;

  int max = array[0];

  for (int i = 0; i < array.length; i++) {
   if (array[i] > max) {
    max = array[i];
   }
  }

  return max;
 }

 // return the smallest element in the input array
 public static int findMin(int[] array) {
  //short circuit protects null access
  if (array == null || array.length == 0)
   return -1;

  int min = array[0];

  for (int i = 0; i < array.length; i++) {
   if (array[i] < min) {
    min = i;
   }
  }

  return min;
 }


  // return the average of elements in the input array
  public static double findAvg( int[] array ) {
    //short circuit protects null access
    if ( array == null || array.length == 0 )
      return -1;

    double sum = 0;

    for ( int i=0; i < array.length; i++ ) {
      sum += array[i];
    }

    double average =( sum / ( array.length ) );

    return average;
  }

 // return a copy of the input array
 public static int[] arrayCopy(int[] array){
  if (array == null)
   return null;

  int[] result = new int[array.length];

  for (int i = 0; i < array.length; i++) {
   result[i] = array[i];
  }
  return result;
 }

 // output the elements of the input array
 public static void printArray(int[] array) {
  if (array == null)
   return;

  for (int i = 0; i < array.length; i++) {
   System.out.print(array[i] + ", ");
  }

  System.out.println();
 }

 // return a sorted copy of the input array
 public static int[] arraySort(int[] array) {
  if (array == null)
   return null;

  int[] result = arrayCopy(array);

  for (int i = 0; i < result.length - 1; ++i) {
   for (int j = 0; j < result.length - i - 1; j++) {
    if (result[j] > result[j + 1]) {
     //swapping result[j] and result[j+1]
     int temp = result[j+1];
     result[j + 1] = result[j];
     result[j] = temp;
    }
   }
  }
  return result;
 }
}
