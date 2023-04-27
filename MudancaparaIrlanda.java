import java.util.Scanner;
import java.text.DecimalFormat;

public class MudancaparaIrlanda {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    DecimalFormat formatter = new DecimalFormat("#0.00");

    double salarioBruto = input.nextDouble();
    double beneficios = input.nextDouble();
    
    double imposto = 0;

    if (salarioBruto <= 1100.00) {
      imposto = salarioBruto * 0.05;
    } else if (salarioBruto == 1100.01) {
      imposto = salarioBruto * 0.1;
    } else if (salarioBruto <= 2500.00) {
      imposto = salarioBruto * 0.1;
    } else {
      imposto = salarioBruto * 0.15;
    }
    
    double salarioLiquido = salarioBruto - imposto + beneficios;
    System.out.println((formatter.format(salarioLiquido)));

  }
}
