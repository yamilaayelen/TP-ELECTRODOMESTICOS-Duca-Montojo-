package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import TP.Principal;
import TP.Television;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class VentanaModificaTelevisor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField descripI;
	private JTextField descripcion;
	private JTextField precioBase;
	private JTextField color;
	private JTextField consumo;
	private JTextField peso;
	private JTextField resolucion;
	private JTextField sintonizador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaModificaTelevisor frame = new VentanaModificaTelevisor();
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
	public VentanaModificaTelevisor() {
		setTitle("MODIFICA TELEVISOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseDescripcionDel = new JLabel("Ingrese descripcion del Televisor a modificar:");
		lblIngreseDescripcionDel.setBounds(10, 42, 252, 14);
		contentPane.add(lblIngreseDescripcionDel);
		
		descripI = new JTextField();
		descripI.setBounds(272, 39, 215, 20);
		contentPane.add(descripI);
		descripI.setColumns(10);
		
		JButton busca = new JButton("Busca");
		busca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			
			String desc;
			Television tele;
			char ce = 0;
			
			//String nuevaDesc, nuevoColor, nuevoPrecio, nuevoPeso, nuevoConsumo, nuevaResolucion, nuevoSintonizador;
				
			desc=descripI.getText();
			tele=Principal.BuscaTele(desc);
			if (tele != null)
			{
			//devuelve los atributos a la ventana
			descripcion.setText(tele.getDescrip());
			precioBase.setText(String.valueOf(tele.getPrecioBase()));
			peso.setText(String.valueOf(tele.getPeso()));
			color.setText(tele.getColor());
			ce=tele.getConsumoEnergetico();
			consumo.setText(String.valueOf(ce));
			resolucion.setText(String.valueOf(tele.getResolucion()));
			sintonizador.setText(String.valueOf(tele.getSintonizadorTDT()));
			
			//modifica y guarda los atributos del objeto lava
			/*
			 nuevaDesc=descripcion.getText();
			 nuevoPrecio=precioBase.getText();
			 nuevoPeso=peso.getText();
			 nuevoColor=color.getText();
			 nuevoConsumo=consumo.getText();
			 nuevaResolucion=resolucion.getText();
			 nuevoSintonizador=sintonizador.getText();
			 */
			
			}
			
			else if(tele==null)
			{
				JOptionPane.showMessageDialog(null, "Televisor no encontrado");
			}
			}
		});
		busca.setBounds(528, 38, 89, 23);
		contentPane.add(busca);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(27, 132, 76, 14);
		contentPane.add(lblDescripcion);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(27, 218, 46, 14);
		contentPane.add(lblColor);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(27, 296, 46, 14);
		contentPane.add(lblPeso);
		
		JLabel lblResolucion = new JLabel("Resolucion");
		lblResolucion.setBounds(27, 335, 63, 14);
		contentPane.add(lblResolucion);
		
		JLabel lblSintonizadorTdt = new JLabel("Sintonizador TDT");
		lblSintonizadorTdt.setBounds(27, 373, 89, 14);
		contentPane.add(lblSintonizadorTdt);
		
		JLabel lblConsumo = new JLabel("Consumo");
		lblConsumo.setBounds(27, 259, 46, 14);
		contentPane.add(lblConsumo);
		
		JLabel lblPrecioBase = new JLabel("Precio Base");
		lblPrecioBase.setBounds(27, 175, 83, 14);
		contentPane.add(lblPrecioBase);
		
		JButton guardar = new JButton("Guardar");
		guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				dispose();
			}
		});
		guardar.setBounds(481, 373, 76, 29);
		contentPane.add(guardar);
		
		descripcion = new JTextField();
		descripcion.setBounds(167, 129, 86, 20);
		contentPane.add(descripcion);
		descripcion.setColumns(10);
		
		precioBase = new JTextField();
		precioBase.setBounds(167, 172, 86, 20);
		contentPane.add(precioBase);
		precioBase.setColumns(10);
		
		color = new JTextField();
		color.setBounds(167, 215, 86, 20);
		contentPane.add(color);
		color.setColumns(10);
		
		consumo = new JTextField();
		consumo.setBounds(167, 256, 86, 20);
		contentPane.add(consumo);
		consumo.setColumns(10);
		
		peso = new JTextField();
		peso.setBounds(167, 296, 86, 20);
		contentPane.add(peso);
		peso.setColumns(10);
		
		resolucion = new JTextField();
		resolucion.setBounds(167, 332, 86, 20);
		contentPane.add(resolucion);
		resolucion.setColumns(10);
		
		JLabel lblBlancoNegro = new JLabel("Blanco - Negro - Gris - Azul - Rojo");
		lblBlancoNegro.setBounds(309, 218, 177, 14);
		contentPane.add(lblBlancoNegro);
		
		JLabel lblAB = new JLabel("A - B - C - D - E - F");
		lblAB.setBounds(309, 259, 118, 14);
		contentPane.add(lblAB);
		
		sintonizador = new JTextField();
		sintonizador.setBounds(167, 370, 86, 20);
		contentPane.add(sintonizador);
		sintonizador.setColumns(10);
		
		JLabel lblTrueFlase = new JLabel("true - false");
		lblTrueFlase.setBounds(309, 373, 83, 14);
		contentPane.add(lblTrueFlase);
		
		JLabel label = new JLabel("------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		label.setForeground(Color.GRAY);
		label.setBounds(10, 91, 652, 14);
		contentPane.add(label);
	}
}
