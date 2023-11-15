import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) throws Exception {

   try (//variaveis
   //operadores
   //laços de repetição
   //estruturas de decisões 
Scanner scanner = new Scanner(System.in)) {
    System.out.println("Digite o nome do heroi");
       String heroi = scanner.nextLine();
    
       System.out.println("Digite o xp do heroi (de 0 a 10001)");
       int xp = scanner.nextInt();
    
       if (xp <= 1000) {
        System.out.println("O heroi de nome " + heroi + " está no nível de Ferro");
       }
        else if (xp >=1001 && xp <=2000) {
        System.out.println("O heroi de nome " + heroi + " está no nível de Bronze");
       }
        else if (xp >=2001 && xp <=5000) {
        System.out.println("O heroi de nome " + heroi + " está no nível de Prata");
       }
        else if (xp >=5001 && xp <=7000) {
        System.out.println("O heroi de nome " + heroi + " está no nível de Ouro");
       }  
        else if (xp >=7001 && xp <=8000) {
        System.out.println("O heroi de nome " + heroi + " está no nível de Platina");
       }
        else if (xp >=8001 && xp <=9000) {
        System.out.println("O heroi de nome " + heroi + " está no nível de Ascendente");
       }
        else if (xp >=9001 && xp <=10000) {
        System.out.println("O heroi de nome " + heroi + " está no nível de Imortal");
       }
        else {
        System.out.println("O heroi de nome " + heroi + " está no nível de Radiante");
        }
}
    }
}
