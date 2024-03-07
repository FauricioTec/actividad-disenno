package logicadenegocios;

import utilitario.iComparable;

import java.time.LocalDate;

public class Persona implements iComparable {
    private int id;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;

    private Maquinaria maquinaria;

    public Persona(int id, String nombreCompleto, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String consultarCalculoDeDepreciacion() {
        return maquinaria.calcularDepreciacion();
    }

    public String getNombre() {
        return nombreCompleto;
    }

    public String consultarDescripcionMaquinaria() {
        return maquinaria.getDescripcion();
    }

    public void asignarMaquinaria(Maquinaria maquinaria) {
        this.maquinaria = maquinaria;
    }

    public boolean menorQue(iComparable obj) {
        return this.nombreCompleto.compareTo(((Persona)obj).nombreCompleto) < 0;
    }
}
