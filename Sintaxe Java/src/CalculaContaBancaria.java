import java.util.Locale;
import java.util.Scanner;


public class CalculaContaBancaria{
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // Entrada do saldo inicial
    double saldoInicial = scanner.nextDouble();
    
    double saldoFinal = saldoInicial;
    

    // TODO: Na linha abaixo, implemente a entrada das três transações:
    for(int i = 1; i <=3; i++){
      double transacao = scanner.nextDouble();

      // TODO: Na linha abaixo, realize o cálculo do saldo final:
      saldoFinal += transacao;
    }
      
    
    // Saldo final
    System.out.printf("%2.2f%n",saldoFinal);

    scanner.close();
  }
}
