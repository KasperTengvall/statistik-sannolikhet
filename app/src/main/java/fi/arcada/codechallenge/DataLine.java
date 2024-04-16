package fi.arcada.codechallenge;

import com.github.mikephil.charting.data.Entry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataLine {

    double[] values;
    String label;
    int color;
    int startPosition;

    public DataLine(double[] values, String label, int color, int startPosition) {
        this.values = values;
        this.label = label;
        this.color = color;
        this.startPosition = startPosition;
    }
    public List<Entry> getEntries() {
        List<Entry> entries = new ArrayList<>();

        for (int i = 0; i < values.length; i++) {
            entries.add(new Entry(i, (float) values[i]));
        }
        return entries;
    }

    public double[] getValues() {
        return values;
    }

    public String getLabel() {
        return label;
    }

    public int getColor() {
        return color;
    }

    public int getStartPosition() {
        return startPosition;
    }
}
