package unicauca.movil.holamundo.fragments;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import unicauca.movil.holamundo.fragments.fragments.DetailFragment;
import unicauca.movil.holamundo.fragments.fragments.MasterFragment;


public class MainActivity extends ActionBarActivity implements MasterFragment.MasterI{

    boolean phone, port;
    DetailFragment detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phone = getResources().getBoolean(R.bool.phone);
        port = getResources().getBoolean(R.bool.port);

        if(!phone && !port){
            detail = (DetailFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.detail);
        }
    }

    @Override
    public void onContentClick(int content) {
        String contentMsg="";
        switch (content){
            case MasterFragment.CONTENT_1:
                contentMsg = "Contenido Uno";
                break;
            case MasterFragment.CONTENT_2:
                contentMsg = "Contenido Dos";
                break;
            case MasterFragment.CONTENT_3:
                contentMsg = "Contenido Tres";
                break;
        }

        if(detail!=null)
            detail.setContent(contentMsg);
        else{

        }
    }
}
