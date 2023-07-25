package unico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

public class AlvaroRodriguez extends JFrame {

	private JPanel contentPane;
	private JTextField Nombre;
	private JTextField Local;
	private JTextField Cod;
	private JButton btnInsertarDatos;
	private JButton btnLimpiarDatos;
	private JPanel panel;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton gestion;
	private JRadioButton personal;
	private JRadioButton apoyo;
	private JRadioButton tecnologico;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlvaroRodriguez frame = new AlvaroRodriguez();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AlvaroRodriguez() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel = new JPanel();
		panel.setBounds(60, 10, 314, 237);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel id_departamento = new JLabel("DATOS DE DEPARTAMENTO");
		id_departamento.setBounds(81, 10, 166, 16);
		panel.add(id_departamento);

		JLabel lblCodigo = new JLabel("C\u00F3digo Departamento:");
		lblCodigo.setBounds(10, 50, 138, 16);
		panel.add(lblCodigo);

		JLabel lblNombre = new JLabel("Nombre Departamento:");
		lblNombre.setBounds(10, 76, 138, 16);
		panel.add(lblNombre);

		JLabel lblLocalidad = new JLabel("Localidad Departamento:");
		lblLocalidad.setBounds(10, 102, 148, 16);
		panel.add(lblLocalidad);

		Nombre = new JTextField();
		Nombre.setBounds(158, 74, 146, 20);
		panel.add(Nombre);
		Nombre.setColumns(10);

		Local = new JTextField();
		Local.setColumns(10);
		Local.setBounds(158, 100, 146, 20);
		panel.add(Local);

		Cod = new JTextField();
		Cod.setBackground(new Color(128, 128, 128));
		Cod.setForeground(new Color(0, 0, 0));
		Cod.setColumns(10);
		Cod.setBounds(158, 48, 53, 20);
		panel.add(Cod);

		JLabel lblPais = new JLabel("Selecciona el pa\u00EDs:");
		lblPais.setBounds(28, 144, 148, 16);
		panel.add(lblPais);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Espa\u00F1a", "Italia", "Portugal", "Alemania" }));
		comboBox.setBounds(158, 140, 82, 25);
		panel.add(comboBox);

		btnInsertarDatos = new JButton("Insertar Datos");
		btnInsertarDatos.setBounds(34, 187, 114, 26);
		panel.add(btnInsertarDatos);

		btnLimpiarDatos = new JButton("Limpiar Datos");
		btnLimpiarDatos.setBounds(168, 187, 114, 26);
		panel.add(btnLimpiarDatos);
		btnLimpiarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("SE HA PULSADO EL BOTÓN LIMPIAR");
				// LIMPIAR
				Cod.setText("");
				Nombre.setText("");
				Local.setText("");

			}
		});
		btnInsertarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("SE HA PULSADO EL BOTÓN INSERTAR");
				// INSERTAR
				System.out.println("Cod Tecleado: " + Cod.getText());
				System.out.println("Nombre Tecleado: " + Nombre.getText());
				System.out.println("Localidad Tecleado: " + Local.getText());

			}
		});

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 250, 314, 112);
		contentPane.add(scrollPane);

		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		textArea.setText(""); // Limpio el textárea
		textArea.setText("Primera línea.");// asigno contenido

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(60, 368, 314, 146);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		gestion = new JRadioButton("Gesti\u00F3n");
		gestion.setBounds(95, 30, 70, 24);
		panel_1.add(gestion);

		personal = new JRadioButton("Personal");
		// añadidos al grupo
		personal.setBounds(95, 58, 101, 24);
		panel_1.add(personal);

		apoyo = new JRadioButton("Apoyo");
		apoyo.setBounds(95, 86, 70, 24);
		panel_1.add(apoyo);

		tecnologico = new JRadioButton("Tecnol\u00F3gico");
		tecnologico.setBounds(95, 114, 101, 24);
		panel_1.add(tecnologico);

		JLabel lblcheckers = new JLabel("Tipo de departamento:");
		lblcheckers.setBounds(85, 6, 148, 16);
		panel_1.add(lblcheckers);

		JRadioButton check = new JRadioButton("Check");
		check.setBounds(236, 114, 70, 24);
		panel_1.add(check);
		textArea.append("\nEsta es la segunda linea");
		textArea.append("\nEsta es la siguiente");

		buttonGroup.add(gestion);
		buttonGroup.add(personal);
		buttonGroup.add(apoyo);
		buttonGroup.add(tecnologico);

		ButtonModel gest = gestion.getModel();
		ButtonModel pers = personal.getModel();
		ButtonModel apo = apoyo.getModel();
		ButtonModel tecno = tecnologico.getModel();

		if (buttonGroup.getSelection() != null) {
			if (buttonGroup.getSelection().equals(gest))
				System.out.println("Pulsaste gestion ");
			if (buttonGroup.getSelection().equals(pers))
				System.out.println("Pulsaste personal ");
			if (buttonGroup.getSelection().equals(apo))
				System.out.println("Pulsaste apoyo ");
			if (buttonGroup.getSelection().equals(tecno))
				System.out.println("Pulsaste tecnologia ");
		}
		if (check.isSelected()) {
			System.out.println("Check pulsado:  " + check.getText());
		}

	}
}
