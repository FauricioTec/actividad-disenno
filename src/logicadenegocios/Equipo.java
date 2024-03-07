package logicadenegocios;

public class Equipo extends Maquinaria {
    private double peso;
    private double volumen;

    public Equipo(double valor, int vidaUtil, String marca, String descripcion, double peso, double volumen) {
        super(valor, vidaUtil, marca, descripcion);
        this.peso = peso;
        this.volumen = volumen;
    }

    public String calcularDepreciacion() {
        String depreciacion;
        depreciacion = "Calculo de la depreciacion para equipos industriales\n";
        depreciacion += "Valor del activo:\t" + valor + "\n";
        depreciacion += "Vida útil:\t" + vidaUtil + "\n";
        String tablaDepreciacion;
        tablaDepreciacion = "Año\tCuota depreciación\tDepreciación acumulada\tValor neto en libros\n";
        double cuotaDepreciacion = valor / vidaUtil;
        double depreciacionAcumulada = 0.0;
        double valorNetoEnLibros;
        for (int i = 1; i <= vidaUtil; i++) {
            depreciacionAcumulada += cuotaDepreciacion;
            valorNetoEnLibros = valor - depreciacionAcumulada;
            tablaDepreciacion += String.format("%d\t%,.2f\t%,.2f\t%,.2f\n", i, cuotaDepreciacion, depreciacionAcumulada, valorNetoEnLibros);
        }
        return depreciacion + tablaDepreciacion;
    }
}
