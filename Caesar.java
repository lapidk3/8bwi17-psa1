/** 
 * Name: Kenneth Lapid David, cs8bwans
 * Date: January 11th, 2017
 * */

// Keep these two lines.  They are what tell Java to include the
// classes you need for working with files.
// You might get warnings about them at first.  That's OK, just
// ignore the warnings.  They should go away as you complete your code.
import java.io.*;
import java.util.*;

/** Your header comment goes here.
 * Be sure to include your name, cse account name, and the date 
 * */
public class Caesar {
 // Complete the methods below.  Be sure to add header
 // comments for each. You may (and should) also write additional
 // helper methods.  Be sure to make the helper methods private and include
 // header comments for each.

 // Although you will not be graded on style this week, you should follow
 // these basic style guidelines nonetheless.   You will be graded on this
 // in weeks to come, so start to practice now.

 // Use proper indenting: Indent each block of code (e.g., method body,
 //   loop body.  Line up the lines in the block so that they are all
 //   indented to the same degree.  See examples of this in the book
 //   and in the code below.
 // Use descriptive variable names: The names of your variables should
 //   describe the data they hold.  Almost always, your variable names
 //   should be words (or abbreviations), not single letters.
 // Write short methods: Break your methods up into submethods if they
 //   are getting too complicated or long.  Generally your methods
 //   shouldn't get too much longer than about 20 lines of code (give or take)
 // Write short lines: Each line of code should be no longer than 80
 //   characters, so it can fit in a reasonable size window.  There's a
 //   column number in both vim and emacs.
 //
 // We'll start with these, as these are the most important.  We may add
 // to this list later in the term, but if you do all of the above you're
 // in good shape.

/* Method that encrypts a message of type String given a rotation
 * @Param s: The message to be encrypted
 * @Param rotation: The amount each character is to be moved
 * @return hidden: The encrypted message
 * */
 public static String encrypt(String s, int rotation) {
  // Complete this method
  // letters are between 65 and 90 (Upper Case) and 97 and 122 (Lower Case)
  
  String hidden = "";
  char newValue;

  for(int x = 0; x < s.length(); x++){
    char old = s.charAt(x);

      while(rotation > 25){
       rotation = rotation - 26;
      }
      while(rotation < 0){
       rotation = 26 + rotation;
      }
    
    if(Character.isLetter(old)){

     int code = (int)old + rotation;

      if(Character.isUpperCase(old) && code > 90){
        code = code - 26;
       }
      if(Character.isLowerCase(old) && code > 122){
        code = code - 26;
       }
      
     newValue = (char)code;
    }
    else{ newValue = old;}

    hidden += newValue;
  }
  return hidden;
 }
 
 /* Method that decrypts a message of type String given a rotation
 * @Param s: The message to be decrypted
 * @Param rotation: The amount each character is to be moved
 * @return hidden: The decrypted message
 * */
 public static String decrypt(String s, int rotation) {
  String hidden = "";
  char newValue;

  for(int x = 0; x < s.length(); x++){
    char old = s.charAt(x);

      while(rotation > 25){
       rotation = rotation - 26;
      }
      while(rotation < 0){
       rotation = 26 + rotation;
      }
    
    if(Character.isLetter(old)){

     int code = (int)old - rotation;

      if(Character.isUpperCase(old) && code < 65){
        code = code + 26;
       }
      if(Character.isLowerCase(old) && code < 97){
        code = code + 26;
       }
      
     newValue = (char)code;
    }
    else{ newValue = old; }

    hidden += newValue;
  }
  return hidden;
 }

 /* Method that takes a character and performs a rotation then returns
  * the new rotated character
 * @Param a: The character to be rotated
 * @Param rotation: The amount the character is to be moved
 * @return hidden: The rotated character
 * */
 private static char letterOperation(char a, int rotation) {
   char rotated;
     
   if(Character.isLetter(a)){
     
     while(rotation > 25){
       rotation = rotation - 26;
     }
     while(rotation < 0){
       rotation = 26 + rotation;
     }
     
     int code = (int)a + rotation;
     
     if(Character.isUpperCase(a) && code > 90){
       code = code - 26;
     }
     if(Character.isLowerCase(a) && code > 122){
       code = code - 26;
     }
     rotated = (char)code;
   }
   else { rotated = a; }     
  return rotated;
 }

  /* Method that encrypts a message of type String given a rotation
   * but using the Stringbuilder class
 * @Param s: The message to be encrypted
 * @Param rotation: The amount each character is to be moved
 * @return hidden: The encrypted message
 * */
 public static String encryptTwo(String s, int rotation) {
  // Complete this method
  // letters are between 65 and 90 (Upper Case) and 97 and 122 (Lower Case)
 StringBuilder copy = new StringBuilder(s.length());
 char newValue;
 String message = "";

  for(int x = 0; x < s.length(); x++){
    char old = s.charAt(x);
    
    while(rotation > 25){
       rotation = rotation - 26;
      }
      while(rotation < 0){
       rotation = 26 + rotation;
      }
    
    if(Character.isLetter(old)){

     int code = (int)old + rotation;

      if(Character.isUpperCase(old) && code > 90){
        code = code - 26;
       }
      if(Character.isLowerCase(old) && code > 122){
        code = code - 26;
       }
      
     newValue = (char)code;
    }
    else{ newValue = old;}


    copy.append(newValue);
    message = copy.toString();
  }
  return message;
 }
 
  /* Method that decrypts a message of type String given a rotation
   * but using the StringBuilder class
 * @Param s: The message to be decrypted
 * @Param rotation: The amount each character is to be moved
 * @return hidden: The decrypted message
 * */
 public static String decryptTwo(String s, int rotation) {
  // Complete this method
StringBuilder copy = new StringBuilder(s.length());
 char newValue;
 String message = "";

  for(int x = 0; x < s.length(); x++){
    char old = s.charAt(x);

      while(rotation > 25){
       rotation = rotation - 26;
      }
      while(rotation < 0){
       rotation = 26 + rotation;
      }
    
    if(Character.isLetter(old)){

     int code = (int)old - rotation;

      if(Character.isUpperCase(old) && code < 65){
        code = code + 26;
       }
      if(Character.isLowerCase(old) && code < 97){
        code = code + 26;
       }
      
     newValue = (char)code;
    }
    else{ newValue = old;}

    copy.append(newValue);
    message = copy.toString();
  }
  return message;
 }
}
