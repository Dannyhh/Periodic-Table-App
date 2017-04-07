package ros_dhhiggins.example.com.periodictable;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;

public class BonusElements extends AppCompatActivity {
    private Point p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bonus_elements);
        TableLayout table = (TableLayout) findViewById(R.id.SmallLayoutTable);
        createButtons newButtons = new createButtons(this);
        //tableGen(table, newButtons);
    }

   /* public void tableGen(TableLayout table, createButtons newButtons) {
        ImageButton[] imageButtons;
        ImageButton keyButton;
        keyButton = newButtons.getKey();

        for (int j = 1; j <= 7; j++) {
            TableRow tempRow = new TableRow(this);
            if (j == 1) {
                for (int temp = 0; temp <= 17; temp++) {
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempButton.setPadding(0, 0, 0, 0);
                    tempRow.addView(tempButton);
                }
            } else if (j == 2) {
                for (int temp = 18; temp <= 35; temp++) {
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempButton.setPadding(0, 0, 0, 0);
                    tempRow.addView(tempButton);
                }
                table.addView(tempRow, new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT,
                        TableLayout.LayoutParams.WRAP_CONTENT));
            }
        }
    } */
}
