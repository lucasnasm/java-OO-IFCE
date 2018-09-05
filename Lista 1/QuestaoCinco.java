import java.util.Scanner;

public class QuestaoCinco{
 public static void main(String[] args){
  Scanner entrada = new Scanner(System.in); 
  float valorA, valorB, valorC; 
  System.out.println("Informe o primeiro valor: ");
  valorA = entrada.nextFloat();  
  System.out.println("Informe o segundo valor: ");
  valorB = entrada.nextFloat();  
  System.out.println("Informe o terceiro valor: ");
  valorC = entrada.nextFloat();
 
  System.out.println("O quadrado da soma eh:"+(valorA+valorB+valorC)*2); 

}
}
