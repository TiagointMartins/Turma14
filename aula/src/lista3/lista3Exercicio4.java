
package  lista3 ;

import  java.util.Scanner ;

public  class  lista3Exercicio4 {

	public  static  void  main ( String [] args ) {
		Scanner sc =  new  Scanner (System.in);
		int num;
		System.out.println("Digite um valor: ");
		num = sc . nextInt ();
		while (num < 100 ) {
			num = num * 3 ;
			System.out.println(num);
			
		}
		
	}

}