package calculadora;

import java.util.Scanner;

public class calculadora {
    
    public static double som(double num1, double num2){
        return num1 + num2;
    }
    
    public static double sub(double num1, double num2){
        return num1 - num2;
    }
    
    public static double div(double num1, double num2){
        return num1 / num2;
    }
    
    public static double mult(double num1, double num2){
        return num1 * num2;
    }
    
    public static double exp(double num1){
        return Math.pow(num1, num1);
    }
    
    public static void frase1(){
         System.out.println("Informe o primeiro número: ");
    }
    
    public static void frase2 (){
        System.out.println("Informe o segundo número: ");
    }
    
    public static void main(String[] args) {
        
        int opcao = 6;
        int num1;
        int num2;
        
        Scanner saida = new Scanner(System.in);
        
        do{
            System.out.println("\n-Escolha uma opção-");
	    System.out.println("1. Soma");  
	    System.out.println("2. Subtracao");  
	    System.out.println("3. Multiplicacao");  
	    System.out.println("4. Divisao"); 
        System.out.println("0. Sair");  
	    System.out.println("Operação: ");  
	    
	    opcao = saida.nextInt();
            switch(opcao) {
            case 1:
                frase1();
                num1 = saida.nextInt();
                frase2();
                num2 = saida.nextInt();

                double operacao = som(num1, num2);
                System.out.println(operacao);
                break;
            case 2:
                frase1();
                num1 = saida.nextInt();
                frase2();
                num2 = saida.nextInt();

                double operacao2 = sub(num1, num2);
                System.out.println(operacao2);
                break;
                
            case 3:
                frase1();
                num1 = saida.nextInt();
                frase2();
                num2 = saida.nextInt();

                double operacao3 = mult(num1, num2);
                System.out.println(operacao3);
                break;
            case 4:
                frase1();
                num1 = saida.nextInt();
                frase2();
                num2 = saida.nextInt();

                double operacao4 = div(num1, num2);
                System.out.println(operacao4);
                break;                          
            }
        }while (opcao != 0);       
    }
}