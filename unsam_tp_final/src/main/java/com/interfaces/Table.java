package interfaces;
import core.RowView; // O el paquete correcto donde esté RowView
import java.util.List;

public interface Table {
    int getRowCount();
    int getColumnCount();
    Object getValue(int row, String col);
    void setValue(int row, String col, Object value);
    void addRow(int index, List<Object> values);
    void removeRow(int index);
    void addColumn(String label, List<Object> values);
    void removeColumn(String label);
    List<RowView> head(int n);   // <- AGREGAR
    List<RowView> tail(int n);   // <- AGREGAR
    Table filter(Filter filter);
    Table sort(Sorter sorter);   // <- AGREGAR
    Table concat(Table table2);
}

