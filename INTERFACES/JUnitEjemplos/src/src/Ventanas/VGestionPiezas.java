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
import javax.swing.border.LineBorder;
import javax.swing.JScrollBar;

import datos.Piezas;

import java.awt.TextArea;

public class VGestionPiezas extends barrademenu {

	private JPanel contentPane;
	private JLabel lblGestinDePiezas;
	private JLabel lblCdigoDepieza;
	private JLabel labelNombre;
	private JLabel labelprecio;
	private JLabel labelDescripcion;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnBorrar;
	private JButton btnSiguiente;
	private JButton btnAnterior;
	private JButton btnInsertarRegistro;
	private JButton btnVisualizarTodos;
	private JButton btnLimpiar;
	private JLabel mensaje;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JTextField stock;
	private JTextField codpieza;
	private JTextField nombrepieza;
	private JTextField preciopieza;
	private JTextField descripcionpieza;

	
	public VGestionPiezas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 606);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblGestinDePiezas = new JLabel("GESTI\u00D3N DE PIEZAS, By Nombre de alumno.");
		lblGestinDePiezas.setBackground(Color.ORANGE);
		lblGestinDePiezas.setForeground(new Color(139, 0, 139));
		lblGestinDePiezas.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestinDePiezas.setFont(new Font("Arial", Font.BOLD, 21));
		lblGestinDePiezas.setBounds(21, 11, 638, 38);
		contentPane.add(lblGestinDePiezas);
		
		lblCdigoDepieza = new JLabel("C\u00F3digo de Pieza: ");
		lblCdigoDepieza.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCdigoDepieza.setBounds(58, 60, 106, 19);
		contentPane.add(lblCdigoDepieza);
		
		codpieza = new JTextField();
		codpieza.setHorizontalAlignment(SwingConstants.CENTER);
		codpieza.setFont(new Font("Tahoma", Font.BOLD, 11));
		codpieza.setBackground(Color.ORANGE);
		codpieza.setBounds(172, 60, 86, 20);
		contentPane.add(codpieza);
		codpieza.setColumns(10);
		
		labelNombre = new JLabel("Nombre de la pieza:");
		labelNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelNombre.setBounds(58, 108, 122, 19);
		contentPane.add(labelNombre);
		
		labelprecio = new JLabel("Precio de la pieza:");
		labelprecio.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelprecio.setBounds(58, 137, 122, 19);
		contentPane.add(labelprecio);
		
		labelDescripcion = new JLabel("Descripci\u00F3n de la pieza:");
		labelDescripcion.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelDescripcion.setBounds(58, 167, 170, 19);
		contentPane.add(labelDescripcion);
		
		nombrepieza = new JTextField();
		nombrepieza.setHorizontalAlignment(SwingConstants.CENTER);
		nombrepieza.setFont(new Font("Tahoma", Font.BOLD, 11));
		nombrepieza.setColumns(10);
		nombrepieza.setBackground(Color.ORANGE);
		nombrepieza.setBounds(209, 107, 228, 20);
		contentPane.add(nombrepieza);
		
		preciopieza = new JTextField();
		preciopieza.setHorizontalAlignment(SwingConstants.CENTER);
		preciopieza.setFont(new Font("Tahoma", Font.BOLD, 11));
		preciopieza.setColumns(10);
		preciopieza.setBackground(Color.ORANGE);
		preciopieza.setBounds(209, 136, 122, 20);
		contentPane.add(preciopieza);
		
		descripcionpieza = new JTextField();
		descripcionpieza.setHorizontalAlignment(SwingConstants.CENTER);
		descripcionpieza.setFont(new Font("Tahoma", Font.BOLD, 11));
		descripcionpieza.setColumns(10);
		descripcionpieza.setBackground(Color.ORANGE);
		descripcionpieza.setBounds(209, 166, 460, 20);
		contentPane.add(descripcionpieza);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				operacionesPiezas op = new operacionesPiezas();
				op.consultarpieza(codpieza,nombrepieza,preciopieza,descripcionpieza,stock,mensaje);
							
			}
		});
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConsultar.setBounds(268, 58, 89, 23);
		contentPane.add(btnConsultar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnModificar.setBounds(396, 288, 89, 23);
		contentPane.add(btnModificar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				operacionesPiezas op = new operacionesPiezas();
				op.borrarpieza(codpieza,nombrepieza,preciopieza,descripcionpieza,stock,mensaje);
			}
		});
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBorrar.setBounds(283, 288, 89, 23);
		contentPane.add(btnBorrar);
		
		btnSiguiente = new JButton("Ver Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Ver siguiente
				operacionesPiezas op = new operacionesPiezas();
				op.versiguientepieza(codpieza,nombrepieza,preciopieza,descripcionpieza,stock,mensaje);
				
			}
		});
		btnSiguiente.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSiguiente.setBounds(367, 58, 122, 23);
		contentPane.add(btnSiguiente);
		
		btnAnterior = new JButton("Ver Anterior");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacionesPiezas op = new operacionesPiezas();
				op.veranterior(codpieza,nombrepieza,preciopieza,descripcionpieza,stock,mensaje);
				
			}
		});
		btnAnterior.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnterior.setBounds(495, 58, 106, 23);
		contentPane.add(btnAnterior);
		
		btnInsertarRegistro = new JButton("Insertar Registro");
		btnInsertarRegistro.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnInsertarRegistro.setBounds(45, 287, 136, 23);
		contentPane.add(btnInsertarRegistro);
		
		btnVisualizarTodos = new JButton("Visualizar Todos");
		btnVisualizarTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacionesPiezas op = new operacionesPiezas();
				op.listarpiezas(textArea);
			}
		});
		btnVisualizarTodos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVisualizarTodos.setBounds(495, 288, 145, 23);
		contentPane.add(btnVisualizarTodos);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codpieza.setText(" ");
				nombrepieza.setText(" ") ;
				preciopieza.setText(" ");
				descripcionpieza.setText(" ");
				stock.setText(" ");
			}
		});
		btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLimpiar.setBounds(187, 288, 89, 23);
		contentPane.add(btnLimpiar);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 182, 193));
		separator.setBackground(new Color(255, 182, 193));
		separator.setBounds(21, 90, 597, 10);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 128));
		separator_1.setBounds(21, 227, 666, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(0, 0, 128));
		separator_2.setBounds(21, 274, 666, 2);
		contentPane.add(separator_2);
		
		mensaje = new JLabel("-----------------------------------------------------------------------------------------------------");
		mensaje.setHorizontalAlignment(SwingConstants.CENTER);
		mensaje.setForeground(Color.RED);
		mensaje.setFont(new Font("Tahoma", Font.BOLD, 11));
		mensaje.setBackground(new Color(34, 139, 34));
		mensaje.setBounds(32, 240, 627, 29);
		contentPane.add(mensaje);
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 322, 696, 216);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setForeground(new Color(0, 0, 128));
		textArea.setBackground(new Color(255, 218, 185));
		scrollPane.setViewportView(textArea);
		
		JLabel labelStock = new JLabel("Cantidad en stock:");
		labelStock.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelStock.setBounds(58, 197, 122, 19);
		contentPane.add(labelStock);
		
		stock = new JTextField();
		stock.setHorizontalAlignment(SwingConstants.CENTER);
		stock.setFont(new Font("Tahoma", Font.BOLD, 11));
		stock.setColumns(10);
		stock.setBackground(Color.ORANGE);
		stock.setBounds(209, 197, 122, 20);
		contentPane.add(stock);
		
		
	
	}
}
