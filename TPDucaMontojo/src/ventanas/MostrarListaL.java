package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;

import TP.Lavarropas;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MostrarListaL extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostrarListaL frame = new MostrarListaL();
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
	public MostrarListaL() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 363);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(2, 258, 435, -259);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBounds(12, 10, 412, 237);
		contentPane.add(table);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
			}
		});
		btnSalir.setBounds(164, 290, 89, 23);
		contentPane.add(btnSalir);
	}
	
	public void listar(ArrayList<Lavarropas> lista)
	{
		ListaLavarropas tablaL =new ListaLavarropas();
		tablaL.setDataSource(lista);
		table.setModel(tablaL);
			
			
		//crear el tablemodel (Lista Lavarropas)
		//Asignarle l como datasource(setDataSource)
		//asignarle al jtabl el datasource
	}
}
