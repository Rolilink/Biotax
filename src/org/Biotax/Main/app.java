package org.Biotax.Main;

import org.semanticweb.owlapi.model.OWLOntologyCreationException;



class app{
	public static void main(String Args[]) throws OWLOntologyCreationException{
	KComponent knowledgemodule = new KComponent("src/Biotax.owl");
	Hoja hoja = new Hoja();
	Planta especie = new Planta();
	hoja.tipoborde="Entero";
	hoja.tipohoja="Simple";
	hoja.posicionhoja= "Alterna";
	especie.hoja=hoja;
	knowledgemodule.Identify(especie);
	}
};