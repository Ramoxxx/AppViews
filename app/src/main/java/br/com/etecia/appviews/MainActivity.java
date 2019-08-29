package br.com.etecia.appviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Num1, Num2;
    Button BtnSomar;
    TextView lblResposta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Num1 = (EditText) findViewById(R.id.txtNum1);
        Num2 = (EditText) findViewById(R.id.txtNum2);
        lblResposta = (TextView) findViewById(R.id.lbResposta);

        //ação do botão somar
        BtnSomar = (Button) findViewById(R.id.btnSomar);
        BtnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               double resp=0;
               String N1 = Num1.getText().toString();
               String N2 = Num2.getText().toString();

               resp = Double.parseDouble(N1)+ Double.parseDouble(N2);

               lblResposta.setText(String.valueOf(resp));
            }
        });

    }
}
