package ros_dhhiggins.example.com.periodictable;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;


/**
 * Created by Danny Higgins on 3/16/2017.
 * This class creates all of the buttons used in the gridLayout for the periodic table
 */
public class createButtons extends Activity {
    private Context context;
    createButtons(Context context) {
        this.context = context;
    }
    public ImageButton[] build() {
        ImageButton[] elementButtons = new ImageButton[126];
        for (int i = 0; i <= 125; i++) {
            String elementName = "image" + i; //the name of the images
            if (i == 0 || i == 17) { // row one
                elementButtons[i] = new ImageButton(context);
                elementButtons[i].setImageResource(getImage(context, elementName));
                elementButtons[i].setBackgroundResource(0);
                setButtonClick(i, elementButtons[i]);
            } else if (i == 18 || i == 19 || (i >= 30 && i <= 35)) { //row two
                elementButtons[i] = new ImageButton(context);
                elementButtons[i].setImageResource(getImage(context, elementName));
                elementButtons[i].setBackgroundResource(0);
                setButtonClick(i, elementButtons[i]);
            } else if (i == 36 || i == 37 || (i >= 48 && i <= 53)) { //row three
                elementButtons[i] = new ImageButton(context);
                elementButtons[i].setImageResource(getImage(context, elementName));
                elementButtons[i].setBackgroundResource(0);
                setButtonClick(i, elementButtons[i]);
            } else if (i >= 54 && i <= 71) { //row 4
                elementButtons[i] = new ImageButton(context);
                elementButtons[i].setImageResource(getImage(context, elementName));
                elementButtons[i].setBackgroundResource(0);
                setButtonClick(i, elementButtons[i]);
            } else if (i >= 72 && i <= 89) { //row 5
                elementButtons[i] = new ImageButton(context);
                elementButtons[i].setImageResource(getImage(context, elementName));
                elementButtons[i].setBackgroundResource(0);
                setButtonClick(i, elementButtons[i]);
            } else if (i == 90 || i == 91 || (i >= 93 && i <= 107)) { //row 6 without extra chunk
                elementButtons[i] = new ImageButton(context);
                elementButtons[i].setImageResource(getImage(context, elementName));
                elementButtons[i].setBackgroundResource(0);
                setButtonClick(i, elementButtons[i]);
            } else if (i == 108 || i == 109 || (i >= 111 && i <= 125)) { //row 6 without extra chunk
                elementButtons[i] = new ImageButton(context);
                elementButtons[i].setImageResource(getImage(context, elementName));
                elementButtons[i].setBackgroundResource(0);
                setButtonClick(i, elementButtons[i]);
            } else {

                elementButtons[i] = new ImageButton(context);
                elementButtons[i].setImageResource(getImage(context, "blank"));
                elementButtons[i].setBackgroundResource(0);

                // creates the imageButton and sets it with the image specified by name
            }
        }
        return elementButtons;
    }

    public ImageButton getKey() {
        ImageButton keyButton = new ImageButton(context);
        keyButton.setImageResource(getImage(context, "popup"));
        keyButton.setBackgroundResource(0);
        return keyButton;
    }

    private static int getImage(Context context, String name) {
        return context.getResources().getIdentifier(name, "drawable",
                context.getPackageName());
    }

    private void setButtonClick(final int i, ImageButton buttonToSet) {
        buttonToSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent specificElement = new Intent(context, SpecificElement.class);
                specificElement.putExtra("elementNumber", i);
                context.startActivity(specificElement);

            }
        });
    }

}