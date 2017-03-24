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

public class createButtons extends Activity{
    private Context context;

    createButtons(Context context) {
        this.context = context;
    }


    public ImageButton[] build(){
            ImageButton[] elementButtons = new ImageButton[126]; // need 126 images or crash
                for(int i=1; i<=2; i++){

                    String name; //the name of the images
                    name = "image"+i;
                        elementButtons[i] = new ImageButton(context);
                        elementButtons[i].setImageResource(getImage(context, name));
                        elementButtons[i].setBackgroundResource(0);
                        setButtonClick(i,elementButtons[i]);
                        // creates the imageButton and sets it with the image specified by name
                    }
                                    //create buttons with onclick that takes the button number
                                    //sets button number as extra
                                    //starts new activity with that extra and use String Array
                                    //use extra to find the info we need about the element and display

                return elementButtons;
        }


                    private static int getImage(Context context, String name) {
                        return context.getResources().getIdentifier(name, "drawable", context.getPackageName());
    }

                    private void setButtonClick(final int i,ImageButton buttonToSet){
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

