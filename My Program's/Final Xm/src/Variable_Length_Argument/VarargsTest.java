package Variable_Length_Argument;

//Fig. 7.20: VarargsTest.java
//Using variable-length argument lists.

public class VarargsTest 
{
// calculate average
public static double average( double... numbers )
{
   double total = 0.0; // initialize total

   // calculate total using the enhanced for statement
   for ( double d : numbers )
      total += d;

   return total / numbers.length;
} // end method average

public static void main( String args[] ) 
{
   double d1 = 10.0;
   double d2 = 20.0;
   double d3 = 30.0;
   double d4 = 40.0;

   System.out.print( "D1: " +d1+"\nD2: " +d2+"\nD3: " +d3+"\nD4: " + d4);
      

   System.out.print( "\nAverage:"+average( d1, d2 ) ); 
   
   System.out.printf( "\nAverage of d1, d2 and d3 is %.1f\n",  average( d1, d2, d3 ) );
     
   System.out.printf( "\nAverage of d1, d2, d3 and d4 is %.1f\n",  average( d1, d2, d3, d4 ) );
     
} // end main
} // end class VarargsTest

