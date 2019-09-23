package nam.trung.tran.ttn_cau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private FilmModel films[] = {new FilmModel("Wolfverin", "American", 30),
            new FilmModel("SwordFish", "American", 15),
            new FilmModel("Deadpool", "American", 29), new FilmModel("RobinHood", "American", 35),
            new FilmModel("EndGame", "American", 100), new FilmModel("Ironman", "American", 70)};
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_item);

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), films);
        listView.setAdapter(customAdapter);
    }
}
