/*
 * Created by Danny Higgins on 3/16/2017.
 * This class creates the home screen for the application
 */

package ros_dhhiggins.example.com.periodictable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //builds the screen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchPeriodicTable(View view) { //creates onClick to start PeriodicTableScreen
        Intent launch = new Intent(this, PeriodicTableScreen.class);
        startActivity(launch);
    }

    public void launchKey(View view) { //creates onClick to start MainKeyScreen
        Intent goToKey = new Intent(this, MainKeyScreen.class);
        startActivity(goToKey);
    }



}