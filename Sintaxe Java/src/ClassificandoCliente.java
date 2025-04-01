import java.util.Locale;
import java.util.Scanner;

public class ClassificandoCliente {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu saldo: ");
    double saldo = scanner.nextDouble();

    // TODO: Implemente a classificação do cliente com base no saldo:
    
    if(saldo < 0)
      System.out.println("Negativado");
    else if(saldo <= 500)
      System.out.println("Baixo");
    else 
      System.out.println("Confortavel");
    

    scanner.close();
    
  }

}
