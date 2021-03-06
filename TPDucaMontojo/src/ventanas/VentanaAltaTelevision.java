package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;




import TP.Principal;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaAltaTelevision extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField descripcion;
	private JTextField precioBase;
	private JTextField peso;
	private JTextField resolucion;
	private JTextField color;
	private JTextField consumo;
	private JTextField sintonizador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAltaTelevision frame = new VentanaAltaTelevision();
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
	public VentanaAltaTelevision() {
		setTitle("ALTA TELEVISION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(10, 33, 69, 14);
		contentPane.add(lblDescripcion);
		
		JLabel lblNewLabel = new JLabel("Precio Base");
		lblNewLabel.setBounds(10, 79, 69, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(10, 121, 46, 14);
		contentPane.add(lblColor);
		
		JLabel lblConsumo = new JLabel("Consumo");
		lblConsumo.setBounds(10, 166, 69, 14);
		contentPane.add(lblConsumo);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				//char ce;
				String descripcionAT, precioBaseAT, pesoAT, colorAT = null, consumoAT = null, resolucionAT, sintonizadorAT;
				
				descripcionAT=descripcion.getText();
				precioBaseAT=precioBase.getText();
				pesoAT=peso.getText();
				colorAT=color.getText();
				//vcolor=Color.validaColor(colorAT);
				consumoAT=consumo.getText();
				//ce = (char)consumoAT.charAt(0);
				//vconsumo=ConsumoEnergetico.validaConsumo(ce);
		
				resolucionAT=resolucion.getText();
				sintonizadorAT=sintonizador.getText();
				Principal.AltaTelevision(descripcionAT, precioBaseAT, pesoAT, colorAT, consumoAT, resolucionAT, sintonizadorAT);
				JOptionPane.showMessageDialog(null, "Televisor registrado");
			}
		});
		btnAgregar.setBounds(193, 354, 89, 23);
		contentPane.add(btnAgregar);
		
		descripcion = new JTextField();
		descripcion.setBounds(139, 30, 86, 20);
		contentPane.add(descripcion);
		descripcion.setColumns(10);
		
		precioBase = new JTextField();
		precioBase.setBounds(139, 76, 86, 20);
		contentPane.add(precioBase);
		precioBase.setColumns(10);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(10, 206, 46, 14);
		contentPane.add(lblPeso);
		
		peso = new JTextField();
		peso.setBounds(139, 203, 86, 20);
		contentPane.add(peso);
		peso.setColumns(10);
		
		JLabel lblResolucion = new JLabel("Resolucion");
		lblResolucion.setBounds(10, 248, 69, 14);
		contentPane.add(lblResolucion);
		
		resolucion = new JTextField();
		resolucion.setBounds(139, 245, 86, 20);
		contentPane.add(resolucion);
		resolucion.setColumns(10);
		
		JLabel lblSintonizadorTdt = new JLabel("Sintonizador TDT");
		lblSintonizadorTdt.setBounds(10, 294, 98, 14);
		contentPane.add(lblSintonizadorTdt);
		
		color = new JTextField();
		color.setBounds(139, 118, 86, 20);
		contentPane.add(color);
		color.setColumns(10);
		
		consumo = new JTextField();
		consumo.setBounds(139, 163, 86, 20);
		contentPane.add(consumo);
		consumo.setColumns(10);
		
		JLabel lblAB = new JLabel("A - B - C - D - E - F");
		lblAB.setBounds(267, 166, 122, 14);
		contentPane.add(lblAB);
		
		JLabel lblBlancoNegro = new JLabel("Blanco - Negro - Gris - Azul - Rojo");
		lblBlancoNegro.setBounds(270, 121, 176, 14);
		contentPane.add(lblBlancoNegro);
		
		sintonizador = new JTextField();
		sintonizador.setBounds(139, 291, 86, 20);
		contentPane.add(sintonizador);
		sintonizador.setColumns(10);
		
		JLabel lblTrueFlase = new JLabel("true - false");
		lblTrueFlase.setBounds(267, 294, 89, 14);
		contentPane.add(lblTrueFlase);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
			}
		});
		btnSalir.setBounds(331, 354, 89, 23);
		contentPane.add(btnSalir);
	}
}
