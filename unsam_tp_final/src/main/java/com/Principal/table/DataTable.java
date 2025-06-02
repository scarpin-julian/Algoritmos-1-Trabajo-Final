// DataTable.java - clase o interfaz de core

package Principal.table;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Utils.enums.DataType;
import interfaces.Table;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedHashMap; // Si usás este tipo para mantener orden
import java.util.Map;
import core.RowView;
import core.Column;
import enums.DataType;
import core.Table;
import filter.Filter;
import sort.Sorter;

public class DataTable {

    private Map<Integer, RowView> rows;
    private Map<String, Column> columns;
    private Map<String, DataType> columnTypes;

    public DataTable(Map<Integer, RowView> rows, Map<String, Column> columns, Map<String, DataType> columnTypes) {
        this.rows = rows;
        this.columns = columns;
        this.columnTypes = columnTypes;
    }

    public void showRowCount() {
        System.out.println("Row count: " + rows.size());
    }

    public void showColumnCount() {
        System.out.println("Column count: " + columns.size());
    }

    public void showColumnTypes() {
        columnTypes.forEach((nombre, type) -> {
                System.out.println(nombre + ": " + type);
            });
    }

    public Object getValue(int row, String col) {
        // Agarro el objeto RowView de indice "row" y le extraigo el objeto de key "col"
        Map<String, Object>  r = rows.get(row).getValues();
        return r.get(col);
    }

    //@Override
    public List<RowView> head(int n) {
        List<RowView> result = new ArrayList<>();
        int count = 0;
        for (RowView row : rows.values()) {
            if (count >= n) break;
            result.add(row);
            count++;
        }
        return result;
    }

    public List<RowView> tail(int n) {
        List<RowView> allRows = new ArrayList<>(rows.values());
        int size = allRows.size();
        // Si hay menos de n filas, devolvé todas
        if (n >= size) return allRows;
        return allRows.subList(size - n, size);
}
    public Table sort(Sorter sorter) {
        return sorter.sort(this, columnas, ascending); // según la firma de tu sorter
}

}