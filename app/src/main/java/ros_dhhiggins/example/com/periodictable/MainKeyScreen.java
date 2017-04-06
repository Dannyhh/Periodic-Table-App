package ros_dhhiggins.example.com.periodictable;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainKeyScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_key_screen);
    }
    public void goBack(View view){
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }
}
