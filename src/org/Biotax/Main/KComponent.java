package org.Biotax.Main;
//Imports de Java
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;
import java.util.Iterator;
//Imports del Owl Api
import org.semanticweb.owlapi.io.*;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.apibinding.*;
import org.semanticweb.owlapi.reasoner.*;

//Imports del Hermit Reasoner
import org.semanticweb.HermiT.Reasoner;



// Developed by Rolilink (https://github.com/Rolilink)



//Implementacion de un diccionarios de iris 
//para acceder a los individuos
class IRIdictionary{
public IRI documentiri;
//partes
public IRI hoja;
public IRI fruto;
public IRI flor;
//estructuras accsesorias
public IRI semilla;
public IRI savia;
public IRI sarcillo;
public IRI punto;
public IRI pelo;
public IRI nervadura;
public IRI glandula;
public IRI estipula;
public IRI espina;
public IRI escama;
public IRI olor;
//color
public IRI amarilla;
public IRI anaranjada;
public IRI blanca;
public IRI incolora;
public IRI roja;
//tipos de frutos
public IRI alado;
public IRI baya;
public IRI capsula;
public IRI dicarpo;
public IRI foliculo;
public IRI legumbre;
public IRI monocarpos;
public IRI nuez;
public IRI pixidio;
public IRI sincarpos;
//tipos de nervadura
public IRI trinervada;
public IRI pinnada;
public IRI escaleriforme;
//tipo de hoja
public IRI simple;
public IRI trifoliada;
public IRI paripinnada;
public IRI imparipinnada;
public IRI digitada;
public IRI bipinnada;
public IRI bifoliada;
//tipo de borde
public IRI dentado;
public IRI entero;
//posicion de hoja
public IRI opuesta;
public IRI alterna;

IRIdictionary(String r){
  this.documentiri=IRI.create(r);
  String s = r+"#";
  //declaracion de IRIs
//partes
  this.hoja = IRI.create(s + "ihoja");
  this.fruto= IRI.create(s + "ifruto");
  this.flor= IRI.create(s + "iflor");
  //estructuras accsesorias
  this.semilla= IRI.create(s + "isemilla");
  this.savia= IRI.create(s + "isavia");
  this.sarcillo= IRI.create(s + "isarcillo");
  this.punto= IRI.create(s + "ipunto");
  this.pelo= IRI.create(s + "ipelo");
  this.nervadura= IRI.create(s + "inervadura");
  this.glandula= IRI.create(s + "iglandula");
  this.estipula= IRI.create(s + "iestipula");
  this.espina= IRI.create(s + "iespina");
  this.escama= IRI.create(s + "iescama");
  this.olor= IRI.create(s + "xolor");
  //color
  this.amarilla= IRI.create(s + "xamarilla");
  this.anaranjada= IRI.create(s + "xanaranjada");
  this.blanca= IRI.create(s + "xblanca");
  this.incolora= IRI.create(s + "xincolora");
  this.roja= IRI.create(s + "xroja");
  //tipos de frutos
  this.alado= IRI.create(s + "falado");
  this.baya= IRI.create(s + "fbaya");
  this.capsula= IRI.create(s + "fcapsula");
  this.dicarpo= IRI.create(s + "fdicarpo");
  this.foliculo= IRI.create(s + "ffoliculo");
  this.legumbre= IRI.create(s + "flegumbre");
  this.monocarpos= IRI.create(s + "fmonocarpos");
  this.nuez= IRI.create(s + "fnuez");
  this.pixidio= IRI.create(s + "fpixidio");
  this.sincarpos= IRI.create(s + "fsincarpos");
  //tipos de nervadura
  this.trinervada = IRI.create(s + "ntrinervada");
  this.pinnada = IRI.create(s + "npinnada");
  this.escaleriforme = IRI.create(s + "nescaleriforme");
  //tipo de hoja
  this.simple= IRI.create(s + "hsimple");
  this.trifoliada= IRI.create(s + "htrifoliolada");
  this.paripinnada= IRI.create(s + "hparipinnada");
  this.imparipinnada= IRI.create(s + "himparipinnada");
  this.digitada= IRI.create(s + "hdigitada");
  this.bipinnada= IRI.create(s + "hbipinnada");
  this.bifoliada= IRI.create(s + "hbifoliolada");
  //tipo de borde
  this.dentado = IRI.create(s + "bdentado");
  this.entero = IRI.create(s + "bentero");
  //posicion de hoja
  this.opuesta= IRI.create(s + "popuesto");
  this.alterna= IRI.create(s + "palterna");
}
}

//Componente de conocimiento de la aplicacion consta de una Ontologia(Base de Conocimientos)
//y el razonador hermit (Motor de Inferencia)
public class KComponent {
// Atributos del Componente de conocimiento
private File file;
private OWLOntology knowledgebase;
private OWLOntologyManager manager;
private OWLDataFactory factory;
private IRIdictionary iridictionary;
private OWLReasoner reasoner;
};

