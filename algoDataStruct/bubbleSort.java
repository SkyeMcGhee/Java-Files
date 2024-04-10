import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;

public class bubbleSort
{
   public static void main(String [] args)
   {
      //define variables
      
      int[] dataset = { 4, 3, 5, 1};
      int temp;
      
      int[] forward = new int[10000];
      int[] backward = new int[10000];
      int[] rand = new int[10000];
      
      int[] eForward = new int[10000];
      int[] eBackward = new int[10000];
      int[] eRand = new int[10000];
      
      ArrayList<Integer> tempData = new ArrayList<Integer>();
      
      int countToTestBasic = dataset.length-1;
      int iterationsBasic = 0;
      int swapBasic = 0;
      
      //Change this to load a predefined array
      //int[] predef = {1,2,3,4}
      for(int i = 0; i < 10000; i++)
      {
         // comment out the random
         int num = (int)(Math.random() * 999999);
         //int num = predef[i];
         rand[i] = num;
         eRand[i] = num;
         tempData.add(num);
       }

      Collections.sort(tempData);
     for(int i = 0; i < 10000; i++)
     {
      forward[i] = tempData.get(i);
      backward[9999-i] = forward[i];
      
      eForward[i] = forward[i];
      eBackward[9999-i] = forward[i];
     }
       
      //basic sort
      StandardBubbleSort(rand, "basic rand");
      StandardBubbleSort(forward, "basic forward");
      StandardBubbleSort(backward, "basic backward");
      
      //enhanced sort
      EnhancedBubbleSort(eRand, "enhanced rand");
      EnhancedBubbleSort(eForward, "enhanced foreward");
      EnhancedBubbleSort(eBackward, "enhanced backward");
   }
   
    
   public static void StandardBubbleSort(int[] dataset, String name)
   {
          //standard sort
           int countToTestBasic = dataset.length-1;
      int iterationsBasic = 0;
      int swapBasic = 0;
      int temp;
      
      for(int i = 0; i < dataset.length-1; i++)
      {
         int lastSwap = swapBasic;
         for(int j = 0; j < countToTestBasic; j++)
         {
            iterationsBasic++;
            if(dataset[j] > dataset[j+1])
            {
               swapBasic++;
               temp = dataset[j];
               
               dataset[j] = dataset[j+1];
               
               dataset[j+1] = temp;
            }
         }
      }
      
      System.out.println(name + ": iterations: " + iterationsBasic + " swaps: " + swapBasic);

   }
   
   public static void EnhancedBubbleSort(int[] dataset, String name)
   {
       //enhanced sort
       
       int temp;
      
      int countToTest = dataset.length-1;
      int iterations = 0;
      int swap = 0;
      
         for(int i = 0; i < dataset.length-1; i++)
      {
         int lastSwap = swap;
         for(int j = 0; j < countToTest; j++)
         {
            iterations++;
            int thisVal = dataset[j];
            int thatVal = dataset[j+1];
            if(thisVal > thatVal)
            {
               swap++;
               temp = dataset[j];
               
               dataset[j] = dataset[j+1];
               
               dataset[j+1] = temp;
            }
         }
         
         countToTest--;
         
         if(swap == lastSwap)
            break;
      }
      
      //results
     /* for(int k = 0; k < dataset.length; k++)
      {
         System.out.println(dataset[k]);
      }*/
      
      System.out.println(name + ": iterations: " + iterations + " swaps: " + swap);
   }
}

