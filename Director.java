package poop7;

public class Director extends Trabajador{
    private int PresupuestoEscolar;

    public Director() {
    }

    public Director(int PresupuestoEscolar, String nombre, int numCuenta, int Promedio, int Pago) {
        super(nombre, numCuenta, Promedio, Pago);
        this.PresupuestoEscolar = PresupuestoEscolar;
    }

    public int getPresupuestoEscolar() {
        return PresupuestoEscolar;
    }
    
    public void setPresupuestoEscolar(int Presupuesto) {
        this.PresupuestoEscolar = Presupuesto;
    }
    
    public void setPresupuestoEscolar(int añoEsc, float tasaEsc) {
        this.PresupuestoEscolar += (int) (PresupuestoEscolar / tasaEsc * añoEsc);    
    }

    @Override
    public String toString() {
        return super.toString() + "Director{" + "PresupuestoEscolar=" + PresupuestoEscolar + '}';
    }
       
}
