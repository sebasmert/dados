import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int dad1=0,dad2=0,sumdad1=0,sumdad2=0;
        int sumtol = 0;
        do {

            dad1 = random.nextInt(6) + 1;
            dad2 = random.nextInt(6) + 1;
            sumdad1 += dad1;
            sumdad2 += dad2;
            System.out.println("Dado 1: " + dad1 + "| dado2: " + dad2);

        }while(dad1 != dad2);{
            System.out.println(" ");
            if (sumdad1 > sumdad2) {
                System.out.println("El dado ganador es el dado numero "+dad1+ " El resultados es: "+sumdad1);
            } else if (sumdad1 < sumdad2) {
                System.out.println("El dado ganador es el dado numero " +dad2+ " El resultaos es: "+sumdad2);
            } else {
                System.out.println("Es un Empate");
            }
        }
    }
}
