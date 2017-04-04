package ros_dhhiggins.example.com.periodictable;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
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
public class PeriodicTableScreen extends AppCompatActivity {
    private Point p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periodic_table_screen);
        TableLayout table = (TableLayout) findViewById(R.id.LayoutTable);
        createButtons newButtons = new createButtons(this);
        tableGen(table, newButtons);
    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {

    }

    public void tableGen(TableLayout table, createButtons newButtons) {
        ImageButton[] imageButtons;
        imageButtons = newButtons.build();

        for(int j = 1; j <= 7; j++){
            TableRow tempRow = new TableRow(this);
            if(j==1) {
                for (int temp = 0; temp <= 17; temp++) {
                    ImageButton tempButton = imageButtons[temp];


                    if(temp == 1){ //determines location for popup and sets the onclick
                        int[] location = new int[2];
                        tempButton.getLocationOnScreen(location);
                        p = new Point();
                        p.x = location[0];
                        p.y = location[1];
                        tempButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View arg0) {

                                //Open popup window
                                if (p != null)
                                    showPopup(PeriodicTableScreen.this, p);
                            }
                        });
                    }


                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempButton.setPadding(0,0,0,0);
                    tempRow.addView(imageButtons[temp]);
                }
            }
            else if (j==2){
                for(int temp = 18; temp <=35; temp++){
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempButton.setPadding(0,0,0,0);
                    tempRow.addView(imageButtons[temp]);
                }
            }
            else if (j==3){
                for(int temp = 36; temp <=53; temp++){
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempButton.setPadding(0,0,0,0);
                    tempRow.addView(imageButtons[temp]);
                }
            }
            else if (j==4){
                for(int temp = 54; temp <=71; temp++){
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempButton.setPadding(0,0,0,0);
                    tempRow.addView(imageButtons[temp]);
                }
            }
            else if (j==5){
                for(int temp = 72; temp <=89; temp++){
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempButton.setPadding(0,0,0,0);
                    tempRow.addView(imageButtons[temp]);
                }
            }
            else if (j==6){
                for(int temp = 90; temp <=107; temp++){
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempButton.setPadding(0,0,0,0);
                    tempRow.addView(imageButtons[temp]);
                }
            }
            else if (j==7){
                for(int temp = 108; temp <=125; temp++){
                    ImageButton tempButton = imageButtons[temp];
                    tempButton.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                            TableRow.LayoutParams.WRAP_CONTENT));
                    tempButton.setPadding(0,0,0,0);
                    tempRow.addView(imageButtons[temp]);
                }
            }
            table.addView(tempRow, new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT,
                    TableLayout.LayoutParams.WRAP_CONTENT));
        }
    }

    private void showPopup(final Activity context, Point p) {
        int popupWidth = 1500;
        int popupHeight = 650;
        // Inflate the popup_layout.xml
        LinearLayout viewGroup = (LinearLayout) context.findViewById(R.id.popup);
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = layoutInflater.inflate(R.layout.key_popup_layout, viewGroup);
        // Creating the PopupWindow
        final PopupWindow popup = new PopupWindow(context);
        popup.setContentView(layout);
        popup.setWidth(popupWidth);
        popup.setHeight(popupHeight);
        popup.setFocusable(true);
        // Some offset to align the popup a bit to the right, and a bit down, relative to button's position.
        int OFFSET_X = 300;
        int OFFSET_Y = 500;
        // Clear the default translucent background
        popup.setBackgroundDrawable(new BitmapDrawable());
        // Displaying the popup at the specified location, + offsets.
        popup.showAtLocation(layout, Gravity.NO_GRAVITY, p.x + OFFSET_X, p.y + OFFSET_Y);
        // Getting a reference to Close button, and close the popup when clicked.
        Button close = (Button) layout.findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup.dismiss();
            }
        });
    }
}
