package poop7;

public class POOP7 {

    public static void main(String[] args) {
        System.out.println("1*****************************************");
        Empleado empleado = new Empleado();
        
        empleado.setNombre("Angel");
        empleado.setNumEmpleado(123);
        empleado.setSueldo(160000);
        System.out.println(empleado);
        
        empleado.aumentarSueldo(10);
        System.out.println(empleado);
        
        System.out.println("2*****************************************");
        
        Gerente gerente1 = new Gerente();
        gerente1.setNombre("Cesar");
        gerente1.setNumEmpleado(12);
        gerente1.setSueldo(25000);
        gerente1.setPresupuesto(100000);
        
        System.out.println("Nombre "+gerente1.getNombre());
        System.out.println("NumEmpleado "+gerente1.getNumEmpleado());
        System.out.println("Sueldo "+gerente1.getSueldo());
        System.out.println("Presupuesto "+gerente1.getPresupuesto());
        
        gerente1.setPresupuesto(500000);
        
        System.out.println("Presupuesto "+gerente1.getPresupuesto());
        
        System.out.println("3*****************************************");
        
        Gerente gerente2 = new Gerente("julio",88,200000,500000);       
        System.out.println("Nombre "+gerente2.getNombre());
        System.out.println("NumEmpleado "+gerente2.getNumEmpleado());
        System.out.println("Sueldo "+gerente2.getSueldo());
        System.out.println("Presupuesto "+gerente2.getPresupuesto());
        
        System.out.println("4*****************************************");
        //Sobrescritura
        System.out.println(gerente2);
        
        System.out.println("5*****************************************");
        //Sobrecarga
        System.out.println("Presupuesto "+gerente2.getPresupuesto());
        gerente2.setPresupuesto(100000);
        System.out.println("Presupuesto "+gerente2.getPresupuesto());
        gerente2.setPresupuesto(5, 5.5f);
        System.out.println("Presupuesto "+gerente2.getPresupuesto());
        
        System.out.println("");
        System.out.println("*************************Nueva Clase Persona*************************");
        System.out.println("");
        
        System.out.println("1*****************************************");
        
        Alumno estudiante1 = new Alumno();
        
        estudiante1.setNombre("Luis");
        estudiante1.setNumCuenta(317290967);
        estudiante1.setPromedio(8);
        System.out.println(estudiante1);
        
        estudiante1.aumentarPromedio(2);
        System.out.println(estudiante1);
        
        System.out.println("2*****************************************");
        
        Trabajador trabajador1 = new Trabajador();
        trabajador1.setNombre("Miguel");
        trabajador1.setNumCuenta(15522);
        trabajador1.setPromedio(8);
        trabajador1.setPago(1200);
        
        System.out.println("Nombre "+trabajador1.getNombre());
        System.out.println("Num de Cuenta "+trabajador1.getNumCuenta());
        System.out.println("Califcacion del trabajador "+trabajador1.getPromedio());
        System.out.println("Pago "+trabajador1.getPago());
        
        trabajador1.aumentarPago(20);
        System.out.println(trabajador1);
        
        System.out.println("3*****************************************");
        
        Profesor Profesor1 = new Profesor();
        Profesor1.setNombre("Casiano");
        Profesor1.setNumCuenta(256789);
        Profesor1.setPromedio(7);
        Profesor1.setPago(15000);
        Profesor1.setNivelDificultad(2);
        Profesor1.setRecomendado(63);
        
        System.out.println("Nombre "+Profesor1.getNombre());
        System.out.println("Num de Cuenta "+Profesor1.getNumCuenta());
        System.out.println("Califcacion del Profesor "+Profesor1.getPromedio());
        System.out.println("Pago "+Profesor1.getPago());
        System.out.println("Nivel de dificultad "+Profesor1.getNivelDificultad());
        System.out.println("Lo Recomiendan %"+Profesor1.getRecomendado());
        
        System.out.println("4*****************************************");
        
        Director director1 = new Director();
        director1.setNombre("Jose");
        director1.setNumCuenta(15522);
        director1.setPromedio(9);
        director1.setPago(1200);
        director1.setPresupuestoEscolar(200000);
        
        System.out.println("Nombre "+director1.getNombre());
        System.out.println("Num de Cuenta "+director1.getNumCuenta());
        System.out.println("Califcacion del trabajador "+director1.getPromedio());
        System.out.println("Pago "+director1.getPago());
        System.out.println("Presupuesto "+director1.getPresupuestoEscolar());
                
        director1.setPresupuestoEscolar(5, 5.5f); 
        System.out.println("Presupuesto "+director1.getPresupuestoEscolar());
        
        System.out.println("5*****************************************");
        //Sobrescritura
        System.out.println(estudiante1);
        System.out.println(trabajador1);
        System.out.println(Profesor1);
        System.out.println(director1);
        
        System.out.println("6*****************************************");
        //Sobrecarga
    }  
    
}
