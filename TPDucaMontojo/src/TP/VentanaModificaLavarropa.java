package TP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class VentanaModificaLavarropa extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JTextField descripI;
	private JTextField descripcion;
	private JTextField precioBase;
	private JTextField color;
	private JTextField consumo;
	private JTextField peso;
	private JTextField carga;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaModificaLavarropa frame = new VentanaModificaLavarropa();
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
	public VentanaModificaLavarropa() {
		setTitle("MODIFICA LAVARROPAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 531);
		getContentPane().setLayout(null);
		
		JLabel lblIngreseDescripcionDel = new JLabel("Ingrese descripcion del Lavarropas a modificar:");
		lblIngreseDescripcionDel.setBounds(10, 46, 277, 14);
		getContentPane().add(lblIngreseDescripcionDel);
		
		descripI = new JTextField();
		descripI.setBounds(311, 43, 171, 20);
		getContentPane().add(descripI);
		descripI.setColumns(10);
		
		JButton btnBusca = new JButton("Busca");
		btnBusca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String desc;
				Lavarropas lava;
				char ce = 0, c;
				
				String nuevaDesc, nuevoColor, nuevoPrecio, nuevoPeso, nuevaCarga, nuevoConsumo;
					
					
				desc=descripI.getText();
				lava=Principal.BuscaLava(desc);
				if (lava != null)
				{
				//devuelve los atributos a la ventana
				descripcion.setText(lava.getDescrip());
				precioBase.setText(String.valueOf(lava.getPrecioBase()));
				peso.setText(String.valueOf(lava.getPeso()));
				color.setText(lava.getColor());
				ce=lava.getConsumoEnergetico();
				consumo.setText(String.valueOf(ce));
				carga.setText(String.valueOf(lava.getCarga()));
				
				//modifica y guarda los atributos del objeto lava
				/*
				 nuevaDesc=descripcion.getText();
				 nuevoPrecio=precioBase.getText();
				 nuevoPeso=peso.getText();
				 nuevoColor=color.getText();
				 nuevoConsumo=consumo.getText();
				 nuevaCarga=carga.getText();
				 
				 lava.setDescrip(nuevaDesc);
				 lava.setPrecioBase(Float.parseFloat(nuevoPrecio));
				 lava.setPeso(Float.parseFloat(nuevoPeso));
				 lava.setColor(nuevoColor);
				 c = (char)nuevoConsumo.charAt(0);
				 lava.setConsumoEnergetico(c);
				 lava.setCarga(Integer.parseInt(nuevaCarga));
				 */
				
				}
				
				else if(lava==null)
				{
					JOptionPane.showMessageDialog(null, "Lavarropas no encontrado");
				}
				
				
			}
		});
		btnBusca.setBounds(531, 42, 80, 23);
		getContentPane().add(btnBusca);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(32, 116, 89, 14);
		getContentPane().add(lblDescripcion);
		
		JLabel lblPrecioBase = new JLabel("Precio Base");
		lblPrecioBase.setBounds(32, 165, 71, 14);
		getContentPane().add(lblPrecioBase);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(32, 213, 46, 14);
		getContentPane().add(lblColor);
		
		JLabel lblConsumoEnergetico = new JLabel("Consumo Energetico");
		lblConsumoEnergetico.setBounds(32, 264, 141, 14);
		getContentPane().add(lblConsumoEnergetico);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(32, 314, 46, 14);
		getContentPane().add(lblPeso);
		
		descripcion = new JTextField();
		descripcion.setBounds(183, 113, 86, 20);
		getContentPane().add(descripcion);
		descripcion.setColumns(10);
		
		precioBase = new JTextField();
		precioBase.setBounds(183, 162, 86, 20);
		getContentPane().add(precioBase);
		precioBase.setColumns(10);
		
		color = new JTextField();
		color.setBounds(183, 210, 86, 20);
		getContentPane().add(color);
		color.setColumns(10);
		
		consumo = new JTextField();
		consumo.setBounds(183, 261, 86, 20);
		getContentPane().add(consumo);
		consumo.setColumns(10);
		
		peso = new JTextField();
		peso.setBounds(183, 311, 86, 20);
		getContentPane().add(peso);
		peso.setColumns(10);
		
		carga = new JTextField();
		carga.setBounds(183, 367, 86, 20);
		getContentPane().add(carga);
		carga.setColumns(10);
		
		JLabel lblCrga = new JLabel("Carga");
		lblCrga.setBounds(32, 370, 46, 14);
		getContentPane().add(lblCrga);
		
		JButton guardar = new JButton("Guardar");
		guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
			}
		});
		guardar.setBounds(311, 424, 89, 23);
		getContentPane().add(guardar);
		
		JLabel label = new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------");
		label.setForeground(Color.GRAY);
		label.setBounds(10, 91, 592, 14);
		getContentPane().add(label);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
			}
		});
		btnSalir.setBounds(441, 424, 89, 23);
		getContentPane().add(btnSalir);
	}
}
