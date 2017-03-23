package ros_dhhiggins.example.com.periodictable;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import static java.security.AccessController.getContext;

public class PeriodicTableScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periodic_table_screen);
        GridLayout grid = (GridLayout) findViewById(R.id.layoutGrid);
        createButtons newButtons = new createButtons(this);
        ImageButton[] imageButtons;
        imageButtons = newButtons.build();
        for(int i = 1; i<=2; i++){
            grid.addView(imageButtons[i]);
        }

    }
}
