package fi.arcada.codechallenge;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView outputText;
    TextView valueText;
    EditText inputText;

    double[] values = { 3.3, 2.4, 5.4, 8, 32, 1.1, 2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valueText = findViewById(R.id.outValue);
        outputText = findViewById(R.id.outText);
        inputText = findViewById(R.id.inputText);

        outputText.setText("Min app funkar!");
        double average = calculateAverage(values);
    }

    public static double calculateAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / array.length;
        return average;
    }
    public void buttonHandler(View view) {
        outputText.setText(inputText.getText().toString());
    }
    public void buttonCalc(View view) {
        double average = calculateAverage(values);
        valueText.setText("Average: " + average);
    }
}