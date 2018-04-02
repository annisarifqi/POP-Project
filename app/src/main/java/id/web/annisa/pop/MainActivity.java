package id.web.annisa.pop;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private static final String TAG = "MainActivity";
    private SectionsPageAdapter mSectionsPageAdapter;
    private ViewPager mViewPager;
    Spinner sp;
    private String mSpinner = "";
    private Button btnCari ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Starting.");

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        //set up the ViewPager with the sections adapter
        mViewPager = (ViewPager) findViewById(R.id.pager);
        setupViewPager(mViewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(mViewPager);
        //button cari
        btnCari = (Button)findViewById(R.id.btn_cari_gedung);


        //membuat Spinner
        sp = (Spinner) findViewById(R.id.spinner);
        if (sp != null) {
            sp.setOnItemSelectedListener(this);
        }
        //membuat ArrayAdapter
        ArrayAdapter<CharSequence> adapterr = ArrayAdapter.createFromResource(this, R.array.namaLokasi, android.R.layout.simple_spinner_item);
        adapterr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        if (sp != null) {
            sp.setAdapter(adapterr);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        mSpinner = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(), mSpinner, Toast.LENGTH_SHORT).show();
        showText(view);

    }

    private void showText(View view) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Log.d(TAG, "onNothingSelected: ");
    }

    private void setupViewPager(ViewPager viewPager){
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new tab1_fragment(),"Cari Gedung");
        adapter.addFragment(new tab2_fragment(),"Daftar");
        viewPager.setAdapter(adapter);
    }
}
