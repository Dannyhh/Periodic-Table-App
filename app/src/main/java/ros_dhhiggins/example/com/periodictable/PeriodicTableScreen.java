package ros_dhhiggins.example.com.periodictable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.TableLayout;

public class PeriodicTableScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periodic_table_screen);

        TableLayout table = (TableLayout) findViewById(R.id.LayoutTable);

        createButtons newButtons = new createButtons(this);
        ImageButton[] imageButtons;
        imageButtons = newButtons.build();
        for (int i = 1; i <= 18; i++) {
            table.addView(imageButtons[i]);
            //add new layoutparams
        }

    }
}
