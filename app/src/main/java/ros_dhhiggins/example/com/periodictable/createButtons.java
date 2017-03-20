package ros_dhhiggins.example.com.periodictable;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.lang.reflect.Array;

import static android.R.attr.type;

/**
 * Created by Danny Higgins on 3/16/2017.
 * This class creates all of the buttons used in the gridLayout for the periodic table
 */

public class createButtons{
    private Context context;
        createButtons(Context context){
            this.context = context.getApplicationContext();
        }
        public void build(GridLayout grid){
            ImageButton[] elementButtons = new ImageButton[126];
                for(int i=1; i<=126; i++){

                    String name; //the name of the images
                    name = "image"+i;

                    if((i>2 && i<18) ||
                       (i>20 && i<31) ||
                       (i>38 && i<49)){
                        elementButtons[i] = null;
                    }
                   else {
                        elementButtons[i] = new ImageButton(context);
                        elementButtons[i].setImageResource(getImage(context, name));
                        // creates the imageButton and sets it with the image specified by name
                    }
                                    //create buttons with onclick that takes the button number
                                    //sets button number as extra
                                    //starts new activity with that extra and use String Array
                                    //use extra to find the info we need about the element and display
                }

        }
                    private static int getImage(Context context, String name) {
                        return context.getResources().getIdentifier(name, "drawable", context.getPackageName());
    }
}
