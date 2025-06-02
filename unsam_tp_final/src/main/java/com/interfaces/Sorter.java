// Sorter.java - clase o interfaz de core
import java.util.List;
import core.Table;
import core.RowView;

public interface Sorter {
    Table sort(Table table, List<String> columns, boolean ascending);
    int compare(RowView a, RowView b);
}
