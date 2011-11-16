package org.Biotax.Main;
import java.awt.EventQueue;

import javax.swing.JFrame;

import org.Biotax.GUI.*;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;



class app{

	public static void main(String Args[]) throws OWLOntologyCreationException, OWLOntologyStorageException{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Recolectadatos window = new Recolectadatos();
					window.frmBiotax.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
};