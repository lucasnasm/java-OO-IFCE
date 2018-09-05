import java.util.Scanner;

public class QuestaoTres{
 public static void main(String[] args){
  Scanner entrada = new Scanner(System.in);
  Double real,dolar,calculo;
  System.out.println("Digite o valor em real");
  real = entrada.nextDouble();
  System.out.println("Informe o dolar do dia");
  dolar = entrada.nextDouble();
  calculo = real*dolar;
  System.out.println(calculo);
}
}
