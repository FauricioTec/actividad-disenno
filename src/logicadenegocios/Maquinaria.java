package logicadenegocios;

import utilitario.iComparable;

public abstract class Maquinaria implements iComparable {
    protected double valor;
    protected int vidaUtil;
    protected String marca;
    protected String descripcion;

    protected Persona encargado;

    public Maquinaria(double valor, int vidaUtil, String marca, String descripcion) {
        this.valor = valor;
        this.vidaUtil = vidaUtil;
        this.marca = marca;
        this.descripcion = descripcion;
    }

    public abstract String calcularDepreciacion();

    public String consultarNombreEncargado() {
        return encargado.getNombre();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean menorQue(iComparable obj) {
        return this.valor < ((Maquinaria)obj).valor;
    }

    public void asignarEncargado(Persona encargado) {
        this.encargado = encargado;
    }
}
