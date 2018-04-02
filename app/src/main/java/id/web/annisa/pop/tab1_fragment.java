package id.web.annisa.pop;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by ASUS on 01/03/2018.
 */

public class tab1_fragment extends Fragment {
    private static final String TAG = "tab1_fragment";
    private Button BTNcariGedung;
    private TextView slogan;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab1_fragment,container,false);
        BTNcariGedung = (Button) view.findViewById(R.id.btn_cari_gedung);
        slogan = (TextView) view.findViewById(R.id.slogan);
        return view;
    }
}
