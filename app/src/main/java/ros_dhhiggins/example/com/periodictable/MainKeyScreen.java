package ros_dhhiggins.example.com.periodictable;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainKeyScreen extends AppCompatActivity {

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
            setButtonClick(i, keyButtons[i], context);
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

    private void setButtonClick(final int i, ImageButton buttonToSet,final Activity context) {
        buttonToSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void goBack(View view){
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }
}
