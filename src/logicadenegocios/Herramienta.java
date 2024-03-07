package logicadenegocios;

public class Herramienta extends Maquinaria {
    private double salvamento;
    private double tasaDepreciacion;

    public Herramienta(double valor, int vidaUtil, String marca, String descripcion, double salvamento, double tasaDepreciacion) {
        super(valor, vidaUtil, marca, descripcion);
        this.salvamento = salvamento;
        this.tasaDepreciacion = tasaDepreciacion;
    }

    public String calcularDepreciacion() {
        String depreciacion;
        depreciacion = "Calculo de la depreciacion para herramientas industriales\n";
        depreciacion += "Valor del activo:\t" + valor + "\n";
        depreciacion += "Vida útil:\t" + vidaUtil + "\n";
        depreciacion += "Valor de salvamento:\t" + salvamento + "\n";
        String tablaDepreciacion;
        tablaDepreciacion = "Año\tTasa depreciación\tValor sin depreciar\tCuota depreciación\tDepreciación acumulada\tValor neto en libros\n";
        double valorSinDepreciar = valor;
        double depreciacionAcumulada = 0;
        double cuotaDepreciacion;
        double valorNetoEnLibros;
        for (int i = 1; i <= vidaUtil; i++) {
            cuotaDepreciacion = valorSinDepreciar * this.tasaDepreciacion;
            depreciacionAcumulada += cuotaDepreciacion;
            cuotaDepreciacion = valorSinDepreciar * this.tasaDepreciacion;
            valorNetoEnLibros = valor - depreciacionAcumulada;
            tablaDepreciacion += String.format("%d\t%f\t%,.2f\t%,.2f\t%,.2f\t%,.2f\n", i, this.tasaDepreciacion,
                    valorSinDepreciar, cuotaDepreciacion, depreciacionAcumulada, valorNetoEnLibros);
            valorSinDepreciar -= cuotaDepreciacion;
        }
        return depreciacion + tablaDepreciacion;
    }
}
