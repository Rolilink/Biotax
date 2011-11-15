package org.Biotax.Main;

import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;



class app{
	public static void main(String Args[]) throws OWLOntologyCreationException, OWLOntologyStorageException{
	KComponent knowledgemodule = new KComponent("src/Biotax.owl");
	Hoja hoja = new Hoja();
	Planta especie = new Planta();
	hoja.tipoborde="Entero";
	hoja.tipohoja="Simple";
	hoja.posicionhoja= "Opuesta";
	especie.hoja=hoja;
	especie.estipula=true;
	knowledgemodule.Identify(especie);
	}
};