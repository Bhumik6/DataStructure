/**
 Name: Bhumik Patel
 Goal: write a Battery class that models a recharge
 */
 public class Battery
 {
     private double remaining_capacity;
     private double initial_Capacity;
     
     public Battery(double Capacity)
     {
        this.initial_Capacity = Capacity;
        this.remaining_Capacity = Capacity;
      }
        
  /**
  Amount Drain
  */
    public void drain(double amount)
    {
        remaining_capacity -= amount;
     }
     /**
     recharge the battery
     */
      
       public void recharge()
       {
         remaining_capacity = initial_Capacity;
        }
        
       
 
 
 
 }
