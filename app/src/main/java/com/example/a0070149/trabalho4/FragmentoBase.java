package com.example.a0070149.trabalho4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentoBase extends Fragment {
    private static final String TEXTO = "texto";
    private static final String COR_BG = "corBg";
    private static final String COR_TEXTO = "corTexto";

    public static FragmentoBase configFragmentoBase(String texto, int background, int foreground){
        Bundle parametros = new Bundle();
        parametros.putString(TEXTO, texto);
        parametros.putInt(COR_BG, background);
        parametros.putInt(COR_TEXTO, foreground);
        FragmentoBase frag = new FragmentoBase();
        frag.setArguments(parametros);
        return frag;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle parametros = getArguments();
        String texto = parametros.getString(TEXTO);
        int background = parametros.getInt(COR_BG);
        int foreground = parametros.getInt(COR_TEXTO);
        View rootView = inflater.inflate(R.layout.fragmento_do_fragmento, container, false);
        rootView.setBackgroundColor(background);
        TextView txt = (TextView)rootView.findViewById(R.id.textofrag);
        txt.setText(texto);
        txt.setTextColor(foreground);
        return rootView;
    }
}
