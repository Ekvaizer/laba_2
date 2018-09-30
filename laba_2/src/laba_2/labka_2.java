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
		// TODO Auto-generated method stub
		   double a2 = 0;
	        double b2 = 0;
	        double c2 = 0;
	        double k = 0;


	        for (int a = 1; a < 10001;a++){
	            a2 = a * a;
	            for (int b = 1; b < 101; b++) {
	                b2 = b * b;
	                for (int c = 1; c < 101; c++) {
	                    c2 = c * c;
	                    k = a2 + b2;
	                    if (k == c2)
	                        System.out.println("verno:" + a + ", " + b + ", " + c);
	                }


	            }
	        }
	        System.out.println("Чтобы увеличить степень в каждом цыкле добавте в каждое выражения h=x*x -где х степень");
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
