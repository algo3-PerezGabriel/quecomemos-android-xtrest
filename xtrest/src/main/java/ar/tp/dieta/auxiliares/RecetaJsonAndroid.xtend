package ar.tp.dieta.auxiliares

import org.eclipse.xtend.lib.annotations.Accessors
import ar.tp.dieta.Receta

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
    
	public new (Receta unaReceta){
    	this.id = unaReceta.id
    	this.nombre = unaReceta.nombre
    	this.dificultad = unaReceta.dificultad
    	this.temporada = unaReceta.temporada
    	this.preparacion = unaReceta.preparacion
    	this.calorias = unaReceta.calorias
    	this.autor = unaReceta.nombreOwner
    	this.favorita = unaReceta.esFavorita
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