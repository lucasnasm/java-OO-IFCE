import java.util.Scanner;

public class QuestaoQuatro{
 public static void main(String[] args){
  Scanner entrada = new Scanner(System.in);
  double salFixo,totalVendas,aumento;
  int perc=15;
  System.out.println("Informe o salario: ");
  salFixo = entrada.nextDouble();
  System.out.println("Informe o total de vendas: ");
  totalVendas = entrada.nextDouble();
  aumento = salFixo+(totalVendas*perc)/100;
  System.out.println("Salario no final do mes: "+aumento);

}
}
