package ventanas;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;


import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

import TP.Lavarropas;
import TP.Principal;

public class VentanaListaLavarropas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField rango1;
	private JTextField rango2;
	private JTextField consumo;
	private JTable table;
	
	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaListaLavarropas frame = new VentanaListaLavarropas();
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
	
	
	public VentanaListaLavarropas() {
		setTitle("LISTADO LAVARROPAS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseRangoDe = new JLabel("Ingrese rango de precio que desea listar:");
		lblIngreseRangoDe.setBounds(10, 22, 220, 14);
		contentPane.add(lblIngreseRangoDe);
		
		rango1 = new JTextField();
		rango1.setBounds(66, 50, 62, 20);
		contentPane.add(rango1);
		rango1.setColumns(10);
		
		rango2 = new JTextField();
		rango2.setBounds(224, 47, 62, 20);
		contentPane.add(rango2);
		rango2.setColumns(10);
		
		JLabel lblDesde = new JLabel("Desde:");
		lblDesde.setBounds(10, 53, 46, 14);
		contentPane.add(lblDesde);
		
		JLabel lblHasta = new JLabel("Hasta:");
		lblHasta.setBounds(168, 53, 46, 14);
		contentPane.add(lblHasta);
		
		JLabel lblIngreseConsumoEnergetico = new JLabel("Ingrese consumo energetico que desea listar:");
		lblIngreseConsumoEnergetico.setBounds(10, 103, 234, 14);
		contentPane.add(lblIngreseConsumoEnergetico);
		
		consumo = new JTextField();
		consumo.setBounds(10, 136, 62, 20);
		contentPane.add(consumo);
		consumo.setColumns(10);
		
		JLabel lblAB = new JLabel("A - B - C - D - E - F");
		lblAB.setBounds(128, 139, 108, 14);
		contentPane.add(lblAB);
		
		
		JButton listar = new JButton("Listar");
		listar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				ArrayList<Lavarropas> lista = new ArrayList<Lavarropas>();
				float r1, r2;
				char c;
				
				r1=Integer.parseInt(rango1.getText());
				r2=Integer.parseInt(rango2.getText());
				c=(char)consumo.getText().charAt(0);
				
				lista=Principal.listaLava(r1, r2, c);
				MostrarListaL muestraL = new MostrarListaL();
				muestraL.setVisible(true);
				muestraL.listar(lista);
				
			}
		});
		listar.setBounds(125, 193, 89, 23);
		contentPane.add(listar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
			}
		});
		btnSalir.setBounds(283, 193, 89, 23);
		contentPane.add(btnSalir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(212, 349, 2, 2);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBounds(213, 349, 1, 1);
		contentPane.add(table);

		
	}
	

}

