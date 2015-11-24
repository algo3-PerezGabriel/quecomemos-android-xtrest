package algo3.gabo.quecomemos.recetas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import algo3.gabo.quecomemos.recetas.dominio.Receta;


public class RepoRecetas {
    private List<Receta> recetas;
    private static final int MAX_RESULTS = 5;

    private int contador = 0;


    private static RepoRecetas instance;

    private RepoRecetas(){
        recetas = new ArrayList<>();
    }

    public static RepoRecetas getInstance(){
        if(instance == null){
            instance = new RepoRecetas();
            instance.init();
        }
        return instance;
    }

    public void init(){
        RepoRecetas.getInstance().addReceta(new Receta("Cazuela", "Dificil", "Invierno", 300, "Gabo", "hervir mucho mucho", true));
        RepoRecetas.getInstance().addReceta(new Receta("Ensalada", "Facil", "Primavera", 213, "Luna", "cocinar batir etc", false));
        RepoRecetas.getInstance().addReceta(new Receta("Pollito", "Media", "Verano", 3452, "Luna", "cortar, mezclar, batir", true));
        RepoRecetas.getInstance().addReceta(new Receta("PapasFritas", "Dificil", "Otonio", 455, "Gabo", "hornear, amasar", true));
        RepoRecetas.getInstance().addReceta(new Receta("Pure azul", "Media", "Todo El Anio", 467, "Pepe", "pelar, picar, freir", false));
        RepoRecetas.getInstance().addReceta(new Receta("Asadito", "Facil", "Todo El Anio", 334, "Pepe", "mezclar batir batir amasar", true));
    }

    public void addReceta(Receta receta){
        contador ++;
        receta.setId(contador);
        recetas.add(receta);
    }

    public Receta getReceta(Long id){
        for(Receta receta : this.recetas){
            if(receta.getId() == id){
                return receta;
            }
        }
        return null;
    }

    public List<String> getNombresRecetas(){
        List<String> nombres = new ArrayList<>();
        for(Receta receta : this.getRecetas(null,10)){
            nombres.add(receta.getNombre());
        }
        return nombres;
    }

    public List<Receta> getRecetas(String nombre,int max){
        Iterator<Receta> it = recetas.iterator();
        List<Receta> result = new ArrayList<>();
        while(it.hasNext() && max > 0){
            Receta receta = it.next();
            max--;
            if(nombre == null || receta.getNombre().contains(nombre)){
                result.add(receta);
            }
        }
        return result;
    }
}