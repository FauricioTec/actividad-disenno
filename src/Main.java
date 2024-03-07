import logicadenegocios.Equipo;
import logicadenegocios.Herramienta;
import logicadenegocios.Maquinaria;
import logicadenegocios.Persona;
import utilitario.Ordenamiento;
import utilitario.iComparable;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<iComparable> maquinarias = new ArrayList<>();
        Maquinaria maquinaria1 = new Equipo(1000, 5, "Marca", "maquina1", 10, 0.5);
        Maquinaria maquinaria2 = new Equipo(500, 5, "Marca", "maquina2", 10, 5);
        Maquinaria maquinaria3 = new Herramienta(1500, 5, "Marca", "maquina3", 10, 0.5);
        Maquinaria maquinaria4 = new Herramienta(2000, 5, "Marca", "maquina4", 10, 5);

        maquinarias.add(maquinaria1);
        maquinarias.add(maquinaria2);
        maquinarias.add(maquinaria3);
        maquinarias.add(maquinaria4);

        //imprimir el arreglo de objetos
        for (iComparable obj : maquinarias) {
            System.out.println(((Maquinaria)obj).getDescripcion());
        }

        System.out.println("\nOrdenando...\n");

        //ordenar el arreglo de objetos
        Ordenamiento ordenamiento = new Ordenamiento();
        ordenamiento.ordernarBurbuja(maquinarias);

        //imprimir el arreglo de objetos
        for (iComparable obj : maquinarias) {
            System.out.println(((Maquinaria)obj).getDescripcion());
        }

        System.out.println("\nArreglo de personas\n");

        ArrayList<iComparable> personas = new ArrayList<>();
        Persona persona1 = new Persona(1, "Zacarias", LocalDate.of(1990, 1, 1));
        Persona persona2 = new Persona(2, "Ana Marta", LocalDate.of(1990, 1, 1));
        Persona persona3 = new Persona(3, "Carlos", LocalDate.of(1990, 1, 1));
        Persona persona4 = new Persona(4, "Beto", LocalDate.of(1990, 1, 1));

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);

        //imprimir el arreglo de objetos
        for (iComparable obj : personas) {
            System.out.println(((Persona)obj).getNombre());
        }

        System.out.println("\nOrdenando...\n");

        //ordenar el arreglo de objetos
        ordenamiento.ordernarBurbuja(personas);

        //imprimir el arreglo de objetos
        for (iComparable obj : personas) {
            System.out.println(((Persona)obj).getNombre());
        }

        System.out.println("\nCalculo de depreciacion\n");

        System.out.println(maquinaria1.calcularDepreciacion());
        System.out.println(maquinaria3.calcularDepreciacion());
    }
}