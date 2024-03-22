/* teste de  mesa aulas variaveis em JAVA */


public class Main {
  public static void main(String[] args) {
     // System.out.println("Hello world!");

  boolean opcao = false;
  int numero = 1;
  String texto ="1";

   boolean resultado = (opcao && !opcao);
    numero = numero+2;
    resultado = (numero>=2)||resultado;
    numero = 1;
    resultado = (numero == Integer.parseInt(texto)) && resultado;// 'texto' é uma String, então você precisa converter para um inteiro antes de comparar com 'numero'
    
    System.out.println(resultado);
    
    
  }
}
