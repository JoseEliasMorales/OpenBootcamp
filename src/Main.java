public class Main {
    public static void main(String[] args) {
        suma (5, 10,15);

        coche miCoche= new coche();
        miCoche.agregarPuerta();
        System.out.println(miCoche.puertas);
    }

    public static void suma (int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }


}
class coche{
    public int puertas = 4;
    public void agregarPuerta(){
        this.puertas++;
    }
}