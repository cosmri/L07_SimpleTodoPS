package sg.edu.rp.c346.id21001096.l07_simpletodops;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText edt;
    Button add;
    Button clear;
    ListView lv;
    ArrayList<String> alList;
    ArrayAdapter<String> aaList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt = findViewById(R.id.edt);
        add = findViewById(R.id.add);
        clear = findViewById(R.id.clear);
        lv = findViewById(R.id.lv);

        alList = new ArrayList<>();

        aaList = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, alList);

        lv.setAdapter(aaList);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String item = edt.getText().toString();
                alList.add(item);
                aaList.notifyDataSetChanged();
                edt.setText(null);
            }
        });

        clear.setOnClickListener((view -> {
            alList.clear();
            aaList.notifyDataSetChanged();
        }


                ));


    }
}