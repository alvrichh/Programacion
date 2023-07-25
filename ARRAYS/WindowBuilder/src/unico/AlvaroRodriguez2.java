package unico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;

public class AlvaroRodriguez2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombreProducto;
	private JTextField txtPrecioProducto;
	private JTextArea textArea;
	private JRadioButton selectExtra;
	private JRadioButton selectPrimera;
	private JRadioButton selectSuperExtra;
	private JRadioButton selectSegunda;
	private final ButtonGroup buttonGroupCategoria = new ButtonGroup();
	private final ButtonGroup buttonGroupIva = new ButtonGroup();
	private JComboBox comboBox;
	private JCheckBox chckbxAplicaTasa;
	private JButton btnVerDatos;
	private JButton btnLimpiarDatos;
	public String grupoCategoria = null;
	public String grupoIva = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlvaroRodriguez2 frame = new AlvaroRodriguez2();
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
	public AlvaroRodriguez2() {
		setTitle("Ventana Gestion De Productos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENTRADA DE DATOS DE PRODUCTOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(102, 11, 244, 32);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(10, 54, 414, 255);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre De Producto:");
		lblNewLabel_1.setBounds(20, 21, 108, 14);
		panel.add(lblNewLabel_1);
		
		txtNombreProducto = new JTextField();
		txtNombreProducto.setBounds(132, 19, 147, 20);
		panel.add(txtNombreProducto);
		txtNombreProducto.setColumns(10);
		
		chckbxAplicaTasa = new JCheckBox("Aplica tasa");
		chckbxAplicaTasa.setBounds(285, 18, 97, 23);
		panel.add(chckbxAplicaTasa);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tipo producto:");
		lblNewLabel_1_1.setBounds(20, 46, 108, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Precio del producto:");
		lblNewLabel_1_1_1.setBounds(20, 71, 108, 14);
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Categoria:");
		lblNewLabel_1_1_2.setBounds(20, 103, 61, 14);
		panel.add(lblNewLabel_1_1_2);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"De temporada", "Importado", "Consumo popular", "Duradero", "No duradero"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(132, 43, 108, 22);
		panel.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBounds(82, 107, 219, 60);
		panel.add(panel_2);
		panel_2.setLayout(null);

		
		selectExtra = new JRadioButton("Extra");
		buttonGroupCategoria.add(selectExtra);
		selectExtra.setBounds(6, 7, 61, 23);
		panel_2.add(selectExtra);

		selectSegunda = new JRadioButton("Segunda");
		buttonGroupCategoria.add(selectSegunda);
		selectSegunda.setBounds(95, 7, 79, 23);
		panel_2.add(selectSegunda);

		selectPrimera = new JRadioButton("Primera");
		buttonGroupCategoria.add(selectPrimera);
		selectPrimera.setBounds(6, 33, 61, 23);
		panel_2.add(selectPrimera);

		selectSuperExtra = new JRadioButton("Super-Extra");
		buttonGroupCategoria.add(selectSuperExtra);
		selectSuperExtra.setBounds(95, 33, 106, 23);

		panel_2.add(selectSuperExtra);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("IVA");
		lblNewLabel_1_1_2_1.setBounds(29, 177, 51, 14);
		panel.add(lblNewLabel_1_1_2_1);
		
		txtPrecioProducto = new JTextField();
		txtPrecioProducto.setColumns(10);
		txtPrecioProducto.setBounds(132, 70, 108, 20);
		panel.add(txtPrecioProducto);
		
		JRadioButton select4 = new JRadioButton("4%");
		buttonGroupIva.add(select4);
		select4.setBounds(61, 173, 61, 23);
		panel.add(select4);
		
		JRadioButton select10 = new JRadioButton("10%");
		buttonGroupIva.add(select10);
		select10.setBounds(135, 173, 61, 23);
		panel.add(select10);
		
		JRadioButton select21 = new JRadioButton("21%");
		buttonGroupIva.add(select21);
		select21.setBounds(208, 173, 61, 23);
		panel.add(select21);
		
		btnVerDatos = new JButton("Ver datos tecleados");
		btnVerDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Para asignar lo de la tasa
				String mensajeTasa;				
				mensajeTasa = chckbxAplicaTasa.isSelected() ? "Seleccionado" : "No seleccionado";
				//Condicionales para el valor de la categoria
				if(selectExtra.isSelected()) grupoCategoria = "Extra";
				if(selectSegunda.isSelected()) grupoCategoria = "Segunda";
				if(selectPrimera.isSelected()) grupoCategoria = "Primera";
				if(selectSuperExtra.isSelected()) grupoCategoria = "Super-Extra";
				//Condicionales para el valor de la categoria
				if(select4.isSelected()) grupoIva = "4%";
				if(select10.isSelected()) grupoIva = "10%";
				if(select21.isSelected()) grupoIva = "21%";
 				textArea.setText("LOS DATOS TECLEADOS SON:"
						+ "\n======================================"
						+ "\nProducto tecleado: " + txtNombreProducto.getText() + ""
						+ "\nPrecio tecleado: " + txtPrecioProducto.getText() + ""
						+ "\nTipo seleccionado:" + comboBox.getSelectedItem()+""
						+ "\n======================================"
						+ "\nCategoria:" + grupoCategoria + ""
						+ "\nIVA:" + grupoIva + ""
						+ "\nTasa:" + mensajeTasa);
 				

				
			}
		});
		btnVerDatos.setBounds(10, 209, 188, 35);
		panel.add(btnVerDatos);
		
		btnLimpiarDatos = new JButton("Limpiar datos");
		btnLimpiarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNombreProducto.setText("");
				txtPrecioProducto.setText("");
				textArea.setText("");
				buttonGroupCategoria.clearSelection();
				buttonGroupIva.clearSelection();
				chckbxAplicaTasa.setSelected(false);
				comboBox.setSelectedIndex(0);
				
			}
		});
		btnLimpiarDatos.setBounds(216, 209, 188, 35);
		panel.add(btnLimpiarDatos);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 10));
		textArea.setText("LOS DATOS TECLEADOS SON:\r\n======================================\r\nProducto tecleado: \r\nPrecio tecleado: \r\nTipo seleccionado: \r\n======================================\r\nCategoria:\r\nIVA:\r\nTasa:");
		textArea.setBackground(new Color(192, 192, 192));
		textArea.setBounds(10, 330, 414, 137);
		contentPane.add(textArea);
	}
}