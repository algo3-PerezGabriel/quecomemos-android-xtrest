package algo3.gabo.quecomemos.recetas.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabo on 24/11/2015.
 */
public class Receta implements Serializable {

    private long id;
    private String nombre;
    private String dificultad;
    private String temporada;
    private String preparacion;
    private int calorias;
    private String autor;
    private boolean favorita;

    List<String> ingredientes = new ArrayList<>();
    List<String> condimentos = new ArrayList<>();
    List<String> condiciones = new ArrayList<>();

    public Receta(String nombre, String dificultad, String temporada, int calorias, String autor, String preparacion, boolean favorita) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.temporada = temporada;
        this.preparacion = preparacion;
        this.calorias = calorias;
        this.autor = autor;
        this.favorita = favorita;
    }

    public String getAutor() { return autor; }

    public void setAutor(String autor) { this.autor = autor; }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) { this.calorias = calorias; }

    public long getId() { return id; }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita() {
        this.favorita = true;
    }

    public String getCondimentos(){
        return listaToArray(this.condimentos);
    }

    public String getIngredientes(){
        return listaToArray(this.ingredientes);
    }

    public String getCondiciones(){
        return listaToArray(this.condiciones);
    }

    public String listaToArray(List<String> lista) {
        String aDevolver = "";
        for (String palabra : lista) {
            aDevolver = palabra + ", " + aDevolver;
        }
        return aDevolver;
    }
}
