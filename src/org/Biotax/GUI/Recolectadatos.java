package org.Biotax.GUI;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Panel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import java.awt.Font;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JButton;
import javax.swing.JTextPane;


public class Recolectadatos {

	public JFrame frmBiotax;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the application.
	 */
	public Recolectadatos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBiotax = new JFrame();
		frmBiotax.setTitle("Biotax");
		frmBiotax.setBounds(100, 100, 557, 567);
		frmBiotax.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBiotax.getContentPane().setLayout(null);
		
		JLabel lbldescripcion = new JLabel("Descripci\u00F3n del espec\u00EDmen");
		lbldescripcion.setFont(new Font("Dialog", Font.BOLD, 13));
		lbldescripcion.setBounds(10, 11, 177, 14);
		frmBiotax.getContentPane().add(lbldescripcion);
		
		JLabel lblhoja = new JLabel("Hoja");
		lblhoja.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		lblhoja.setBounds(32, 36, 46, 14);
		frmBiotax.getContentPane().add(lblhoja);
		
		JComboBox cmbTipohoja = new JComboBox();
		cmbTipohoja.setForeground(Color.BLACK);
		cmbTipohoja.setModel(new DefaultComboBoxModel(new String[] {"Simple", "Compuesta"}));
		cmbTipohoja.setToolTipText("");
		cmbTipohoja.setFont(new Font("Dialog", Font.PLAIN, 11));
		cmbTipohoja.setBackground(Color.WHITE);
		cmbTipohoja.setBounds(117, 63, 89, 20);
		frmBiotax.getContentPane().add(cmbTipohoja);
		
		JLabel lblTipohoja = new JLabel("Tipo: ");
		lblTipohoja.setFont(new Font("Dialog", Font.BOLD, 11));
		lblTipohoja.setBounds(32, 66, 46, 14);
		frmBiotax.getContentPane().add(lblTipohoja);
		
		JLabel lblNervadurahoja = new JLabel("Nervadura: ");
		lblNervadurahoja.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNervadurahoja.setBounds(32, 91, 62, 14);
		frmBiotax.getContentPane().add(lblNervadurahoja);
		
		JLabel lblPosicionhoja = new JLabel("Posici\u00F3n:");
		lblPosicionhoja.setFont(new Font("Dialog", Font.BOLD, 11));
		lblPosicionhoja.setBounds(32, 116, 62, 14);
		frmBiotax.getContentPane().add(lblPosicionhoja);
		
		JLabel lblBordehoja = new JLabel("Borde:");
		lblBordehoja.setFont(new Font("Dialog", Font.BOLD, 11));
		lblBordehoja.setBounds(32, 141, 46, 14);
		frmBiotax.getContentPane().add(lblBordehoja);
		
		JComboBox cmbNervadurahoja = new JComboBox();
		cmbNervadurahoja.setBackground(Color.WHITE);
		cmbNervadurahoja.setModel(new DefaultComboBoxModel(new String[] {"Ninguno","Escaliforme", "Pinnada", "Trinervada", "Desconocido"}));
		cmbNervadurahoja.setFont(new Font("Dialog", Font.PLAIN, 11));
		cmbNervadurahoja.setBounds(117, 89, 89, 20);
		frmBiotax.getContentPane().add(cmbNervadurahoja);
		
		JComboBox cmbPosicionhoja = new JComboBox();
		cmbPosicionhoja.setBackground(Color.WHITE);
		cmbPosicionhoja.setModel(new DefaultComboBoxModel(new String[] {"No Se", "Alterna", "Opuesta", "Desconocido"}));
		cmbPosicionhoja.setFont(new Font("Dialog", Font.PLAIN, 11));
		cmbPosicionhoja.setBounds(117, 114, 89, 20);
		frmBiotax.getContentPane().add(cmbPosicionhoja);
		
