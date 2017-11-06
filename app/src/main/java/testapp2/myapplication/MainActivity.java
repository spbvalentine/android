package testapp2.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Приложение");
        toolbar.setSubtitle("Описание приложения");
    }

    public void gotoMenu(View v){
        Intent MenuActivity = new Intent (this, MenuActivity.class);
        startActivity(MenuActivity);
        overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
    }

    public void gotoRegistration(View v){
        Intent RegistrationActivity = new Intent (this, RegistrationActivity.class);
        startActivity(RegistrationActivity);
        overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
    }

}
