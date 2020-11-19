package poop7;

public class Trabajador extends Alumno {
    private int Pago; 

    public Trabajador() {
    }

    public Trabajador(String nombre, int numCuenta, int Promedio, int Pago) {
        super(nombre, numCuenta, Promedio);
        this.Pago = Pago;
    }

    public int getPago() {
        return Pago;
    }

    public void setPago(int Pago) {
        this.Pago = Pago;
    }

    @Override
    public String toString() {
        return super.toString() + "Trabajador{" + "Pago=" + Pago + '}';
    }
    
    public int aumentarPago(int PagoExtra){
        Pago += (int) (Pago * PagoExtra / 100);
        return Pago;
    }
    
}
