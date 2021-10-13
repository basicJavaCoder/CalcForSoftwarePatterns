package MyCalculator;

public class CalcDriver {

 public static void main(String[] args) {

  Multiply mult = new Multiply();
  System.out.println(mult.op(4, 6));

  Remainder remain = new Remainder();
  System.out.println(remain.op(24, 7));

  Divide newDivide = new Divide();
  System.out.println(newDivide.op(666, 3));

 }

}
