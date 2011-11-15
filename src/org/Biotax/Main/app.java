package org.Biotax.Main;

import org.semanticweb.owlapi.model.OWLOntologyCreationException;



class app{
	public static void main(String Args[]) throws OWLOntologyCreationException{
	KComponent knowledgemodule = new KComponent("src/Biotax.owl");
	Hoja hoja = new Hoja();
	hoja.tipoborde="Entero";
	hoja.tipohoja="Simple";
	hoja.posicionhoja= "Alterna";
	knowledgemodule.IdentifyHoja(hoja);
	System.out.println(knowledgemodule.assertionset.size());
	}
};