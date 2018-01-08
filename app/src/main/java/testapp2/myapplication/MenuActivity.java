package testapp2.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;

/**
 * Created by Пользователь on 28.10.2017.
 */

public class MenuActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Приложение");
        toolbar.setSubtitle("Описание приложения");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
            }
        });
    }

    public void gotoPeople(View v){
        Intent PeopleActivity = new Intent (this, PeopleActivity.class);
        startActivity(PeopleActivity);
        overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
    }

    public void gotoEvents(View v){
        Intent EventsActivity = new Intent (this, EventsActivity.class);
        startActivity(EventsActivity);
        overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
    }

    public void gotoPlaces(View v){
        Intent PlacesActivity = new Intent (this, PlacesActivity.class);
        startActivity(PlacesActivity);
        overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
    }

    public void gotoDrawer(View v){
        Intent DrawerActivity = new Intent (this, DrawerActivity.class);
        startActivity(DrawerActivity);
        overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
    }

    public void gotoMap(View v){
        Intent MapsActivity = new Intent (this, MapsActivity.class);
        startActivity(MapsActivity);
        overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
    }

    public void gotoUserType(View v){
        Intent MapsActivity = new Intent (this, TypeActivity.class);
        startActivity(MapsActivity);
        overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
    }
}
