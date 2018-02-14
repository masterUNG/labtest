package labtest.pattrawut.androidthai.in.th.labtest.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import labtest.pattrawut.androidthai.in.th.labtest.MainActivity;
import labtest.pattrawut.androidthai.in.th.labtest.R;

/**
 * Created by Pattrawut on 2/13/2018.
 */

public class MainFragment extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Button button = getView().findViewById(R.id.btncalculate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.contentMainFragment, new CalculateFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });

    }

    private void createToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.toolbarMain);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);


    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
}
