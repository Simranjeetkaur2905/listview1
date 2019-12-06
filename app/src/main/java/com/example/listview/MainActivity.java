package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    EditText editText;
    Button button;
    ListView listView;
    ArrayAdapter<String> aa;
    ArrayList<String> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        arrayList = new ArrayList<>();

        editText = findViewById(R.id.edit);
        button = findViewById(R.id.btn);
        listView = findViewById(R.id.list);
//        aa = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);
//        listView.setAdapter(aa);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    String str  = editText.getText().toString();

                            arrayList.add(str);
                            listView.deferNotifyDataSetChanged();
                aa = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, arrayList);
                listView.setAdapter(aa);

                        }

        });
        }



//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }


}
