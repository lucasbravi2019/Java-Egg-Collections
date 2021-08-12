package com.lucas.Ejercicio2Extra.Servicios;

import com.lucas.Ejercicio2Extra.Entidades.CantanteFamoso;

public class CantanteFamosoService {
    public static CantanteFamosoService instance;

    private CantanteFamosoService() {

    }

    public static CantanteFamosoService getInstance() {
        if (instance == null) {
            instance = new CantanteFamosoService();
        }
        return instance;
    }

    public CantanteFamoso crearCantante(String nombre, String disco) {
        return new CantanteFamoso(nombre, disco);
    }

}
