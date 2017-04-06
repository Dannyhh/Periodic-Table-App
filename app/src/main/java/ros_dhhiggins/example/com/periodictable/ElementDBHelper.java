package ros_dhhiggins.example.com.periodictable;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ros_mmanant on 3/29/2017.
 */
// create and initialize the database
//SQLiteOpenHelper – create the database and help us handle database versioning
public class ElementDBHelper extends SQLiteOpenHelper {
    static final String DATABASE_NAME = "elements.db";

    // If you change the database schema, you must increment the database version
    private static final int DATABASE_VERSION = 1;

    public ElementDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        final String SQL_CREATE_ELEMENT_TABLE = "CREATE TABLE " +
                ElementsContract.ELEMENT_TABLE + "(" + ElementsContract._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                ElementsContract.ELEMENT_NAME + " TEXT NOT NULL, " + ElementsContract.ATOMIC_NUMBER + " INT NOT NULL, " +
                ElementsContract.SHORT_FORM + " TEXT NOT NULL" + ");";

        sqLiteDatabase.execSQL(SQL_CREATE_ELEMENT_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        // Note that this only fires if you change the version number for your database.
        // It does NOT depend on the version number for your application.
        // If you want to update the schema without wiping data, commenting out the next 2 lines
        // should be your top priority before modifying this method.
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ElementsContract.ELEMENT_TABLE);
        onCreate(sqLiteDatabase);
    }

}