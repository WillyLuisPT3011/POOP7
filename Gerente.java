package poop7;

public class Gerente extends Empleado {
    private int Presupuesto;

    public Gerente() {
    }

    public Gerente(String nombre, int numEmpleado, int sueldo, int Presupuesto) {
        super(nombre, numEmpleado, sueldo);
        this.Presupuesto = Presupuesto;
    }
    
    public int getPresupuesto() {
        return Presupuesto;
    }

    public void setPresupuesto(int Presupuesto) {
        this.Presupuesto = Presupuesto;
    }
    
    public void setPresupuesto(int año, float tasa){
        this.Presupuesto += (int) (Presupuesto / tasa * año);    
    }
    
    @Override
    public String toString() {
        return super.toString() + "Gerente{" +  "Presupuesto=" + Presupuesto + '}';
    }
     
}
