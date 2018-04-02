package id.web.annisa.pop;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class tab2_fragment extends Fragment {
    private static final String TAG = "tab2_fragment";
    private Button BTNdaftarGedung;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab2_fragment,container,false);
        BTNdaftarGedung = (Button) view.findViewById(R.id.buttonSimpanDaftarGedung);

        BTNdaftarGedung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Anda berhasil mendaftar!",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
