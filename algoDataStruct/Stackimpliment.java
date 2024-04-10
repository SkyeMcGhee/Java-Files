public class Stackimpliment           
{
    public static void main(String [] args)
   {
      final int MAXSIZE=10;
   Stack stack[] = new Stack[10];
   int firstVal = 42;
   stack.push(firstVal);
   
   System.out.print(stack.print());
   }

}
