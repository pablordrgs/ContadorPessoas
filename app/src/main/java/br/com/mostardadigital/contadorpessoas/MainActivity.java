package br.com.mostardadigital.contadorpessoas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView totalPessoas;

    Button botaoHomem;
    Button botaoMulher;
    Button botaoReset;
    Button botaoSegunda;

    int numeroHomens = 0;
    int numeroMulheres = 0;
    int numeroPessoas = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalPessoas = (TextView) findViewById(R.id.totalPessoas);
        botaoHomem = (Button) findViewById(R.id.botaoHomem);
        botaoMulher = (Button) findViewById(R.id.botaoMulher);
        botaoReset = (Button) findViewById(R.id.botaoReset);

        botaoSegunda = (Button) findViewById(R.id.buttonSegunda);

        botaoSegunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                startActivity(intent);
            }
        });

        botaoHomem.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                numeroHomens++;
                numeroPessoas++;
                String mensagem = Integer.toString(numeroPessoas);
                totalPessoas.setText("Total: " + mensagem + " pessoas");
                botaoHomem.setText(Integer.toString(numeroHomens));

            }
        });

        botaoMulher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                numeroMulheres++;
                numeroPessoas++;
                String mensagem = Integer.toString(numeroPessoas);
                totalPessoas.setText("Total: " + mensagem + " pessoas");
                botaoMulher.setText(Integer.toString(numeroMulheres));
            }
        });

        botaoReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                numeroHomens = 0;
                numeroMulheres = 0;
                numeroPessoas = 0;

                String mensagem = Integer.toString(numeroPessoas);
                totalPessoas.setText("Total: " + mensagem + " pessoas");
                botaoHomem.setText(Integer.toString(numeroHomens));
                botaoMulher.setText(Integer.toString(numeroMulheres));
            }
        });
    }
}
