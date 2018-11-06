package br.eti.school.mobile.goSchool.activities;

import android.os.Bundle;
import android.widget.Toast;

import br.eti.school.mobile.goSchool.R;
import br.eti.school.mobile.goSchool.util.DebugActivity;

public class ProductActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motorista);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            String texto = bundle.getString("nome");
            Toast.makeText(this,texto,Toast.LENGTH_LONG).show();
        }
    }
}
