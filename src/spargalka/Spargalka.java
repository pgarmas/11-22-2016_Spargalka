/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spargalka;

import java.util.Scanner;

/**
 *
 * @author polina.garmas
 */
public class Spargalka {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pick = chooseFigure();
        int area=0;
//        switch(pick)
//        {
//            case 1: area=square(5); break;
//            case 2: area=rectangle(); break;
//            case 3: rightTriangle(); break;
//            case 4: circle(); break;
//            case 5: parallelogram(); break;
//            default: 
//                System.out.println("Выбирать надо было от одного до пяти");
//	    break;    
//        }
        
        
        System.out.println("Area: "+area+ "cm2");  

        
        repeat("12312312312123", 5);
        repeat("Саша", 3);
        
        x3(pick);
    }
    
    public static int square(int side)
    {
        int area=side*side;
        return area;
    }
    
    public static int rectangle(int width, int length)
    {
        int area=width*length;
        return area;
    }

    private static void rightTriangle() {
        int width;
        width=1;
      int length;
        length=1;
        
        System.out.println("Enter width: ");
        Scanner in = new Scanner(System.in);
        width = in.nextInt();
        
        System.out.println("Enter length: ");
        length = in.nextInt();
        
        int area=(width*length)/2;
        
        System.out.println("Area: "+area+ "cm2");
        
    }

    public static float circle(int R) {
        return (float)Math.PI*R*R;
    }

    private static void parallelogram() {
        // TODO написать код расчета параллелограма
        int A;
        A=1;
      int H;
        H=1;
        
        System.out.println("Enter width: ");
        Scanner in = new Scanner(System.in);
        A = in.nextInt();
        
        System.out.println("Enter length: ");
        H = in.nextInt();
        
        int area=A*H;
        
        System.out.println("Area: "+area+ "cm2");
        
    }

    private static int chooseFigure() {
        Scanner snr = new Scanner(System.in);
        System.out.println("Выберите фигуру для расчетов:");
        System.out.println("1 - Квадрат");
        System.out.println("2 - Прямоугольник");
        System.out.println("3 - Прямоугольный треугольник");
        System.out.println("4 - Круг");
        System.out.println("5 - Паралеллограм");
        int pick = snr.nextInt();
        return pick;
    }
    private static void repeat(String text, int times){
        
        for (int i = 1; i <= times; i++){
          System.out.println(text);  
        }
        
        
    }

    private static int x3(int pick) {
        
        int kord=pick*3;
        return kord;
       
    }
    
    public static String getSasha(){
        
        return "Саша";
    }
    
    public float getTotalCost(int quantity)
    {
        float price;
        if (quantity>100) {
            price=quantity*0.9f;
        }else price=quantity;
        return price;
    }
    
    
}
    
