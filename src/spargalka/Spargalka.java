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

        switch(pick)
        {
            case 1: square(); break;
            case 2: rectangle(); break;
            case 3: rightTriangle(); break;
            case 4: circle(); break;
            case 5: parallelogram(); break;
            default: 
                System.out.println("Выбирать надо было от одного до пяти");
	    break;    
        }
    }
    
    public static void square()
    {
        int side;
        side=1;
        
        System.out.println("Enter side: ");
        Scanner in = new Scanner(System.in);
        side = in.nextInt();
        
        int area=side*side;
        
        System.out.println("Area: "+area+ "cm2");
        
    }
    
    public static void rectangle()
    {
      int width;
        width=1;
      int length;
        length=1;
        
        System.out.println("Enter width: ");
        Scanner in = new Scanner(System.in);
        width = in.nextInt();
        
        System.out.println("Enter length: ");
        length = in.nextInt();
        
        int area=width*length;
        
        System.out.println("Area: "+area+ "cm2");  
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

    private static void circle() {
        
        int R;
        R=1;
        
        System.out.println("Enter R: ");
        Scanner in = new Scanner(System.in);
        R = in.nextInt();
        
        int area=Math.round((float)(Math.PI*R*R));
        
        System.out.println("Area: "+area+ "cm2");
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
    
}
    
