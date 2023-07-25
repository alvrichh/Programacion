package Ventanas;
import operaciones.*;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class barrademenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public barrademenu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("imagenes\\icon4.png"));
		
		setTitle("GESTION PIEZAS-PROYECTOS-PROVEEDORES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 482, 358);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnGestinDeTablas = new JMenu("Gesti\u00F3n de tablas");
		menuBar.add(mnGestinDeTablas);
		
		JMenuItem mntmProyectos = new JMenuItem("Proyectos");
		mntmProyectos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(" Menú proyectos ");
				
				 dispose(); 
				 VGestionProyectos vg = new VGestionProyectos();
				 vg.setVisible(true);
			}
		});
		mnGestinDeTablas.add(mntmProyectos);
		
		JMenuItem mntmPiezas = new JMenuItem("Piezas");
		mntmPiezas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(" Menú Piezas ");
				dispose(); 
				 VGestionPiezas vpi = new VGestionPiezas();
				 vpi.setVisible(true);
				
			}
		});
		mnGestinDeTablas.add(mntmPiezas);
		
		JMenuItem mntmProveedores = new JMenuItem("Proveedores");
		mntmProveedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(" Menú Proveedores ");
				 dispose(); 
				 VGestionProveedores vp = new VGestionProveedores();
				 vp.setVisible(true);
			}
		});
		mnGestinDeTablas.add(mntmProveedores);
		
		JMenu mnGestinDeSuministros = new JMenu("Gesti\u00F3n de Suministros");
		mnGestinDeSuministros.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(" Menú Suministros ");
				dispose(); 
				VGestionSuministros vs = new VGestionSuministros();
				vs.setVisible(true);
				
			}
		});
		
		menuBar.add(mnGestinDeSuministros);
		
		JMenu mnInformes = new JMenu("Informes");
		menuBar.add(mnInformes);
		
		JMenuItem mntmPiezas_1 = new JMenuItem("Piezas");
		mnInformes.add(mntmPiezas_1);
		
		JMenuItem mntmProveedores_1 = new JMenuItem("Proveedores");
		mnInformes.add(mntmProveedores_1);
		
		JMenuItem mntmProyectos_1 = new JMenuItem("Proyectos");
		mnInformes.add(mntmProyectos_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setLocation(5, 5);
		lblNewLabel.setSize(new Dimension(456, 291));
		lblNewLabel.setIcon(new ImageIcon("imagenes\\gestion3.jpg"));
		contentPane.add(lblNewLabel);


	  
		  
	}
}
