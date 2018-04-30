package id.web.annisa.projectpop;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by ASUS on 01/03/2018.
 */

public class tab1_fragment extends Fragment {
    private static final String TAG = "tab1_fragment";
    private Button BTNcariGedung;
    private TextView slogan;
    private Spinner sp;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab1_fragment,container,false);
        BTNcariGedung = (Button) view.findViewById(R.id.btn_cari_gedung);
        slogan = (TextView) view.findViewById(R.id.slogan);


        //membuat Spinner
        sp = (Spinner) view.findViewById(R.id.spinner);
        if (sp != null) {
            sp.setOnItemSelectedListener(this);
        }
        //membuat ArrayAdapter
        ArrayAdapter<CharSequence> adapterr = ArrayAdapter.createFromResource(getContext(), R.array.namaLokasi, android.R.layout.simple_spinner_item);
        adapterr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        if (sp != null) {
            sp.setAdapter(adapterr);
        }
        return view;
    }
}