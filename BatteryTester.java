/**
Name : Bhumik Patel
Project: p8.4
Goal: Write a Tester class for the Battery.java code
*/
import java.util.*;
public class BatteryTester
{
   public static void main(String[] args)
   {
   System.out.println("1. student's name : Bhumik Patel");
   System.out.println("2. project: p8.4");
   System.out.println("3. Being testing");
   System.out.println("4. create an Battery with 2000 mAh");
   Battery BatteryAA = new Battery(2000);
   System.out.println("5. Remaining capacity:" + BatteryAA.getRemainingCapacity());
   System.out.println("6. Expected............: 2000.0");
   System.out.println("7. Drain 1000 mAh.");
   BatteryAA.drain(1000);
   System.out.println("8. Remaining capacity: " + BatteryAA.getRemainingCapacity());
   System.out.println("9. Expected.........: 1000.0");
   System.out.println("10. recharge the battery.");
   BatteryAA.recharge();
   System.out.println("11. Remaining capacity: " + BatteryAA.getRemainingCapacity());
   System.out.println("12. Expected........: 2000.0");
   System.out.println("13. End Testing.");
   
}
}