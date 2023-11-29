/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahma_Izza
 */
import java.util.Scanner;

public class CalculatorBMI 
{
  
  static void CalculateBMI(float weight, float height) 
  {
    
    float BMI = ( 100 * 100 * weight ) / ( height * height ); 
    // multiplying 100 * 100 to convert cm to m
    
    System.out.println("\nYour BMI value: " + BMI);
    
    if(BMI < 18.5)
      System.out.println("You are underweight!");
    else if(BMI < 25)
      System.out.println("You are normal:)");
    else if(BMI < 30)
      System.out.println("You are overweight!");
    else
      System.out.println("You are obese!");
    
  } 
  
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("BMI CALCULATOR");
    System.out.print("Masukkan Berat Badanmu (kg): ");
    float berat = sc.nextFloat();
    System.out.print("Masukkan Tinggi Badanmu (cm): ");
    float tinggi = sc.nextFloat();
    
    CalculateBMI(berat, tinggi);
  }
  
}
