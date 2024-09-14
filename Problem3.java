public class Problem3
{
  public static void main(String[] args)
  {
    double duble1 = 67.3424;
    double decimal1 = duble1 - (int) duble1; //next time dont learn the hard way try to understand it before hand
    double num1 = (decimal1 * 10);
    double num2 = num1 * 10 % 10;
    double num3 = num2 * 10 % 10;

  System.out.println("decimal number: " + duble1);
  System.out.println("Answer: " + (int) num1 + " " + (int) num2 + " " + (int) num3);
  }
}
