package com.example.elyes.helloworld;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText editTxtNom , editTxtPrenom ;
    Button btnLogin ;
    String valueNom, valuePrenom ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       //relation entre fichier java et fichier xml
        setContentView(R.layout.activity_main);
        //get the Objects from the xml file
          editTxtPrenom = (EditText) findViewById(R.id.editTxtPrenom);
        editTxtNom = (EditText) findViewById(R.id.editTxtNom);
        btnLogin = (Button) findViewById(R.id.btnLogin);
      btnLogin.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              valueNom = editTxtNom.getText().toString();
              valuePrenom = editTxtPrenom.getText().toString();
              Toast.makeText(MainActivity.this,"Votre nom est "
                      +valueNom+ "et Votre prenom est "+valuePrenom,Toast.LENGTH_SHORT).show();
          }
      });
    }
}
