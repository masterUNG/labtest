package labtest.pattrawut.androidthai.in.th.labtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import labtest.pattrawut.androidthai.in.th.labtest.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //        Add Fragment to Activity
        if (savedInstanceState==null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFragment, new MainFragment())
                    .commit();
        }
    }

}
