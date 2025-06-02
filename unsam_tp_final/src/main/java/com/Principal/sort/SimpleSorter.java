// SimpleSorter.java - clase o interfaz de core
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import core.Table;
import core.RowView;
import sort.Sorter;

public class SimpleSorter implements Sorter {
    private List<String> columns;
    private boolean ascending;

    public SimpleSorter(List<String> columns, boolean ascending) {
        this.columns = columns;
        this.ascending = ascending;
    }

    @Override
    public Table sort(Table table, List<String> columns, boolean ascending) {
        // Lógica real de ordenamiento (ver respuesta anterior)
        // Ordenar lista de RowView, crear nueva DataTable con ese orden
    }

    // Implementá compare si tu interface lo pide
}
