import java.util.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;

/**
   This program checks which words in a file are not present in a dictionary.
*/
public class SpellCheck
{
   public static void main(String[] args) 
      throws FileNotFoundException
   {
      // Read the dictionary and the document

      Set<String> dictionaryWords = readWords("Dictionary.txt");
      Set<String> documentWords = readWords("alice30.txt");
      Map<String, Integer> wordFrequency = new TreeMap<String, Integer>();
      
      
      //create treeset to store and sort
      Set<String> misspelledWords = new TreeSet<String>();
          

      // store all words that are in the document but not the dictionary into the treeset

      for (String word : documentWords)
      {
         String currentWord = wordFrequency.get(word);
         if(currentWord == null)
         {
            wordFrequency.put(word, 1);
         }
         else
         {
            int currentFreq = wordFrequency.get(word);
            currentFreq++;
         }
         if (!dictionaryWords.contains(word))
         {
            misspelledWords.add(word);
            
         }
      }
      
      //print out sorted words
      for (String word : misspelledWords)
      {
         System.out.println(word);
      }
   }

   /**
      Reads all words from a file.
      @param filename the name of the file
      @return a set with all lowercased words in the file. Here, a 
      word is a sequence of upper- and lowercase letters.
   */
   public static Set<String> readWords(String filename)
      throws FileNotFoundException
   {
      Set<String> words = new HashSet<String>();
      Scanner in = new Scanner(new File(filename));
      // Use any characters other than a-z or A-Z as delimiters
      in.useDelimiter("[^a-zA-Z]+");
      while (in.hasNext())
      {
         words.add(in.next().toLowerCase());        
      }
      return words;
   }
}