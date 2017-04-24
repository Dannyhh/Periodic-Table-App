package ros_dhhiggins.example.com.periodictable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;

public class BonusElements extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bonus_elements);
        TableLayout table = (TableLayout) findViewById(R.id.SmallLayoutTable);
        Intent recieved = getIntent();
        int rowNum = recieved.getIntExtra("rowNum", 0);
        buildScreen(BonusElements.this, table, rowNum);

    }

    public void buildScreen(final Activity context, TableLayout table, int rowNum) {
        createButtons newButtons = new createButtons(context);
        ImageButton[] imageButtons;
        imageButtons = newButtons.build();

            if (rowNum == 1) {
                TableRow tempRow = new TableRow(this);
                for (int temp = 126; temp <= 140; temp++) {
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempButton.setPadding(5, 5, 5, 5);
                    tempRow.addView(tempButton);
                }
                table.addView(tempRow, new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT,
                        TableLayout.LayoutParams.WRAP_CONTENT));
            }
            else if (rowNum == 2) {
                TableRow tempRowTwo = new TableRow(this);
                for (int temp = 141; temp <= 155; temp++) {
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempButton.setPadding(5, 5, 5, 5);
                    tempRowTwo.addView(tempButton);
                }
                table.addView(tempRowTwo, new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT,
                        TableLayout.LayoutParams.WRAP_CONTENT));
            }

    }
}

