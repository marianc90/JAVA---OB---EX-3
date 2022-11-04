public class Main {
    public static void main(String[] args) {
        System.out.println(suma(5,5,5));

        Coche miCoche = new Coche();
        miCoche.SumarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }


    public static class Coche {
        // properties
        int puertas = 4;

        // method
        public void SumarPuertas(){
            this.puertas++;
        }
    }
}

