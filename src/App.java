import java.util.Scanner;
//Exercicio 05: Faça um Programa que converta metros para centímetros.
class Main {
public static void main(String[] args){
//Declaração de variáveis
  int metros;
  int centimetros;
//Fazer a entrada de dados
  Scanner teclado = new Scanner(System .in);
  System.out.println("Digite a a metragem que deseja converter: ");
  metros = teclado.nextInt();
//Fazer o calculo
  centimetros = metros * 100;
//Mostrar o resultado pro usuário
System.out.println(metros +" metro(s)" + " é equivalente a " + centimetros + " centimetros");


  }
}
  