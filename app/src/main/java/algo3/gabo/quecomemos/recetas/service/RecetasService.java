package algo3.gabo.quecomemos.recetas.service;

import algo3.gabo.quecomemos.recetas.dominio.Receta;


import retrofit.Call;
import retrofit.http.GET;


/**
 * Created by Gabo on 24/11/2015.
 */
public interface RecetasService {
    @GET("/recetasToGrill")
    Call<Receta> getRecetas();
}
