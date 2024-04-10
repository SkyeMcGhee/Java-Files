public class Stack           
{

   final int MAXSIZE=10;
   int stack[] = new int[MAXSIZE];
   int top = -1;   

   void push(int elementToPush){
	   if(!isFull()){
	      top++;	
            stack[top]=elementToPush;
      } 
	}
   
   int pop(){
	   int itemPopped=-1;	   
	   if(!isEmpty()){
	      itemPopped=stack[top];
	      top--; 
   }
	   return itemPopped;
	}
   
   boolean isEmpty(){			
		   if(top == -1)   
		      return true;
		   else
		      return false;
		}

   boolean isFull(){			
	   	   if(top == MAXSIZE-1)
		      return true;
		   else
		      return false;
		}
      
   int peek(){			
		   if(!isEmpty())
		      return stack[top];
		   else
		   return -1;}
         
   int size(){			
		   return top+1;
		}
      
      void print(){			
System.out.print("\nSTACK CONTAINS ==> ");		   	          
for(int i=0; i<=top; i++)
		      System.out.print(stack[i] + ",");
		}





}