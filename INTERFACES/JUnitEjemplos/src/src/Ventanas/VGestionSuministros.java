package Ventanas;

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

import datos.*;
import operaciones.*;

public class VGestionSuministros extends barrademenu {

	private JPanel contentPane;
	private JTextField nombreprov;
	private JTextField nombreproyec;
	private JTextField nombrepieza;
	private JTextArea textArea;
	private JComboBox comboProveedor;
	private JComboBox comboProyecto;
	private JComboBox comboPiezas;
	private JLabel Mensaje=	new JLabel("-----------------------------------------------------------------------------------------------------");
	private String linea ="----------------------------------------------------------------------------";
	
	private JTextField pvppieza;
	private JTextField Importe=	new JTextField();
	private operacionesSuministros op = new operacionesSuministros();
	
	JLabel labelProv = new JLabel("C\u00F3digo de Proveedor:");
	JLabel labelProyect = new JLabel("C\u00F3digo de Proyecto:");
	JLabel lblCdigoDepieza = new JLabel("C\u00F3digo de Pieza: ");
	private JTextField cantidad=new JTextField();
	
	public VGestionSuministros() {
		
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 728, 648);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		JLabel lblGestinDePiezas = new JLabel("GESTI\u00D3N DE SUMINISTROS, By Nombre de alumno.");
		lblGestinDePiezas.setBackground(Color.ORANGE);
		lblGestinDePiezas.setForeground(new Color(0, 128, 0));
		lblGestinDePiezas.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestinDePiezas.setFont(new Font("Bodoni MT", Font.BOLD, 24));
		lblGestinDePiezas.setBounds(21, 11, 638, 38);
		contentPane.add(lblGestinDePiezas);
		
	
		lblCdigoDepieza.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCdigoDepieza.setBounds(53, 131, 106, 19);
		contentPane.add(lblCdigoDepieza);
		
