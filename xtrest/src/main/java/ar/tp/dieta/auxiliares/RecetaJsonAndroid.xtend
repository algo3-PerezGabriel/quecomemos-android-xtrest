package ar.tp.dieta.auxiliares

import ar.tp.dieta.Receta
import java.util.ArrayList
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class RecetaJsonAndroid {
	long id
	String nombre
    String dificultad
	String temporada
	String preparacion
	int calorias
	String autor
	boolean favorita
	
	List<String> condimentos = new ArrayList<String>
    List<String> ingredientes = new ArrayList<String>
    List<String> condiciones = new ArrayList<String>
    
    
    
	public new (Receta unaReceta){
    	this.id = unaReceta.id
    	this.nombre = unaReceta.nombre
    	this.dificultad = unaReceta.dificultad
    	this.temporada = unaReceta.temporada
    	this.preparacion = unaReceta.preparacion
    	this.calorias = unaReceta.calorias
    	this.autor = unaReceta.nombreOwner
    	this.favorita = unaReceta.esFavorita
    	this.condimentos = unaReceta.getCondimentos()
    	this.ingredientes = unaReceta.getIngredientes()
    	this.condiciones = unaReceta.getCondiciones()
    	
    }
    
    new (long id, String nombre, String dificultad, String temporada, 
    	String preparacion, String autor, boolean favorita, int calorias){
    	
    	this.nombre = nombre
    	this.dificultad = dificultad
    	this.temporada = temporada
    	this.preparacion = preparacion
    	this.calorias = calorias
    	this.autor = autor
    	this.favorita = favorita
    }
}