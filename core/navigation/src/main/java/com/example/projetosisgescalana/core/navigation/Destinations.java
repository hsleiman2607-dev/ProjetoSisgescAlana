package com.example.projetosisgescalana.core.navigation;

import android.content.Context;
import android.content.Intent;

public class Destinations {
    private Destinations() {}

    private static final String PKG = "com.example.projetosisgescalana";

    public static Intent loginPerfilA(Context c) {
        return new Intent().setClassName(c, PKG + ".feature.perfila.PerfilALoginActivity");
    }

    public static Intent loginPerfilB(Context c) {
        return new Intent().setClassName(c, PKG + ".feature.perfilb.PerfilBLoginActivity");
    }

    public static Intent loginPerfilC(Context c) {
        return new Intent().setClassName(c, PKG + ".feature.perfilc.PerfilCLoginActivity");
    }

    public static Intent selecaoPerfil(Context c) {
        Intent i = new Intent().setClassName(c, PKG + ".MainActivity");
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        return i;
    }
}
