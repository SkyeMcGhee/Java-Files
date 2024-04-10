import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;

public class Sentence{
   public boolean myBool;

   private String text;
      /**       Constructs a sentence.  
           @param aText a string containing all characters of     
                      the sentence    */
       public static void main(String [] args)
   {
      Sentence("Dog God")
   }

                      
           public Sentence(String aText) 
           
              {       text = aText;  } 
              public boolean isPalindrome()
                  { 
                     //get length of text
                     int length = text.length();
                     
                     //check if it is a single char first
                     if(length <= 1){return true;};
                     
                     //grab first and last character
                     char first = Character.toLowerCase(text.charAt(0));
                     char last = Character.toLowerCase(text.charAt(length - 1));
                     
                     //begin compare
                     if (Character.isLetter(first) && Character.isLetter(last))
                     {
                        //check if first and last match
                        if (first == last)
                        {
                           Sentence shorter = new Sentence(text.substring(1, length-1));
                           return shorter.isPalindrome();
                        }
                        //else exit
                        else return false;
                                            }
                         //if last is not a letter, shorten sentence
                           else if(!Character.isLetter(last))
                        {
                           Sentence shorter = new Sentence(text.substring(0, length-1));
                           return shorter.isPalindrome();

                        }
                        //if first is not a letter, shorten sentence
                        else
                        {
                           Sentence shorter = new Sentence(text.substring(1));
                           return shorter.isPalindrome();

                        }

                           } 
               
         }
