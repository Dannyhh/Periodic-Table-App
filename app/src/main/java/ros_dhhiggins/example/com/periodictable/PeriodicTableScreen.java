package ros_dhhiggins.example.com.periodictable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;

public class PeriodicTableScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periodic_table_screen);
        TableLayout table = (TableLayout) findViewById(R.id.LayoutTable);
        createButtons newButtons = new createButtons(this);
        tableGen(table, newButtons);
    }

    public void tableGen(TableLayout table, createButtons newButtons) {
        ImageButton[] imageButtons;
        imageButtons = newButtons.build();

        for(int j = 1; j <= 7; j++){
            TableRow tempRow = new TableRow(this);

            if(j==1) {
                for (int temp = 0; temp <= 17; temp++) {
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempRow.addView(imageButtons[temp]);
                }
            }
            else if (j==2){
                for(int temp = 18; temp <=35; temp++){
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempRow.addView(imageButtons[temp]);
                }
            }
            else if (j==3){
                for(int temp = 36; temp <=53; temp++){
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempRow.addView(imageButtons[temp]);
                }
            }
            else if (j==4){
                for(int temp = 54; temp <=71; temp++){
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempRow.addView(imageButtons[temp]);
                }
            }
            else if (j==5){
                for(int temp = 72; temp <=89; temp++){
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempRow.addView(imageButtons[temp]);
                }
            }
            else if (j==6){
                for(int temp = 90; temp <=107; temp++){
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempRow.addView(imageButtons[temp]);
                }
            }
            else if (j==7){
                for(int temp = 108; temp <=125; temp++){
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempRow.addView(imageButtons[temp]);
                }
            }
            table.addView(tempRow, new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT,
                    TableLayout.LayoutParams.WRAP_CONTENT));
        }
    }
}