		JComboBox cmbBordehoja = new JComboBox();
		cmbBordehoja.setBackground(Color.WHITE);
		cmbBordehoja.setModel(new DefaultComboBoxModel(new String[] {"Enteros", "Dentados", "Desconocido"}));
		cmbBordehoja.setFont(new Font("Dialog", Font.PLAIN, 11));
		cmbBordehoja.setBounds(117, 139, 89, 20);
		frmBiotax.getContentPane().add(cmbBordehoja);
		
		JLabel lblOlor = new JLabel("Olor");
		lblOlor.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		lblOlor.setBounds(32, 189, 46, 14);
		frmBiotax.getContentPane().add(lblOlor);
		
		JRadioButton rdbtnOlorsi = new JRadioButton("Si");
		rdbtnOlorsi.setBounds(43, 210, 35, 23);
		frmBiotax.getContentPane().add(rdbtnOlorsi);
		rdbtnOlorsi.setFont(new Font("Dialog", Font.BOLD, 11));
		
		JRadioButton rdbtnOlorno = new JRadioButton("No");
		rdbtnOlorno.setBounds(43, 235, 39, 23);
		frmBiotax.getContentPane().add(rdbtnOlorno);
		rdbtnOlorno.setFont(new Font("Dialog", Font.BOLD, 11));
		
		JLabel lblFruto = new JLabel("Fruto");
		lblFruto.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		lblFruto.setBounds(273, 36, 46, 14);
		frmBiotax.getContentPane().add(lblFruto);
		
		JLabel lblTipofruto = new JLabel("Tipo:");
		lblTipofruto.setFont(new Font("Dialog", Font.BOLD, 11));
		lblTipofruto.setBounds(273, 67, 46, 14);
		frmBiotax.getContentPane().add(lblTipofruto);
		
		JComboBox cmbFrutotipo = new JComboBox();
		cmbFrutotipo.setModel(new DefaultComboBoxModel(new String[] {"Ninguno", "Alado", "Baya", "Capsula", "Dicarpos", "Dupra", "Foliculo", "Foliculos", "Legumbre", "Monocarpos", "Nuez", "Pixido", "Sincarpos", "Desconocido"}));
		cmbFrutotipo.setBackground(Color.WHITE);
		cmbFrutotipo.setFont(new Font("Dialog", Font.PLAIN, 11));
		cmbFrutotipo.setToolTipText("");
		cmbFrutotipo.setBounds(329, 64, 104, 20);
		frmBiotax.getContentPane().add(cmbFrutotipo);
		
		JLabel lblestructacce = new JLabel("Estructura accesoria");
		lblestructacce.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		lblestructacce.setBounds(273, 117, 141, 14);
		frmBiotax.getContentPane().add(lblestructacce);
		
		JCheckBoxMenuItem chckbxEaescamas = new JCheckBoxMenuItem("Escamas");
		chckbxEaescamas.setFont(new Font("Dialog", Font.PLAIN, 11));
		chckbxEaescamas.setBackground(Color.WHITE);
		chckbxEaescamas.setBounds(273, 141, 129, 22);
		frmBiotax.getContentPane().add(chckbxEaescamas);
		
		JCheckBoxMenuItem chckbxEaEspinas = new JCheckBoxMenuItem("Espinas");
		chckbxEaEspinas.setBackground(Color.WHITE);
		chckbxEaEspinas.setFont(new Font("Dialog", Font.PLAIN, 11));
		chckbxEaEspinas.setBounds(273, 174, 129, 22);
		frmBiotax.getContentPane().add(chckbxEaEspinas);
		
		JCheckBoxMenuItem chckbxmntmEaestpulas = new JCheckBoxMenuItem("Est\u00EDpulas");
		chckbxmntmEaestpulas.setBackground(Color.WHITE);
		chckbxmntmEaestpulas.setFont(new Font("Dialog", Font.PLAIN, 11));
		chckbxmntmEaestpulas.setBounds(273, 210, 129, 22);
		frmBiotax.getContentPane().add(chckbxmntmEaestpulas);
		
