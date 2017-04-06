package ros_dhhiggins.example.com.periodictable;

import android.provider.BaseColumns;

/**
 * Created by ros_mmanant on 3/29/2017.
 */
//defining the table structure of the database
public class ElementsContract implements BaseColumns {

    //public static final class ElementsTable implements BaseColumns {
    public static final String ELEMENT_TABLE = "elements";

    public static final String ELEMENT_NAME = "name";
    public static final String ATOMIC_NUMBER = "number";
    public static final String SHORT_FORM = "short";
    //}

}