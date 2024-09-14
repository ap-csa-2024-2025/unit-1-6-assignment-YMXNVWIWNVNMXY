public class Problem2
{
  public static void main(String[] args)
  {
  double trouble1 = 57.3934;
  double trouble2 = 22.5211;
  int trouble1Rounded = (int) (trouble1 + 0.5);
  int trouble2Rounded = (int) (trouble2 + 0.5); //since casting truncates the decimal, when converting from double to int, adding .5 ensures that numbers that are supposed to round up get truncated so that they become the next number up which basically makes them round to a whole integer
  int sum1 = trouble1Rounded + trouble2Rounded;
  System.out.println("Two original numbers: ");
   System.out.println("numerator: " + trouble1);
   System.out.println("denominator: " + trouble2);
   System.out.println("Answer: " + trouble1Rounded + " + " + trouble2Rounded + " = " + sum1);
  }
}
