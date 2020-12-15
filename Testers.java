/** 
 * Name: Kenneth Lapid David, cs8bwans
 * Date: January 11th, 2017
 * */
/**
Document this file. Class Headers, Method Headers, 
in-line comments, and all style guidelines.

Throwing exceptions as seen in TestExamples.java is convenient, but 
you may write your testers however you want as long as they actually
check the functionality of the code and allow you to determine the
correctness of it.
*/
public class Testers {
    String alwaysPrint;
    
    
    /* TODO
    */
    public Testers(){
        alwaysPrint = "No-Arg Constructor Called";
    }
    /** TODO Method definitions go here */



    /* TODO 
    */
    public static void main (String[] args) {
        Testers testers = new Testers();

        /** TODO Put method calls go here */
     
      /* Instead of printing out anagrams, I get a null pointer exception
       * when the reference s = null
       * */
        String[] s = null;
        ReadDocumentation.p1(s,"abc");
 /*       
/* Nullpointer exception appears when String[] test points
         * to an array containing null values
         * */
        String[] test = new String[1000];
        ReadDocumentation.p1(test,"abs");
        
        /* Nullpointer exception appears when String t refers to a
         * null object
         */
        String[] test1 = {"2fs", "f", "5tg"};
        String t = null;
        ReadDocumentation.p1(test,t);
      
        /* Normal test case failed: Did not give the correct output. 4 + 1 = 5
         * and 6 + 8 = 14 but returned Integer[] has values {6,4} instead of
         * {5,14}
         * */
        Integer[] a = {4,6};
        Integer[] b = {1,8};
        Integer[] add = ReadDocumentation.p2(a,b);
        for(int i = 0; i < add.length; i++){
          System.out.println(add[i]);
        }
        
        /* Nullpointer exception when passing in an Integer[] in which the
         * reference is null
         * */
        Integer[] c = null;
        Integer[] d = {1,5,3};
        Integer[] add1 = ReadDocumentation.p2(c,d);
        for(int i = 0; i < add.length; i++){
          System.out.println(add[i]);
        }
        
        /* Array out of bounds error when f.length > s.length*/
        Integer[] h = {0,0};
        Integer[] i = {1,5,3};
        Integer[] add2 = ReadDocumentation.p2(h,i);
        for(int j = 0; j < add.length; j++){
          System.out.println(add[j]);
        }
        
        /* Array index goes out of bounds when entering an int value
         * greater than one digit
         * */
        Integer[] testerF = {0,0};
        Integer[] testerS = {12,8};
        Integer[] add3 = ReadDocumentation.p2(testerF,testerS);
        for(int k = 0; k < add.length; k++){
          System.out.println(add[k]);
        }
        
        /* Illegal argument when min is a greater value than max
         * */
        int min = 76;
        int max = 65;
        String[] testing = ReadDocumentation.p3(min,max);
        for(int x = min ; x < max; x++){
          System.out.println(test[x]);
        }
        
        /* When inputing a large int value, the program crashes as it is not
         * able to handle such capacity
         * */
        int min2 = 12142343;
        int max2 = 76;
        String[] teststing2 = ReadDocumentation.p3(min,max);
        for(int y = min; y < max; y++){
          System.out.println(test[y]);
         }
        
       /* When min = max index 90 gives us an array out of bounds error rather
        * than a string */
        int min3 = 90;
        int max3 = 90;
        String[] testing3 = ReadDocumentation.p3(min,max);
          System.out.println(test[90]);
      
       
    }
}
