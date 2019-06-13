import java.util.Scanner;
class CashRegister {
  public static void main(String[] args) {
    Scanner kin = new Scanner(System.in);
    System.out.println("Welcome to the Change Generator ");
    System.out.println("Please Enter the amount of a Bill");
    System.out.print("Bill: $");
    double Bill1 = kin.nextDouble();
    System.out.println("Please Enter the amount Paid");
    System.out.print("Paid: $");
    double Paid1 = kin.nextDouble();
    double Change = (Paid1-Bill1);
    
    System.out.println("Change: "+Change );
    int twenties = (int)(Change/20);
    System.out.println("$20: "+twenties);
    Change = Change % 20;
    
    int tens = (int)(Change/10);
    Change = Change % 10;
    System.out.println("$10: "+tens);
    
    int fives = (int)(Change/5);
    Change = Change % 5;
    System.out.println("$5: "+fives);
    
    int ones = (int)(Change/1);
    Change = Change % 1;
    System.out.println("$1: "+ones);
    
    int quarter = (int)(Change/.25);
    Change = Change % .25;
    System.out.println("$.25: "+quarter);
    
    int dimes = (int)(Change/.10);
    Change = Change % .10;
    System.out.println("$.10: "+dimes);
    
    int nickles = (int)(Change/.05);
    Change = Change % .05;
    System.out.println("$.05: "+nickles);
    
    int penny = (int)(Change/.01);
    Change = Change % .01;
    System.out.println("$.01: "+penny);
  }
}