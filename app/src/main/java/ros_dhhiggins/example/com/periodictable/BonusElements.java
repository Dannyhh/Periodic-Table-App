package ros_dhhiggins.example.com.periodictable;

import android.app.Activity;
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
        buildScreen(BonusElements.this, table);

    }

    public void buildScreen(final Activity context,TableLayout table) {
        createButtons newButtons = new createButtons(context);
        ImageButton[] imageButtons;
        imageButtons = newButtons.build();

        for (int j = 1; j <= 2; j++) {
            TableRow tempRow = new TableRow(this);
           /* if (j == 1) {
                for (int temp = 126; temp <= 135; temp++) {
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempButton.setPadding(5, 5, 5, 5);
                    tempRow.addView(tempButton);
                }
            /*else {
                for (int temp = 136; temp <= 144; temp++) {
                    ImageButton tempButton = buttonArray[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempButton.setPadding(5, 5, 5, 5);
                    tempRow.addView(tempButton); */
                }

            }

        }
   // }
//}
