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

public class VGestionProveedores extends barrademenu {

	private JPanel contentPane;
	private JTextField codprov;
	private JTextField nombreprov;
	private JTextField apellidoprov;
	private JTextField direccionprov;
	private JTextField comision;
	private JTextArea textArea;

	
	public VGestionProveedores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 635);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGestinDeProyectos = new JLabel("GESTI\u00D3N DE PROVEEDORES, By Nombre de alumno.");
		lblGestinDeProyectos.setBackground(Color.ORANGE);
		lblGestinDeProyectos.setForeground(new Color(128, 0, 0));
		lblGestinDeProyectos.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestinDeProyectos.setFont(new Font("Arial", Font.BOLD, 21));
		lblGestinDeProyectos.setBounds(21, 11, 638, 38);
		contentPane.add(lblGestinDeProyectos);
		
		JLabel lblCdigoDeProv = new JLabel("C\u00F3digo de Proveedor:");
		lblCdigoDeProv.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCdigoDeProv.setBounds(31, 60, 133, 19);
		contentPane.add(lblCdigoDeProv);
		
		codprov = new JTextField();
		codprov.setHorizontalAlignment(SwingConstants.CENTER);
		codprov.setFont(new Font("Tahoma", Font.BOLD, 11));
		codprov.setBackground(Color.ORANGE);
		codprov.setBounds(172, 60, 86, 20);
		contentPane.add(codprov);
		codprov.setColumns(10);
		
		JLabel labelNombre = new JLabel("Nombre del proveedor:");
		labelNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelNombre.setBounds(107, 103, 151, 19);
		contentPane.add(labelNombre);
		
		JLabel labelApellidos = new JLabel("Apellidos del proveedor:");
		labelApellidos.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelApellidos.setBounds(107, 132, 151, 19);
		contentPane.add(labelApellidos);
		
		JLabel labelDireccion = new JLabel("Direcci\u00F3n del proveedor:");
		labelDireccion.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelDireccion.setBounds(107, 162, 170, 19);
		contentPane.add(labelDireccion);
		
		JLabel lblComision = new JLabel("Comisi\u00F3n del proveedor:");
		lblComision.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblComision.setBounds(107, 192, 170, 19);
		contentPane.add(lblComision);
		
		nombreprov = new JTextField();
		nombreprov.setHorizontalAlignment(SwingConstants.CENTER);
		nombreprov.setFont(new Font("Tahoma", Font.BOLD, 11));
		nombreprov.setColumns(10);
		nombreprov.setBackground(Color.ORANGE);
		nombreprov.setBounds(278, 102, 268, 20);
		contentPane.add(nombreprov);
		
		apellidoprov = new JTextField();
		apellidoprov.setHorizontalAlignment(SwingConstants.CENTER);
		apellidoprov.setFont(new Font("Tahoma", Font.BOLD, 11));
		apellidoprov.setColumns(10);
		apellidoprov.setBackground(Color.ORANGE);
		apellidoprov.setBounds(288, 131, 268, 20);
		contentPane.add(apellidoprov);
		
		direccionprov = new JTextField();
		direccionprov.setHorizontalAlignment(SwingConstants.CENTER);
		direccionprov.setFont(new Font("Tahoma", Font.BOLD, 11));
		direccionprov.setColumns(10);
		direccionprov.setBackground(Color.ORANGE);
		direccionprov.setBounds(272, 161, 274, 20);
		contentPane.add(direccionprov);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConsultar.setBounds(268, 58, 89, 23);
		contentPane.add(btnConsultar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnModificar.setBounds(419, 293, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBorrar.setBounds(307, 293, 89, 23);
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
		btnInsertarRegistro.setBounds(23, 292, 136, 23);
		contentPane.add(btnInsertarRegistro);
		
		JButton btnVisualizarTodos = new JButton("Visualizar Todos");
		btnVisualizarTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					operacionesProveedores op = new operacionesProveedores();
					op.listarproveedores(textArea);
			}
		});
		btnVisualizarTodos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVisualizarTodos.setBounds(531, 293, 145, 23);
		contentPane.add(btnVisualizarTodos);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLimpiar.setBounds(188, 293, 89, 23);
		contentPane.add(btnLimpiar);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 182, 193));
		separator.setBackground(new Color(255, 182, 193));
		separator.setBounds(21, 90, 597, 10);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 128));
		separator_1.setBounds(21, 231, 666, 2);
		contentPane.add(separator_1);
		
		comision = new JTextField();
		comision.setHorizontalAlignment(SwingConstants.CENTER);
		comision.setFont(new Font("Tahoma", Font.BOLD, 11));
		comision.setColumns(10);
		comision.setBackground(Color.ORANGE);
		comision.setBounds(278, 192, 133, 20);
		contentPane.add(comision);
		
		JLabel mensaje = new JLabel("-----------------------------------------------------------------------------------------------------");
		mensaje.setHorizontalAlignment(SwingConstants.CENTER);
		mensaje.setForeground(Color.RED);
		mensaje.setFont(new Font("Tahoma", Font.BOLD, 11));
		mensaje.setBackground(new Color(34, 139, 34));
		mensaje.setBounds(49, 239, 627, 29);
		contentPane.add(mensaje);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(0, 0, 128));
		separator_2.setBounds(21, 279, 666, 2);
		contentPane.add(separator_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(21, 327, 674, 238);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		textArea.setForeground(new Color(0, 0, 0));
		textArea.setBackground(SystemColor.activeCaption);
	}
}
