public class coche {
    static int  puertas = 0;

    coche(){
       System.out.println("Construccion del coche");
    }
    public void michoche() {
        puertas++;
        System.out.println("Construccion de la puerta:"+ puertas);
    }

    public static void main(String[] args) {
    coche micoche = new coche();
        micoche.michoche();
        micoche.michoche();
        micoche.michoche();
        micoche.michoche();

        System.out.println("Número de puertas del coche es:"+ puertas);
    }
}
