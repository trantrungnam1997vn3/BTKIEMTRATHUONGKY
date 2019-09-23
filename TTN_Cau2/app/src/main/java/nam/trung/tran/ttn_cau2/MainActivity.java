package nam.trung.tran.ttn_cau2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnCall;
    private TextView textResult;
    private final int GIAIPTBT2_REQUEST_CODE = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCall = findViewById(R.id.btnCall);
        textResult = findViewById(R.id.textResult);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GiaiPTB2.class);
                startActivityForResult(intent, GIAIPTBT2_REQUEST_CODE);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == GIAIPTBT2_REQUEST_CODE)
        {
            if (resultCode == RESULT_OK) {
                textResult.setText(data.getStringExtra("value"));
            }
        }
    }
}
