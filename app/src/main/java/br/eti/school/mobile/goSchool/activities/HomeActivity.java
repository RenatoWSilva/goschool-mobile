package br.eti.school.mobile.goSchool.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import br.eti.school.mobile.goSchool.R;
import br.eti.school.mobile.goSchool.util.DebugActivity;

public class HomeActivity extends DebugActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void abrirTela(View view) {

        Intent intent = null;
        Bundle bundle = null;

        switch (view.getId()){

            case R.id.btnProduto:
                //call view Product
                Log.i(TAG, "\t\tCall view Product ");
                //Intent é uma intenção para o sistema operacional executa
                //para chamar uma nova tela
                intent = new Intent(this, ProductActivity.class);

                //O objeto bundle vc pode "opcionalmente" passar dados entre as telas.
                bundle = new Bundle();
                bundle.putString("nome","Tela de produto");
                intent.putExtras(bundle);

                //Neste método a sistema abre a tela definida na Intent.
                startActivity(intent);

                break;

            case R.id.btnCategory:
                //call view Category
                Log.i(TAG, "\t\tCall view Category ");

                intent = new Intent(this, CategoryActivity.class);
                bundle = new Bundle();
                bundle.putString("nome","Tela de produto");
                intent.putExtras(bundle);
                startActivity(intent);
                break;

            case R.id.btnUser:
                //call view user
                Log.i(TAG, "\t\tCall view User ");

                intent = new Intent(this, UserActivity.class);
                bundle = new Bundle();
                bundle.putString("nome","Tela de produto");
                intent.putExtras(bundle);
                startActivity(intent);
                break;

            default:
                Log.e(TAG, "\t\tView not found ");
                Log.e(TAG, String.format("Id: %s",view.getId()));
                break;
        }
    }
}