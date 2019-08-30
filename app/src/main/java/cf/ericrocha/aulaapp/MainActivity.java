package cf.ericrocha.aulaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void gerarValor(View view){
        TextView text_resultado = findViewById(R.id.text_Resultado);
        int num = new Random().nextInt(2);
        text_resultado.setText(getText(R.string.text_padrao)+" " + num);
    }


}
