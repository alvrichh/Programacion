package Ventanas;
import operaciones.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class VGestionProyectos extends barrademenu {

	private JPanel contentPane;
	private JTextField codproy;
	private JTextField nombreproy;
	private JTextField ciudadproy;
	private JTextField presupuestoproy;
	private JTextArea textArea;
	private JComboBox comboZona = new JComboBox();	
	private operacionesProyectos op = new operacionesProyectos();
	
	public VGestionProyectos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 605);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGestinDeProyectos = new JLabel("GESTI\u00D3N DE PROYECTOS, By Nombre de alumno.");
		lblGestinDeProyectos.setBackground(Color.ORANGE);
		lblGestinDeProyectos.setForeground(Color.BLUE);
		lblGestinDeProyectos.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestinDeProyectos.setFont(new Font("Arial", Font.BOLD, 21));
		lblGestinDeProyectos.setBounds(21, 11, 638, 38);
		contentPane.add(lblGestinDeProyectos);
		
		JLabel lblCdigoDeProyecto = new JLabel("C\u00F3digo de proyecto:");
		lblCdigoDeProyecto.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCdigoDeProyecto.setBounds(42, 60, 122, 19);
		contentPane.add(lblCdigoDeProyecto);
		
		codproy = new JTextField();
		codproy.setHorizontalAlignment(SwingConstants.CENTER);
		codproy.setFont(new Font("Tahoma", Font.BOLD, 11));
		codproy.setBackground(Color.ORANGE);
		codproy.setBounds(172, 60, 86, 20);
		contentPane.add(codproy);
		codproy.setColumns(10);
		
		JLabel labelNombre = new JLabel("Nombre del proyecto:");
		labelNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelNombre.setBounds(107, 103, 127, 19);
		contentPane.add(labelNombre);
		
		JLabel labelCiudad = new JLabel("Ciudad del proyecto:");
		labelCiudad.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelCiudad.setBounds(107, 132, 127, 19);
		contentPane.add(labelCiudad);
		
		JLabel labelPresu = new JLabel("Presupuesto del proyecto:");
		labelPresu.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelPresu.setBounds(107, 162, 170, 19);
		contentPane.add(labelPresu);
		
		JLabel lblSeleccionaLaZona = new JLabel("Selecciona la zona:");
		lblSeleccionaLaZona.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSeleccionaLaZona.setBounds(107, 192, 127, 19);
		contentPane.add(lblSeleccionaLaZona);
		
		nombreproy = new JTextField();
		nombreproy.setHorizontalAlignment(SwingConstants.CENTER);
		nombreproy.setFont(new Font("Tahoma", Font.BOLD, 11));
		nombreproy.setColumns(10);
		nombreproy.setBackground(Color.ORANGE);
		nombreproy.setBounds(237, 105, 268, 20);
		contentPane.add(nombreproy);
		
		ciudadproy = new JTextField();
		ciudadproy.setHorizontalAlignment(SwingConstants.CENTER);
		ciudadproy.setFont(new Font("Tahoma", Font.BOLD, 11));
		ciudadproy.setColumns(10);
		ciudadproy.setBackground(Color.ORANGE);
		ciudadproy.setBounds(237, 131, 268, 20);
		contentPane.add(ciudadproy);
		
		presupuestoproy = new JTextField();
		presupuestoproy.setHorizontalAlignment(SwingConstants.CENTER);
		presupuestoproy.setFont(new Font("Tahoma", Font.BOLD, 11));
		presupuestoproy.setColumns(10);
		presupuestoproy.setBackground(Color.ORANGE);
		presupuestoproy.setBounds(272, 161, 122, 20);
		contentPane.add(presupuestoproy);
		
	
		comboZona.setBackground(Color.YELLOW);
		comboZona.setBounds(244, 192, 157, 20);
		contentPane.add(comboZona);
		
		// cargar los combos
		
		op.cargarzonas(comboZona);
				
				
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConsultar.setBounds(268, 58, 89, 23);
		contentPane.add(btnConsultar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnModificar.setBounds(393, 276, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBorrar.setBounds(280, 276, 89, 23);
		contentPane.add(btnBorrar);
		
		JButton btnSiguiente = new JButton("Ver Siguiente");
		btnSiguiente.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSiguiente.setBounds(367, 58, 122, 23);
		contentPane.add(btnSiguiente);
		
		JButton btnAnterior = new JButton("Ver Anterior");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnterior.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnterior.setBounds(495, 58, 106, 23);
		contentPane.add(btnAnterior);
		
		JButton btnInsertarRegistro = new JButton("Insertar Registro");
		btnInsertarRegistro.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnInsertarRegistro.setBounds(42, 275, 136, 23);
		contentPane.add(btnInsertarRegistro);
		
		JButton btnVisualizarTodos = new JButton("Visualizar Todos");
		btnVisualizarTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				op.listarproyectos(textArea);
			}
		});
		btnVisualizarTodos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVisualizarTodos.setBounds(492, 276, 145, 23);
		contentPane.add(btnVisualizarTodos);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLimpiar.setBounds(184, 276, 89, 23);
		contentPane.add(btnLimpiar);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 182, 193));
		separator.setBackground(new Color(255, 182, 193));
		separator.setBounds(21, 90, 597, 10);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 128));
		separator_1.setBounds(22, 222, 666, 2);
		contentPane.add(separator_1);
		
		JLabel label = new JLabel("-----------------------------------------------------------------------------------------------------");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBackground(new Color(34, 139, 34));
		label.setBounds(42, 235, 627, 29);
		contentPane.add(label);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(0, 0, 128));
		separator_2.setBounds(22, 262, 666, 2);
		contentPane.add(separator_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 310, 667, 225);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		textArea.setBackground(new Color(204, 255, 153));
	}
}
