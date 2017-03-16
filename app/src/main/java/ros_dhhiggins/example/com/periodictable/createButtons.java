package ros_dhhiggins.example.com.periodictable;

import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;

import java.lang.reflect.Array;

/**
 * Created by ros_dhhiggins on 3/16/2017.
 */

public class createButtons{

        public void build(GridLayout grid){
            ImageButton[] elementButtons = new ImageButton[126];
            //126 is the number of cells in the main grid
                for(int i=1; i<=126; i++){
                    if((i>2 && i<18) ||
                       (i>20 && i<31) ||
                       (i>38 && i<49)){
                        elementButtons[i] =null;
                    }
                   else {
                    //elementButtons[i] = create a image button with the data on it;
                    //elementButtons[i] = new ImageButton();




                                    //create buttons with onclick that takes the button number
                                    //sets button number as extra
                                    //starts new activity with that extra and use String Array
                                    //use extra to find the info we need about the element and display


                }

        }
}
