package nam.trung.tran.ttn_cau2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GiaiPTB2 extends AppCompatActivity {
    private EditText inputA, inputB, inputC;
    private Button btnGiai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giai_ptb2);
        final Intent intent = getIntent();
        inputA = findViewById(R.id.inputA);
        inputB = findViewById(R.id.inputB);
        inputC = findViewById(R.id.inputC);
        btnGiai = findViewById(R.id.btnGiai);
        btnGiai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float valueA = Float.parseFloat(inputA.getText().toString());
                Float valueB = Float.parseFloat(inputB.getText().toString());
                Float valueC = Float.parseFloat(inputC.getText().toString());
                final String result = GiaiPTB2(valueA, valueB, valueC);
                intent.putExtra("value", result);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }

    public String GiaiPTB2(float a, float b, float c) {
        double delta = b*b -4*a*c;
        double x1;
        double x2;
        double x;

        if(delta > 0){
            x1 = ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = ((-b - Math.sqrt(delta)) / (2 * a));
            return "x1 = " + x1 + ", x2 =" + x2;
        }
        else {
            if (delta == 0) {
                x = ((-b) / (2 * a));
                return "x = " + x;
            }
            else {
                return "Phương trình vô nghiệm";
            }
        }

    }
}
