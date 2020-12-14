/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant_controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ParentClass {
    public double ChickenBurger;
    public double BeefBurger;
    public double  Pizza;
    public double ChickenPasta;
    public double ShirmpPasta;
    public double Sandwich;
    
    public double MilkShake;
    public double OreoMilkShake;
    public double  VanillaMilkShake;
    public double ChocolateMilkShake;
    public double ClassicVanilla;
    public double RaspberryMilkShake;
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    
    public double GetAmount()
    {
      Meals = ChickenBurger + BeefBurger + Pizza + ChickenPasta + ShirmpPasta + Sandwich;
      Drinks = MilkShake + OreoMilkShake + VanillaMilkShake + ChocolateMilkShake + ClassicVanilla + RaspberryMilkShake;
      TotalofMD = Meals + Drinks;
      AllTotalofMD =  TotalofMD;
      return AllTotalofMD;
    }
    private JFrame frame;
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
         if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Restaurant Management System",
                 JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
            
        }
        
    }
    
    //price
    public double pChickenBurger = 160;
    public double pBeefBurger = 160;
    public double  pPizza = 500;
    public double pChickenPasta = 180;
    public double pShirmpPasta = 200;
    public double pSandwich = 80;
    
    public double pMilkShake = 100;
    public double pOreoMilkShake = 130;
    public double  pVanillaMilkShake = 120;
    public double pChocolateMilkShake = 125;
    public double pClassicVanilla = 135;
    public double pRaspberryMilkShake = 140;
    
  //Tax
    public double mcTax = 0.90;
    
    public Double cFindTax(double cAmount)
    {
        double FindTax = cAmount - (cAmount * mcTax);
        return FindTax;
    }
}
