package laba_2;

import java.util.Scanner;

public class labka_2 {
 static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 
		 
			System.out.println("1 - Проверка теоремы Ферма");
			System.out.println("2 - Вычесления выражения ");
			int vvod=scn.nextInt();
  switch(vvod) {
  case 1 : ferma();
  break;
  case 2 : virajenie();
  break;
  }
 
		
		
	}
	
	private static void ferma() {
		       Scanner scan= new Scanner(System.in);
        System.out.println("Проверка теоремы Ферма.");
        int a=0;
        int b=0;
        int c=0;
        int v=0;
        int l=101;
        double result=0;
        boolean flag=false;
        System.out.println("Задайте степень n :");
        while (true) {
            v = scan.nextInt();
            if(v>2)
                break;
            System.out.println("Значение степени должно быть более двух!");
        }

        for (a = 1; a <l ; a++) {
            for (b = 1; b < l; b++) {
                for (c = 1; c < l; c++) {
                   result= Math.pow((double)a,(double)v) +
                           Math.pow((double)b,(double)v);
                  if(result==Math.pow((double)c,(double)v)) {
                      flag =true;
                      System.out.println("Решение найдено! a="+a+
                      " b="+b+" c="+c);
                  }

                }
            }
        }
        if(flag==false)
            System.out.println("Для заданных чисел и степени решения не найдено.");

        int d=0;
        System.out.println("Проверить решения для n=2?\n" +
                "(нажмите 1 )");
        d=scan.nextInt();
        switch (d){
            case 1:
                v=2;
                for (a = 1; a <l ; a++) {
                    for (b = 1; b < l; b++) {
                        for (c = 1; c < l; c++) {
                            result= Math.pow((double)a,(double)v) +
                                    Math.pow((double)b,(double)v);
                            if(result==Math.pow((double)c,(double)v)) {
                                flag =true;
                                System.out.println("Решение найдено!\na="+a+
                                        " b="+b+" c="+c);
                            }

                        }
                    }
                }


                break;
            default:
                break;
        }
        
    }

	private static void virajenie() {
			// TODO Auto-generated method stub
		double s=0;
		for(int i = 1;i<11;i++) {
			  if(i%2==0)
	                s-=1/ (double)i;
	            else
	                s+= 1/ (double) i;
	 
	}
		System.out.println("Выражения ровно = "+s);
}
}
