package org.Biotax.Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import org.Biotax.Main.*;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtResultado;
	public KComponent Conocimiento;
	Planta planta = new Planta();
	Fruto fruto = new Fruto();
	Hoja hoja = new Hoja();
	/*String thoja = null;
	String tborde = null;
	String posicionh = null;
	String nervadura = null;
	String fruto = null;
	//String eaccesoria[] = new String[10];
	boolean escamas = false;
	boolean espinas = false;
	boolean estipulas = false;
	boolean glandulas = false;
	boolean pelos = false ;
	boolean puntos = false ;
	boolean savia = false ;
	boolean sarcillos = false;
	boolean semilla = false ;
	boolean nervaduraa = false;
	boolean olor = false ; */

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws OWLOntologyCreationException 
	 */
	public GUI() throws OWLOntologyCreationException {
		Conocimiento = new KComponent("src/Biotax.owl");
		planta.espina = false;
		planta.nervadura = null;
		planta.estipula = false;
		planta.fruto = null;
		planta.hoja = null;
		planta.olor = false;
		planta.puntot = false;
		planta.semilla = false;
	    hoja.posicionhoja = null;
	    hoja.tipoborde = null;
	    hoja.tipohoja = null;
	    fruto.tipofruto =null;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 704);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDescripcinDelEspecmen = new JLabel("Descripci\u00F3n del espec\u00EDmen");
		lblDescripcinDelEspecmen.setForeground(new Color(0, 128, 0));
		lblDescripcinDelEspecmen.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDescripcinDelEspecmen.setBounds(10, 11, 228, 14);
		contentPane.add(lblDescripcinDelEspecmen);
		
		JLabel lblHoja = new JLabel("HOJA");
		lblHoja.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHoja.setBounds(33, 36, 46, 14);
		contentPane.add(lblHoja);
		
		JLabel lblNewLabel = new JLabel("Tipo:");
		lblNewLabel.setBounds(43, 52, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblBordes = new JLabel("Bordes:");
		lblBordes.setBounds(162, 52, 46, 14);
		contentPane.add(lblBordes);
		
		JLabel lblPosicin = new JLabel("Posici\u00F3n:");
		lblPosicin.setBounds(296, 52, 62, 14);
		contentPane.add(lblPosicin);
		
		JLabel lblNervadura = new JLabel("Nervadura");
		lblNervadura.setBounds(412, 52, 62, 14);
		contentPane.add(lblNervadura);
		
		JLabel lblFruto = new JLabel("FRUTO");
		lblFruto.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFruto.setBounds(33, 144, 46, 14);
		contentPane.add(lblFruto);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(43, 158, 46, 14);
		contentPane.add(lblTipo);
		
		JLabel lblEstructuraAccesoria = new JLabel("ESTRUCTURA ACCESORIA");
		lblEstructuraAccesoria.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEstructuraAccesoria.setBounds(33, 261, 147, 14);
		contentPane.add(lblEstructuraAccesoria);
		
		JLabel lblTipo_1 = new JLabel("Tipo:");
		lblTipo_1.setBounds(43, 276, 46, 14);
		contentPane.add(lblTipo_1);
		
		JLabel lblOlor = new JLabel("OLOR");
		lblOlor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOlor.setBounds(33, 436, 46, 14);
		contentPane.add(lblOlor);
		
		JLabel lblIdentificacinDelEspecmen = new JLabel("Identificaci\u00F3n del Espec\u00EDmen");
		lblIdentificacinDelEspecmen.setForeground(new Color(0, 128, 0));
		lblIdentificacinDelEspecmen.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdentificacinDelEspecmen.setBounds(10, 500, 216, 14);
		contentPane.add(lblIdentificacinDelEspecmen);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(33, 584, 530, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JLabel lblRes = new JLabel("Resultado");
		lblRes.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRes.setBounds(33, 559, 76, 14);
		contentPane.add(lblRes);
		//radiobuttons
		final JRadioButton rdbtnSimple = new JRadioButton("Simple");
		rdbtnSimple.setBounds(53, 67, 109, 23);
		contentPane.add(rdbtnSimple);
		
		final JRadioButton rdbtnCompuesta = new JRadioButton("Compuesta");
		rdbtnCompuesta.setBounds(53, 89, 109, 23);
		contentPane.add(rdbtnCompuesta);
		
		final JRadioButton rdbtnEnteros = new JRadioButton("Enteros");
		rdbtnEnteros.setBounds(172, 67, 109, 23);
		contentPane.add(rdbtnEnteros);
		
		final JRadioButton rdbtnDentados = new JRadioButton("Dentados");
		rdbtnDentados.setBounds(172, 89, 109, 23);
		contentPane.add(rdbtnDentados);
		
		final JRadioButton rdbtnAlterna = new JRadioButton("Alterna");
		rdbtnAlterna.setBounds(306, 67, 109, 23);
		contentPane.add(rdbtnAlterna);
		
		final JRadioButton rdbtnOpuesta = new JRadioButton("Opuesta");
		rdbtnOpuesta.setBounds(306, 89, 109, 23);
		contentPane.add(rdbtnOpuesta);
		
		final JRadioButton rdbtnEscaliforme = new JRadioButton("Escaleriforme");
		rdbtnEscaliforme.setBounds(434, 67, 109, 23);
		contentPane.add(rdbtnEscaliforme);
		
		final JRadioButton rdbtnPinnada = new JRadioButton("Pinnada");
		rdbtnPinnada.setBounds(434, 89, 109, 23);
		contentPane.add(rdbtnPinnada);
		
		final JRadioButton rdbtnTrinervada = new JRadioButton("Trinervada");
		rdbtnTrinervada.setBounds(434, 115, 109, 23);
		contentPane.add(rdbtnTrinervada);
		
		final JRadioButton rdbtnAlado = new JRadioButton("Alado");
		rdbtnAlado.setBounds(53, 179, 109, 23);
		contentPane.add(rdbtnAlado);
		
		final JRadioButton rdbtnBaya = new JRadioButton("Baya");
		rdbtnBaya.setBounds(172, 179, 109, 23);
		contentPane.add(rdbtnBaya);
		
		final JRadioButton rdbtnCapsula = new JRadioButton("Capsula");
		rdbtnCapsula.setBounds(306, 179, 109, 23);
		contentPane.add(rdbtnCapsula);
		
		final JRadioButton rdbtnDicarpos = new JRadioButton("Dicarpos");
		rdbtnDicarpos.setBounds(434, 179, 109, 23);
		contentPane.add(rdbtnDicarpos);
		
		final JRadioButton rdbtnDrupa = new JRadioButton("Drupa");
		rdbtnDrupa.setBounds(53, 205, 109, 23);
		contentPane.add(rdbtnDrupa);
		
		final JRadioButton rdbtnFoliculo = new JRadioButton("Foliculo");
		rdbtnFoliculo.setBounds(172, 205, 109, 23);
		contentPane.add(rdbtnFoliculo);
		
		final JRadioButton rdbtnFoliculos = new JRadioButton("Foliculos");
		rdbtnFoliculos.setBounds(306, 205, 109, 23);
		contentPane.add(rdbtnFoliculos);
		
		final JRadioButton rdbtnLegumbre = new JRadioButton("Legumbre");
		rdbtnLegumbre.setBounds(434, 205, 109, 23);
		contentPane.add(rdbtnLegumbre);
		
		final JRadioButton rdbtnMonocarpos = new JRadioButton("Monocarpos");
		rdbtnMonocarpos.setBounds(53, 231, 109, 23);
		contentPane.add(rdbtnMonocarpos);
		
		final JRadioButton rdbtnNuez = new JRadioButton("Nuez");
		rdbtnNuez.setBounds(172, 231, 109, 23);
		contentPane.add(rdbtnNuez);
		
		final JRadioButton rdbtnPixido = new JRadioButton("Pixidio");
		rdbtnPixido.setBounds(306, 231, 109, 23);
		contentPane.add(rdbtnPixido);
		
		final JRadioButton rdbtnSincarpos = new JRadioButton("Sincarpos");
		rdbtnSincarpos.setBounds(434, 231, 109, 23);
		contentPane.add(rdbtnSincarpos);
		
		final JRadioButton rdbtnEscamas = new JRadioButton("Escamas");
		rdbtnEscamas.setBounds(53, 297, 109, 23);
		contentPane.add(rdbtnEscamas);
		
		final JRadioButton rdbtnEspinas = new JRadioButton("Espinas");
		rdbtnEspinas.setBounds(172, 297, 109, 23);
		contentPane.add(rdbtnEspinas);
		
		final JRadioButton rdbtnEstipulas = new JRadioButton("Est\u00EDpulas");
		rdbtnEstipulas.setBounds(306, 297, 109, 23);
		contentPane.add(rdbtnEstipulas);
		
		final JRadioButton rdbtnGlandulas = new JRadioButton("Gl\u00E1ndulas");
		rdbtnGlandulas.setBounds(434, 297, 109, 23);
		contentPane.add(rdbtnGlandulas);
		
		final JRadioButton rdbtnPelos = new JRadioButton("Pelos");
		rdbtnPelos.setBounds(53, 323, 109, 23);
		contentPane.add(rdbtnPelos);
		
		final JRadioButton rdbtnSarcillos = new JRadioButton("Sarcillos");
		rdbtnSarcillos.setBounds(172, 323, 109, 23);
		contentPane.add(rdbtnSarcillos);
		
		final JRadioButton rdbtnSemilla = new JRadioButton("Semilla");
		rdbtnSemilla.setBounds(306, 323, 109, 23);
		contentPane.add(rdbtnSemilla);
		
		final JRadioButton rdbtnNervadura = new JRadioButton("Nervadura");
		rdbtnNervadura.setBounds(434, 323, 109, 23);
		contentPane.add(rdbtnNervadura);
		
		final JRadioButton rdbtnSaviaa = new JRadioButton("Savia");
		rdbtnSaviaa.setBounds(400, 355,100, 100);
		contentPane.add(rdbtnSaviaa);
		
		final JRadioButton rdbtnPuntosTranslucidos = new JRadioButton("Puntos");
		rdbtnPuntosTranslucidos.setBounds(55, 360, 109, 90);
		contentPane.add(rdbtnPuntosTranslucidos);
		
		final JRadioButton rdbtnSi = new JRadioButton("Si");
		rdbtnSi.setBounds(53, 457, 109, 23);
		contentPane.add(rdbtnSi);
		
		final JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setBounds(172, 457, 109, 23);
		contentPane.add(rdbtnNo);
		
		ButtonGroup tipohoja = new ButtonGroup();
		tipohoja.add(rdbtnSimple);
		tipohoja.add(rdbtnCompuesta);
		
		ButtonGroup tipoborde = new ButtonGroup();
		tipoborde.add(rdbtnEnteros);
		tipoborde.add(rdbtnDentados);
		
		ButtonGroup poshoja = new ButtonGroup();
		poshoja.add(rdbtnAlterna);
		poshoja.add(rdbtnOpuesta);
		
		ButtonGroup nervadurah = new ButtonGroup();
		nervadurah.add(rdbtnEscaliforme);
		nervadurah.add(rdbtnPinnada);
		nervadurah.add(rdbtnTrinervada);
		
		ButtonGroup frutop = new ButtonGroup();
		frutop.add(rdbtnAlado);
		frutop.add(rdbtnBaya);
		frutop.add(rdbtnCapsula);
		frutop.add(rdbtnDicarpos);
		frutop.add(rdbtnDrupa);
		frutop.add(rdbtnFoliculo);
		frutop.add(rdbtnFoliculos);
		frutop.add(rdbtnLegumbre);
		frutop.add(rdbtnMonocarpos);
		frutop.add(rdbtnNuez);
		frutop.add(rdbtnPixido);
		frutop.add(rdbtnSincarpos);
		
		ButtonGroup olorp = new ButtonGroup();
		olorp.add(rdbtnSi);
		olorp.add(rdbtnNo);
		
		
		//ok esta es la parte donde todo pasa, se asignan los valores a variables y demas, ahora bien
		//necesito ayuda con lo del objeto
		JButton btnIdentificar = new JButton("Identificar");
		btnIdentificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//tipo de hoja
				if(rdbtnSimple.isSelected() == true)
				{hoja.tipohoja  = "Simple";
				 //txtResultado.setText(thoja);
				}
				else if(rdbtnCompuesta.isSelected() == true)
				{hoja.tipohoja  = "Compuesta";
				//txtResultado.setText(thoja);
				}
				if(rdbtnEnteros.isSelected() == true)
				{hoja.tipoborde  ="Entero";
				}
				else if(rdbtnDentados.isSelected() == true)
				{hoja.tipoborde  = "Dentado";
				}
				if(rdbtnAlterna.isSelected() == true)
				{hoja.posicionhoja = "Alterna";
				}
				else if(rdbtnOpuesta.isSelected() == true)
				{hoja.posicionhoja  = "Opuesta";
				}
				if(rdbtnEscaliforme.isSelected() == true)
				{planta.nervadura   = "Escaleriforme"; 
				}
				else if(rdbtnPinnada.isSelected() == true)
				{planta.nervadura  = "Pinnada";
				}
				else if(rdbtnTrinervada.isSelected() == true)
				{planta.nervadura  = "Trinervada";
				}
				if(rdbtnAlado.isSelected() == true)
				{fruto.tipofruto  = "Alado";
				}
				else if(rdbtnBaya.isSelected() == true)
				{fruto.tipofruto  = "Baya";
				}
				else if(rdbtnCapsula.isSelected() == true)
				{fruto.tipofruto  = "Capsula";
				}
				else if(rdbtnDicarpos.isSelected() == true)
				{fruto.tipofruto  = "Dicarpos";
				}
				else if(rdbtnDrupa.isSelected() == true)
				{fruto.tipofruto  = "Drupa";
				}
				else if(rdbtnFoliculo.isSelected() == true)
				{fruto.tipofruto  = "Foliculo";
				}
				/*else if(rdbtnFoliculos.isSelected() == true)
				{fruto = "Foliculos";
				}*/
				else if(rdbtnLegumbre.isSelected() == true)
				{fruto.tipofruto  = "Legumbre";
				}
				else if(rdbtnMonocarpos.isSelected() == true)
				{fruto.tipofruto  = "Monocarpos";
				}
				else if(rdbtnNuez.isSelected() == true)
				{fruto.tipofruto  = "Nuez";
				}
				else if(rdbtnPixido.isSelected() == true)
				{fruto.tipofruto  = "Pixidio";
				}
				else if(rdbtnSincarpos.isSelected() == true)
				{fruto.tipofruto  = "Sincarpos";
				}
				/*if(rdbtnEscamas.isSelected() == true)
				{planta. = true;
				}*/
				if(rdbtnEspinas.isSelected() == true)
				{planta.espina  = true;
				}
				else if(rdbtnEstipulas.isSelected() == true)
				{planta.estipula  = true;
				}
				/*else if(rdbtnGlandulas.isSelected() == true)
				{planta. = true;
				}*/
				/*else if(rdbtnPelos.isSelected() == true)
				{planta. = true;
				}*/
				/*else if(rdbtnSarcillos.isSelected() == true)
				{planta. = true;
				}*/
				else if(rdbtnSemilla.isSelected() == true)
				{planta.semilla  = true;
				}
				/*else if(rdbtnNervadura.isSelected() == true)
				{nervaduraa = true;
				}*/
				/*else if(rdbtnSaviaa.isSelected() == true)
				{planta. = true;
				}*/
				else if(rdbtnPuntosTranslucidos.isSelected() == true)
				{planta.puntot  = true;
				}
				if(rdbtnSi.isSelected() == true)
				{planta.olor= true;
				//txtResultado.setText("Hoja: "+ thoja + ", Borde: " + tborde + ", Posicion: " + posicionh + ", Nervadura: " + nervadura + ", Fruto: " + fruto + " Tiene Olor");
			}
				else if( rdbtnNo.isSelected() == true)
				{planta.olor  = false;
				//txtResultado.setText("Hoja: "+ thoja + ", Borde: " + tborde + ", Posicion: " + posicionh + ", Nervadura: " + nervadura + ", Fruto: " + fruto + " NO Tiene Olor");
				}
			planta.hoja = hoja;
			planta.fruto = fruto;
			try {
				txtResultado.setText(Conocimiento.Identify(planta));
			} catch (OWLOntologyStorageException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			planta.espina = false;
			planta.nervadura = null;
			planta.estipula = false;
			planta.fruto = null;
			planta.hoja = null;
			planta.olor = false;
			planta.puntot = false;
			planta.semilla = false;
		    hoja.posicionhoja = null;
		    hoja.tipoborde = null;
		    hoja.tipohoja = null;
		    fruto.tipofruto =null;
			}
			
		
		});
		btnIdentificar.setBounds(20, 525, 109, 23);
		contentPane.add(btnIdentificar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(474, 612, 89, 23);
		contentPane.add(btnSalir);
	}

}
