package br.eti.school.mobile.goSchool.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.eti.school.mobile.goSchool.R;
import br.eti.school.mobile.goSchool.models.Category;
import br.eti.school.mobile.goSchool.util.DebugActivity;

public class CategoryActivity extends DebugActivity {

    protected EditText txtName;
    protected EditText txtDescription;
    protected List<Category> categories = new ArrayList<Category>();
    protected List<HashMap<String,String>> dados = new ArrayList<HashMap<String,String>>();
    protected ListView listViewCategory;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void addCategory(View view) {

        txtName = findViewById(R.id.txtName);
        txtDescription = findViewById(R.id.txtDescription);

        String name,description;
        name = txtName.getText().toString();
        description = txtDescription.getText().toString();

        categories.add(new Category(name,description));

        HashMap<String,String> item = new HashMap<String,String>();
        item.put("name",name);
        item.put("description",description);

        dados.add(item);

        String[] from =  {"name","description"};
        int[] to = {R.id.labelName,R.id.labelDescription};

        listViewCategory = findViewById(R.id.listViewCategory);

        SimpleAdapter adapter = new SimpleAdapter(getApplicationContext(),dados,R.layout.item_category,from,to);

        listViewCategory.setAdapter(adapter);
    }
}
