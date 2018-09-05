import java.util.Scanner;

public class Questao4{
	public static void main(String[] agrs){
		Scanner entrada = new Scanner(System.in);
		double salario,vendas,salarioF;
		System.out.print("Digite o salario fixo:");
		salario = entrada.nextDouble();
		System.out.print("Digite o valor das vendas:");
		vendas = entrada.nextDouble();
		salarioF=salario+(vendas*0.15);
		System.out.println("O salario final e: "+salarioF);

	}
}