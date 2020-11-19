package poop7;

public class Alumno {
    private String nombre;
    private int numCuenta;
    private int Promedio;

    public Alumno() {
    }

    public Alumno(String nombre, int numCuenta, int Promedio) {
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.Promedio = Promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getPromedio() {
        return Promedio;
    }

    public void setPromedio(int Promedio) {
        if(Promedio >= 0)
            this.Promedio = Promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", numCuenta=" + numCuenta + ", Promedio=" + Promedio + '}';
    }
    
    public int aumentarPromedio(int puntosExtras){
        Promedio = (int) (Promedio + puntosExtras);
        return Promedio;
    }
    
}
