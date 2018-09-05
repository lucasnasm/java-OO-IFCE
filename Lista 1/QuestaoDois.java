import java.util.Scanner;

public class QuestaoDois{
 public static void main(String[] args){
  Scanner entrada = new Scanner(System.in); //Declarando variavel para leitura de dados
  float distanciaViagem,precoCombustivel,consumoCarro, calculo; //Declarando variavel do tipo inteiro
  System.out.println("Digite a distancia");
  distanciaViagem = entrada.nextFloat(); //Recebendo dados da entrada padrão
  
  System.out.println("Digite o preco do combustivel");
  precoCombustivel = entrada.nextFloat();
  
  System.out.println("Digite o consumo do Carro");
  consumoCarro = entrada.nextFloat();
  calculo = (precoCombustivel*distanciaViagem)/consumoCarro;
 
  System.out.println("O valor gasto sera de :"+calculo); //Imprimindo

}
}
