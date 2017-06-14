package ros_dhhiggins.example.com.periodictable;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TableLayout;
import android.widget.TableRow;

import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

public class PeriodicTableScreen extends AppCompatActivity {
    private Point p;
    @Override
    protected void onCreate(Bundle savedInstanceState) { //creates the main screen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periodic_table_screen);

        TableLayout table = (TableLayout) findViewById(R.id.LayoutTable);
        createButtons newButtons = new createButtons(this);
        tableGen(table, newButtons);
    }

    public void tableGen(TableLayout table, createButtons newButtons) { //generates the table w/ buttons
        ImageButton[] imageButtons;
        imageButtons = newButtons.build();
        ImageButton keyButton;
        keyButton = newButtons.getKey();

        for (int j = 1; j <= 7; j++) { //row counter for each row
            TableRow tempRow = new TableRow(this);
            if (j == 1) { //if to test which row
                for (int temp = 0; temp <= 17; temp++) { //for loop to create buttons
                    if (temp == 1) { //takes into consideration non normal button
                        keyButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT,
                                TableRow.LayoutParams.WRAP_CONTENT));
                        keyButton.setPadding(5,5,5,5);
                        tempRow.addView(keyButton);
                        int[] location = new int[2];
                        keyButton.getLocationOnScreen(location);
                        p = new Point();
                        p.x = location[0];
                        p.y = location[1];
                        keyButton.setOnClickListener(new View.OnClickListener() { //sets onclick for key popup
                            @Override
                            public void onClick(View arg0) {
                                //Open popup window
                                if (p != null)
                                    showPopup(PeriodicTableScreen.this, p);
                            }
                        });
                    } else { //adds normal buttons
                        ImageButton tempButton = imageButtons[temp];
                        tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                                TableRow.LayoutParams.WRAP_CONTENT));
                        tempButton.setPadding(5, 5, 5, 5);
                        tempRow.addView(tempButton);
                    }
                }
            } else if (j == 2) { //checks to see if on row 2
                for (int temp = 18; temp <= 35; temp++) { //adds buttons to row
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempButton.setPadding(5, 5, 5, 5);
                    tempRow.addView(tempButton);
                }
            } else if (j == 3) { //checks to see if row 3
                for (int temp = 36; temp <= 53; temp++) { //adds buttons to row
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempButton.setPadding(5, 5, 5, 5);
                    tempRow.addView(tempButton);
                }
            } else if (j == 4) {//checks to see if row 4
                for (int temp = 54; temp <= 71; temp++) {//adds buttons to row
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempButton.setPadding(5, 5, 5, 5);
                    tempRow.addView(tempButton);
                }
            } else if (j == 5) { //checks to see if row 5
                for (int temp = 72; temp <= 89; temp++) { //adds buttons to row
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempButton.setPadding(5, 5, 5, 5);
                    tempRow.addView(tempButton);
                }
            } else if (j == 6) { //checks to see if row 6
                for (int temp = 90; temp <= 107; temp++) { //adds buttons to row
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempButton.setPadding(5, 5, 5, 5);
                    tempRow.addView(tempButton);
                }
            } else if (j == 7) { //checks to see if row 7
                for (int temp = 108; temp <= 125; temp++) { //adds buttons to row
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempButton.setPadding(5, 5, 5, 5);
                    tempRow.addView(tempButton);
                }
            }
            //adds the row to the table
            table.addView(tempRow, new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT,
                    TableLayout.LayoutParams.WRAP_CONTENT));
        }
    }

    private void showPopup(final Activity context, Point p) { //method that creates popup key
        LinearLayout viewGroup = (LinearLayout) context.findViewById(R.id.popup);
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = layoutInflater.inflate(R.layout.key_popup_layout, viewGroup);
        final PopupWindow popup = new PopupWindow(context);
        popup.setContentView(layout);

        popup.setWidth(WRAP_CONTENT);
        popup.setHeight(WRAP_CONTENT);
        popup.setFocusable(true);
        popup.setOutsideTouchable(true);
        int OFFSET_X = 300;
        int OFFSET_Y = 100;
        popup.showAtLocation(layout, Gravity.NO_GRAVITY, p.x + OFFSET_X, p.y + OFFSET_Y);
        Button close = (Button) layout.findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup.dismiss();
            }
        });
    }
}