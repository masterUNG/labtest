package labtest.pattrawut.androidthai.in.th.labtest.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import labtest.pattrawut.androidthai.in.th.labtest.MainActivity;
import labtest.pattrawut.androidthai.in.th.labtest.R;

/**
 * Created by Pattrawut on 2/13/2018.
 */

public class CalculateFragment extends Fragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }   //Main Method

    private void createdToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.toolbarMain);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);

        ((MainActivity) getActivity()).getSupportActionBar()
                .setTitle("Calculate USD To THB");

        ((MainActivity) getActivity()).getSupportActionBar()
                .setHomeButtonEnabled(true);
        ((MainActivity) getActivity()).getSupportActionBar()
                .setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).getSupportFragmentManager().popBackStack();
            }
        });
        }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate, container, false);
        return view;

    }
}   // Main Method
