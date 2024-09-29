import java.util.Random;
public class Ordenador {
    static int vet[] = new int[8];
    static Random rand = new Random();

    public static void printDesordenado() {
        System.out.println("desordenado:");
        for(int i = 0; i <vet.length; i++) {
            vet[i] =  rand.nextInt(100);
            System.out.printf(" [ %d ]",vet[i]);
        }
    }

    public static void printOrdenado() {
        System.out.println("ordenado: ");
        for(int i = 0; i < vet.length; i++){
            for(int j = i + 1; j < (vet.length - i - 1); j++){
                if(vet[i] > vet[j]) {
                    int aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
            System.out.printf(" [ %d ]",vet[i]);
        }
    }
}