		JButton btnCalcular = new JButton("Calcular Importe");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// cantidad importe pvppieza
			Mensaje.setText(linea);	
			try {
				int cant = Integer.parseInt(cantidad.getText());
				if (cant >99999 || cant <0)
				{
					Mensaje.setText("Error, el importe debe estar entre 0 y 99999.");		
				    Importe.setText("00000");
				}
				else
				{		
				   float importe=cant * (Float.parseFloat(pvppieza.getText()));
				   Importe.setText(String.valueOf(importe));
		    	}
			
			}
             catch(java.lang.NumberFormatException ex){
               	Mensaje.setText("Error con el formato de cantidad, debe ser un entero positivo de 5 posiciones.");
			}
			}
		}
	   );
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCalcular.setBounds(287, 166, 148, 23);
		contentPane.add(btnCalcular);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnModificar.setBounds(377, 293, 89, 23);
		contentPane.add(btnModificar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBorrar.setBounds(264, 293, 89, 23);
		contentPane.add(btnBorrar);
		
		JButton btnInsertarRegistro = new JButton("Insertar Registro");
		btnInsertarRegistro.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnInsertarRegistro.setBounds(26, 292, 136, 23);
		contentPane.add(btnInsertarRegistro);
		
		JButton btnVisualizarTodos = new JButton("Visualizar Todos");
		btnVisualizarTodos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVisualizarTodos.setBounds(476, 293, 145, 23);
		contentPane.add(btnVisualizarTodos);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLimpiar.setBounds(168, 293, 89, 23);
		contentPane.add(btnLimpiar);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 182, 193));
		separator.setBackground(new Color(255, 182, 193));
		separator.setBounds(21, 50, 659, 14);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 128));
		separator_1.setBounds(21, 279, 666, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(0, 0, 128));
		separator_2.setBounds(14, 327, 666, 2);
		contentPane.add(separator_2);
		
	
		labelProv.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelProv.setBounds(53, 71, 154, 19);
		contentPane.add(labelProv);
		
		comboProveedor = new JComboBox();
		comboProveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Proveedores prov = op.cargaproveedor(comboProveedor.getSelectedItem().toString());
				nombreprov.setText(prov.getNombre() + ", " + prov.getApellidos());
			}
		});
		comboProveedor.setBounds(191, 71, 86, 20);
		contentPane.add(comboProveedor);
		
	
		labelProyect.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelProyect.setBounds(53, 101, 164, 19);
		contentPane.add(labelProyect);
		
		comboProyecto = new JComboBox();
		comboProyecto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Proyectos proy = op.cargaproyecto(comboProyecto.getSelectedItem().toString());
				nombreproyec.setText(proy.getNombre());
				
			}
		});
		comboProyecto.setBounds(191, 101, 136, 20);
		contentPane.add(comboProyecto);
		
		comboPiezas = new JComboBox();
		comboPiezas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Piezas pie = op.cargapieza(comboPiezas.getSelectedItem().toString());
				nombrepieza.setText(pie.getNombre());
				pvppieza.setText(pie.getPrecio().toString());
				
			}
		});
		comboPiezas.setBounds(191, 131, 136, 20);
		contentPane.add(comboPiezas);
		
		JLabel labelcantidad = new JLabel("Cantidad de Piezas: ");
		labelcantidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelcantidad.setBounds(53, 168, 128, 19);
		contentPane.add(labelcantidad);
		
		
		cantidad.setBackground(new Color(144, 238, 144));
		cantidad.setHorizontalAlignment(SwingConstants.CENTER);
		cantidad.setFont(new Font("Tahoma", Font.BOLD, 12));
		cantidad.setBounds(191, 167, 86, 20);
		contentPane.add(cantidad);
		cantidad.setColumns(5);
		
		nombreprov = new JTextField();
		nombreprov.setEditable(false);
		nombreprov.setBackground(new Color(238, 232, 170));
		nombreprov.setBounds(471, 70, 214, 20);
		contentPane.add(nombreprov);
		nombreprov.setColumns(10);
		
		JLabel lblNombreYApellido = new JLabel("Nombre y apellidos:");
		lblNombreYApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombreYApellido.setBounds(344, 70, 117, 19);
		contentPane.add(lblNombreYApellido);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNombre.setBounds(344, 101, 58, 19);
		contentPane.add(lblNombre);
		
		nombreproyec = new JTextField();
		nombreproyec.setEditable(false);
		nombreproyec.setBackground(new Color(238, 232, 170));
		nombreproyec.setColumns(10);
		nombreproyec.setBounds(414, 101, 214, 20);
		contentPane.add(nombreproyec);
		
		JLabel label = new JLabel("Nombre:");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(344, 131, 75, 19);
		contentPane.add(label);
		
		nombrepieza = new JTextField();
		nombrepieza.setEditable(false);
		nombrepieza.setBackground(new Color(238, 232, 170));
		nombrepieza.setColumns(10);
		nombrepieza.setBounds(404, 131, 214, 20);
		contentPane.add(nombrepieza);
		
		JLabel labelpvp = new JLabel("Pvp pieza: ");
		labelpvp.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelpvp.setBounds(445, 165, 69, 19);
		contentPane.add(labelpvp);
		
		pvppieza = new JTextField();
		pvppieza.setEditable(false);
		pvppieza.setBackground(new Color(238, 232, 170));
		pvppieza.setHorizontalAlignment(SwingConstants.CENTER);
		pvppieza.setColumns(10);
		pvppieza.setBounds(515, 162, 106, 20);
		contentPane.add(pvppieza);
		
		JLabel labeImporte = new JLabel("IMPORTE PIEZAS:");
		labeImporte.setFont(new Font("Tahoma", Font.BOLD, 11));
		labeImporte.setBounds(371, 198, 128, 19);
		contentPane.add(labeImporte);
		
	
		Importe.setFont(new Font("Tahoma", Font.BOLD, 12));
		Importe.setHorizontalAlignment(SwingConstants.CENTER);
		Importe.setEditable(false);
		Importe.setColumns(10);
		Importe.setBackground(new Color(238, 232, 170));
		Importe.setBounds(482, 198, 106, 20);
		contentPane.add(Importe);
		
		Mensaje.setBackground(new Color(34, 139, 34));
		Mensaje.setHorizontalAlignment(SwingConstants.CENTER);
		Mensaje.setFont(new Font("Tahoma", Font.BOLD, 11));
		Mensaje.setForeground(new Color(255, 0, 0));
		Mensaje.setBounds(53, 239, 627, 29);
		contentPane.add(Mensaje);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(new Color(0, 0, 128));
		separator_3.setBounds(21, 226, 666, 2);
		contentPane.add(separator_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 340, 684, 246);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		textArea.setForeground(new Color(0, 0, 0));
		textArea.setBackground(new Color(204, 255, 153));
		
		// cargar los combos
		op = new operacionesSuministros();	
		op.cargarcombos( comboPiezas, comboProveedor, comboProyecto);
		
		JButton btnVerpiezas = new JButton("Consultar Piezas");
		btnVerpiezas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				op.listarpiezas(textArea);
				
			}
		});
		btnVerpiezas.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVerpiezas.setBounds(201, 198, 138, 23);
		contentPane.add(btnVerpiezas);
		
		JButton consultareggestion = new JButton("Consultar Registro");
		consultareggestion.setFont(new Font("Tahoma", Font.BOLD, 11));
		consultareggestion.setBounds(43, 198, 148, 23);
		contentPane.add(consultareggestion);
	}
}
