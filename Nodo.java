package Estructura_de_datos.Diagnostico;

public class Nodo {
    int edad;

    public Nodo(int edad) { // constructor de la clase nodo, recibe un dato y lo declara
        this.edad = edad;
    }

    public void Imprimir() {
        System.out.println(edad);
    }
}