		JCheckBoxMenuItem chckbxmntmEaglandulas = new JCheckBoxMenuItem("Gl\u00E1ndulas");
		chckbxmntmEaglandulas.setFont(new Font("Dialog", Font.PLAIN, 11));
		chckbxmntmEaglandulas.setBackground(Color.WHITE);
		chckbxmntmEaglandulas.setBounds(273, 243, 129, 22);
		frmBiotax.getContentPane().add(chckbxmntmEaglandulas);
		
		JCheckBoxMenuItem chckbxmntmEapelos = new JCheckBoxMenuItem("Pelos");
		chckbxmntmEapelos.setBackground(Color.WHITE);
		chckbxmntmEapelos.setFont(new Font("Dialog", Font.PLAIN, 11));
		chckbxmntmEapelos.setBounds(395, 243, 129, 22);
		frmBiotax.getContentPane().add(chckbxmntmEapelos);
		
		JCheckBoxMenuItem chckbxmntmEasemilla = new JCheckBoxMenuItem("Semilla");
		chckbxmntmEasemilla.setBackground(Color.WHITE);
		chckbxmntmEasemilla.setFont(new Font("Dialog", Font.PLAIN, 11));
		chckbxmntmEasemilla.setBounds(395, 141, 129, 22);
		frmBiotax.getContentPane().add(chckbxmntmEasemilla);
		
		JCheckBoxMenuItem chckbxmntmEaervadura = new JCheckBoxMenuItem("Nervadura");
		chckbxmntmEaervadura.setBackground(Color.WHITE);
		chckbxmntmEaervadura.setFont(new Font("Dialog", Font.PLAIN, 11));
		chckbxmntmEaervadura.setBounds(395, 174, 129, 22);
		frmBiotax.getContentPane().add(chckbxmntmEaervadura);
		
		JCheckBoxMenuItem chckbxmntmEaSarcillos = new JCheckBoxMenuItem("Sarcillos");
		chckbxmntmEaSarcillos.setBackground(Color.WHITE);
		chckbxmntmEaSarcillos.setFont(new Font("Dialog", Font.PLAIN, 11));
		chckbxmntmEaSarcillos.setBounds(395, 211, 129, 22);
		frmBiotax.getContentPane().add(chckbxmntmEaSarcillos);
		
		JCheckBoxMenuItem chckbxmntmEapuntost = new JCheckBoxMenuItem("Puntos transl\u00FAcidos");
		chckbxmntmEapuntost.setBackground(Color.WHITE);
		chckbxmntmEapuntost.setFont(new Font("Dialog", Font.PLAIN, 11));
		chckbxmntmEapuntost.setBounds(273, 276, 141, 22);
		frmBiotax.getContentPane().add(chckbxmntmEapuntost);
		
		JLabel lblSavia = new JLabel("Savia:");
		lblSavia.setBackground(Color.WHITE);
		lblSavia.setFont(new Font("Dialog", Font.PLAIN, 11));
		lblSavia.setBounds(306, 309, 46, 14);
		frmBiotax.getContentPane().add(lblSavia);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Dialog", Font.PLAIN, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"No", "Incolora", "Amarilla", "Anaranjada", "Blanca", "Roja"}));
		comboBox.setBounds(395, 307, 106, 20);
		frmBiotax.getContentPane().add(comboBox);
		
		JButton btnIdentificar = new JButton("Identificar");
		btnIdentificar.setFont(new Font("Dialog", Font.BOLD, 12));
		btnIdentificar.setBounds(395, 353, 104, 23);
		frmBiotax.getContentPane().add(btnIdentificar);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Dialog", Font.BOLD, 13));
		lblResultado.setBounds(10, 412, 68, 14);
		frmBiotax.getContentPane().add(lblResultado);
		
		JTextPane txtResultado = new JTextPane();
		txtResultado.setEditable(false);
		txtResultado.setFont(new Font("Dialog", Font.PLAIN, 12));
		txtResultado.setBounds(32, 451, 273, 20);
		frmBiotax.getContentPane().add(txtResultado);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Dialog", Font.BOLD, 12));
		btnSalir.setBounds(412, 490, 89, 23);
		frmBiotax.getContentPane().add(btnSalir);
	}
}
