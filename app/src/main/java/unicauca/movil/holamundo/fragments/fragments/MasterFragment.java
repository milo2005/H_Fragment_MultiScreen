package unicauca.movil.holamundo.fragments.fragments;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import unicauca.movil.holamundo.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MasterFragment extends Fragment implements View.OnClickListener {


    public static final int CONTENT_1 = 0;
    public static final int CONTENT_2 = 1;
    public static final int CONTENT_3 = 2;

    public interface MasterI{
        void onContentClick(int content);
    }

    Button btn1, btn2, btn3;
    MasterI masterI;

    public MasterFragment() {}


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        masterI = (MasterI) activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.f_master, container, false);

        btn1 = (Button) v.findViewById(R.id.btn1);
        btn2 = (Button) v.findViewById(R.id.btn2);
        btn3 = (Button) v.findViewById(R.id.btn3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

        return v;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                masterI.onContentClick(CONTENT_1);
                break;
            case R.id.btn2:
                masterI.onContentClick(CONTENT_2);
                break;
            case R.id.btn3:
                masterI.onContentClick(CONTENT_3);
                break;
        }
    }
}
