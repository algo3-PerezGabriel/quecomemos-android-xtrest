package algo3.gabo.quecomemos.recetas.service;

import java.util.List;

import algo3.gabo.quecomemos.recetas.dominio.Receta;


import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;


/**
 * Created by Gabo on 24/11/2015.
 */
public interface RecetasService {
    @GET("listaDeRecetas")
    Call<List<Receta>> getRecetas();

}
