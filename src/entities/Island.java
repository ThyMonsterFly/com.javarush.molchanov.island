package entities;

import utilities.Settings;

import java.util.ArrayList;
import java.util.List;

public class Island {

    private List<List<Location>> locations;
    private int rows;
    private int columns;

    public Island() {
        this.rows = Settings.rowsCount;
        this.columns = Settings.columnsCount;
        locations = new ArrayList<>(rows);
        for (int i = 0; i < rows; i++) {
            List<Location> row = new ArrayList<>(columns);
            for (int j = 0; j < columns; j++) {
                row.add(new Location(this, i, j));
            }
            locations.add(row);
        }
    }

    public Location getLocation(int x, int y) {
        return locations.get(x).get(y);
    }

    public List<List<Location>> getLocations() {
        return locations;
    }

    public int getRows (){
        return rows;
    }

    public int getColumns (){
        return columns;
    }

}
