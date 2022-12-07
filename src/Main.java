public class Main {
    public static void main(String[] args) {

        //Pasando valores a la funcion suma
        suma(10, 20, 30);

        //Añadiendo puertas al coche
        Coche miCoche = new Coche();
        miCoche.incremetarPuertas();
        miCoche.incremetarPuertas();
        System.out.println(miCoche.puertas);

    }
    //Funcion suma
    public static int suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
        return resultado;
    }

}

 //Clase coche
class Coche{
   public int puertas = 0;

    public int incremetarPuertas(){
       return this.puertas++;
    }
}


