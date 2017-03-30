package ros_dhhiggins.example.com.periodictable;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;

public class PeriodicTableScreen extends AppCompatActivity {
    private static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = context.getApplicationContext();
        setContentView(R.layout.activity_periodic_table_screen);
        TableLayout table = (TableLayout) findViewById(R.id.LayoutTable);
        createButtons newButtons = new createButtons(this);
        tableGen(table, newButtons);
    }

    public void tableGen(TableLayout table, createButtons newButtons) {
        ImageButton[] imageButtons;
        imageButtons = newButtons.build();

        for (int j = 1; j <= 1; j++) {
            TableRow tempRow = new TableRow(context);
            tempRow.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                    TableRow.LayoutParams.WRAP_CONTENT));
            for (int i = 1; i <= 18; i++) {
                ImageButton tempButton = imageButtons[i];
                tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                        TableRow.LayoutParams.WRAP_CONTENT));
                tempRow.addView(imageButtons[i]);
            }
            table.addView(tempRow, new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT,
                    TableLayout.LayoutParams.WRAP_CONTENT));
        }
    }
    }
