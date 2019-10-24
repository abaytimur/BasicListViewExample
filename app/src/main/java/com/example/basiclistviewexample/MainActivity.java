package com.example.basiclistviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView lvDeneme;
    String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvDeneme=findViewById(R.id.lvDeneme);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,days); //ilk kisim context, ikinci kisim liste turu, ucuncu kisim datayi aldigimiz array

        lvDeneme.setAdapter(adapter);
        lvDeneme.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        
        TextView temp= (TextView) view;
        Toast.makeText(this, temp.getText()+" "+position, Toast.LENGTH_SHORT).show();
        
    }
}
