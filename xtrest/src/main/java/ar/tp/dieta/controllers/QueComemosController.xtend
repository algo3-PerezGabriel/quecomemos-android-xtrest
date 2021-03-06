package ar.tp.dieta.controllers

import ar.tp.dieta.RecetarioPublico
import ar.tp.dieta.RepoRecetas
import org.uqbar.xtrest.api.Result
import org.uqbar.xtrest.api.XTRest
import org.uqbar.xtrest.api.annotation.Controller
import org.uqbar.xtrest.api.annotation.Get
import org.uqbar.xtrest.json.JSONUtils

@Controller
class QueComemosController {
	
	
	extension JSONUtils = new JSONUtils
	
	RecetarioPublico recetario = new RepoRecetas().getRecetarioPublico
	
	def static void main(String[] args) {
		XTRest.start(QueComemosController, 8080)
	}
	
	@Get("/listaDeRecetas")
	def Result recetasGrilla(){
		ok(recetario.getRecetasAndroid().toJson)
	}
	
	@Get("/")
	def Result pathRoot(){
		ok('{ "status" : "OK" }')
	}
	
}



