package ros_dhhiggins.example.com.periodictable;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SpecificElement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //method that creates the screen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specific_element);

        Intent intent = getIntent();
        int arrayNumber = intent.getIntExtra("elementNumber", 0);
        TextView text = (TextView) findViewById(R.id.elementInfo); //gets the number of the button clicked
        text.setText(String.valueOf(arrayNumber));
        buildTextBox(text, arrayNumber);
    }
    public void buildTextBox(TextView text, int arrayNumber){ //creates the info based on button number
        Resources res = getResources();
        String[] elementInfo = res.getStringArray(R.array.element_info);

        for(int i=0; i<=155; i++){ //sets the text based on which button clicked
            if(i ==arrayNumber){
                text.setText(elementInfo[i]);
            }
        }
    }
}