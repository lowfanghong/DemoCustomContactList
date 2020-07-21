package sg.edu.rp.c346_18021531.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;
    ArrayList<Contact> alContactlist;
    ArrayAdapter<Contact> CaContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact =findViewById(R.id.listViewContacts);

        alContactlist = new ArrayList<>();
        Contact item1 = new Contact("mary",65,65442334,'F');
        alContactlist.add(item1);
        Contact item2 = new Contact("Ken",65,97442437,'M');
        alContactlist.add(item2);

        CaContact = new CustomAdapter(this,R.layout.row,alContactlist);
        lvContact.setAdapter(CaContact);
    }
}