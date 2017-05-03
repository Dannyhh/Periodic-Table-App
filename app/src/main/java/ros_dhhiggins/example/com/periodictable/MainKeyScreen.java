package ros_dhhiggins.example.com.periodictable;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

public class MainKeyScreen extends AppCompatActivity {
    private Point p;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_key_screen);
        TableLayout mainGrid = (TableLayout) findViewById(R.id.keyGrid);
        genButtons(MainKeyScreen.this,mainGrid);
    }


    public void genButtons(final Activity context,TableLayout mainGrid ){
        ImageButton[] keyButtons = new ImageButton[10];
        String[] keyNames = new String[10];
        keyNames[0]= "actinide";
        keyNames[1]= "alkali";
        keyNames[2]= "alkaline";
        keyNames[3]= "basicmetal";
        keyNames[4]= "halogen";
        keyNames[5]= "lanthanide";
        keyNames[6]= "noble";
        keyNames[7]= "nonmetal";
        keyNames[8]= "semimetal";
        keyNames[9]= "transition";

        for(int i = 0; i<=9; i++) {
            keyButtons[i] = new ImageButton(context);
            keyButtons[i].setImageResource(getImage(context, keyNames[i]));
            keyButtons[i].setBackgroundResource(0);
            setButtonClick(i, keyButtons[i]);
        }
        for (int j = 1; j <= 5; j++) {
            TableRow tempRow = new TableRow(this);
            tempRow.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT,
                    TableRow.LayoutParams.WRAP_CONTENT));
            if (j == 1) {
                tempRow.addView(keyButtons[0]);
                tempRow.addView(keyButtons[1]);
            }
            else if(j==2){
                tempRow.addView(keyButtons[2]);
                tempRow.addView(keyButtons[3]);
            }
            else if(j==3){
                tempRow.addView(keyButtons[4]);
                tempRow.addView(keyButtons[5]);
            }
            else if(j==4){
                tempRow.addView(keyButtons[6]);
                tempRow.addView(keyButtons[7]);
            }
            else if(j==5){
                tempRow.addView(keyButtons[8]);
                tempRow.addView(keyButtons[9]);
            }
            mainGrid.addView(tempRow, new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT,
                    TableLayout.LayoutParams.WRAP_CONTENT));
        }
    }


    private static int getImage(Context context, String name) {
        return context.getResources().getIdentifier(name, "drawable",
                context.getPackageName());
    }

    private void setButtonClick(final int i, final ImageButton buttonToSet) {
                int[] location = new int[2];
                buttonToSet.getLocationOnScreen(location);
                p = new Point();
                p.x = location[0];
                p.y = location[1];
                buttonToSet.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                            showPopup(MainKeyScreen.this, p,i);

                    }
                });
            }


    public void goBack(View view){
        Intent back = new Intent(MainKeyScreen.this, MainActivity.class);
        startActivity(back);
    }

    private void showPopup(final Activity context, Point p, int buttonClicked) {
        Resources res = getResources();
        String[] elementInfo = res.getStringArray(R.array.element_type_info);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.key_info_popup, (ViewGroup) findViewById(R.id.info_popup_group), false);
        final PopupWindow pwindo = new PopupWindow(layout, ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT, true);
        pwindo.setWidth(WRAP_CONTENT);
        pwindo.setHeight(WRAP_CONTENT);
        pwindo.setFocusable(true);
        pwindo.setOutsideTouchable(true);
        int OFFSET_X = 300;
        int OFFSET_Y = 100;
        pwindo.showAtLocation(layout, Gravity.CENTER_HORIZONTAL,0,0);

        //set the textView
        TextView txt = (TextView) layout.findViewById(R.id.type_info);
        for(int j=0; j<=12; j++){
            if(buttonClicked == j){
                txt.setText(elementInfo[j]);
            }
        }
        Button btnClosePopup = (Button) layout.findViewById(R.id.close);
        btnClosePopup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pwindo.dismiss();
            }
        });

    }


    }






