package br.com.mostardadigital.contadorpessoas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;

import com.ms.square.android.expandabletextview.ExpandableTextView;

/**
 * Created by Pablo on 16/11/2016.
 */

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        ExpandableTextView expandableTextView = (ExpandableTextView) findViewById(R.id.expand_text_view);

        expandableTextView.setText("oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo " +
                "\npppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp " +
                "\nwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww " +
                "\nffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");


    }
}
