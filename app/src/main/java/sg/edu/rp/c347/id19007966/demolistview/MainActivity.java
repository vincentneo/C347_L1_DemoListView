package sg.edu.rp.c347.id19007966.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter adapter;
    ArrayList<Food> foods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lvFood);

        foods = new ArrayList<>();
        foods.add(new Food("Ah Lat Coffee", false));
        foods.add(new Food("Rocky Choc", true));
        foods.add(new Food("Kid Cat Choc", true));

        adapter = new FoodAdapter(this, R.layout.row, foods);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Food selected = foods.get(i);

                Toast.makeText(MainActivity.this,
                        selected.getName() + " Star: " + selected.isStar(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}