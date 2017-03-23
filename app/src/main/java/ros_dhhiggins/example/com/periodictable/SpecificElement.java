package ros_dhhiggins.example.com.periodictable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SpecificElement extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specific_element);

        Intent intent = getIntent();
        int arrayNumber = intent.getIntExtra("elementNumber", 0);
        TextView text = (TextView) findViewById(R.id.elementInfo);
        text.setText(arrayNumber);
    }
}
