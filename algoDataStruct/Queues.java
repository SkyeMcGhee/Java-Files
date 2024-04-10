
public class Queues 
{
   final int QUEUESIZE=5; // Queue size will be 5
   char queue[] = new char[QUEUESIZE]; // Array called queue and can store 10 characters
  
   int head = 0; // head: Element 0 for start of queue
   int tail = -1; // tail: Element -1 to indicate there are no elements in the queue
   int noElements = 0; // noElements: 0 because there are no elements initially; but this is variable
  
   // Insert method
   public void insert(char elementToInsert) 
   {
      // Check if the queue is full
      if (noElements == QUEUESIZE) 
      {
         System.out.println("Error: Queue is full");
      } 
      else 
      {
         // Check if tail has reached the end of the array
         if (tail == QUEUESIZE - 1) 
         {
            tail = 0; // Circle around to the beginning
         } 
         else 
         {
            tail++; // Move tail to the next position
         }
      
         // Insert the element at the position indicated by tail
         queue[tail] = elementToInsert;
      
         // Increment the number of elements in the queue
         noElements++;
      }
   }
   
   // Remove method
   public char remove() 
   {
      // Check if the queue is empty
      if (noElements == 0) 
      {
         System.out.println("Error: Queue is empty");
         return '\0'; // Return null character to indicate an empty slot
      } 
      else 
      {
         char itemToReturn = queue[head]; // Store the item to be returned
      
         // Check if head has reached the end of the array
         if (head == QUEUESIZE - 1) 
         {
            head = 0; // Wrap around to the beginning
         } 
         else 
         {
            head++; // Move head to the next position
         }
      
         // Decrement the number of elements in the queue
         noElements--;
      
         return itemToReturn; // Return the removed item
      }
   }
   
   // isEmpty method
   boolean isEmpty()
   {
      if(noElements == 0) // If the number of elements is 0, then it's empty, so return true
         return true;
      else
         return false; // This is a pointless statement, but Gary included so I left it in
   }
   
   // isFull method 
   boolean isFull()
   {
      if(noElements == QUEUESIZE) // If the current number of elements equals the maximum size then it's full
         return true;
      else
         return false; // This is a pointless statement, but Gary included so I left it in
   }
   
   // Head of queue return
   char queueTop()
   {
      if (!isEmpty()) // Check if the queue is not empty
         return queue[head]; // If not, return the head of the queue
      else
         return '\0'; // Just return null to indicate an empty slot
   }
   
   // Size method
   int size()
   {
      return noElements; // Returns the *current* size of the queue
   }

   public static void main(String[] args) 
   {
      Queues queueObj = new Queues(); // Create a queue object
      
      queueObj.insert('K'); // Insert the character K into the array
      queueObj.insert('L'); // Insert the character L into the array
      queueObj.insert('I'); // Insert the character L into the array
      queueObj.insert('T'); // Insert the character L into the array
      
      System.out.println(queueObj.size()); // Print the current size of the array
      System.out.println("Queue is full: " + queueObj.isFull()); // Check if the queue is full
      System.out.println("Queue top: " + queueObj.queueTop()); // Check what character is at the front (head) of teh queue
      System.out.println("Removed element is: " + queueObj.remove());
   }
}
