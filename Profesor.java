package poop7;

public class Profesor extends Trabajador{
    private int NivelDificultad;
    private int Recomendado;

    public Profesor() {
    }

    public Profesor(int NivelDificultad, int Recomendado, String nombre, int numCuenta, int Promedio, int Pago) {
        super(nombre, numCuenta, Promedio, Pago);
        this.NivelDificultad = NivelDificultad;
        this.Recomendado = Recomendado;
    }

    public int getNivelDificultad() {
        return NivelDificultad;
    }

    public void setNivelDificultad(int NivelDificultad) {
        this.NivelDificultad = NivelDificultad;
    }

    public int getRecomendado() {
        return Recomendado;
    }

    public void setRecomendado(int Recomendado) {
        this.Recomendado = Recomendado;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "NivelDificultad=" + NivelDificultad + ", Recomendado=" + Recomendado + '}';
    }
       
}
