package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setTitle("MENU");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAltaLavarropas = new JButton("Alta Lavarropas");
		btnAltaLavarropas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				VentanaAltaLavarropas altaL = new VentanaAltaLavarropas();
				altaL.setVisible(true);
			}

		});
		btnAltaLavarropas.setBounds(27, 82, 155, 23);
		contentPane.add(btnAltaLavarropas);
		
		JButton btnAltaTelevisores = new JButton("Alta Televisores");
		btnAltaTelevisores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				VentanaAltaTelevision altaT = new VentanaAltaTelevision();
				altaT.setVisible(true);
			}
		});
		btnAltaTelevisores.setBounds(232, 82, 155, 23);
		contentPane.add(btnAltaTelevisores);
		
		JButton btnModifca = new JButton("Modifca Lavarropas");
		btnModifca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				VentanaModificaLavarropa modificaL = new VentanaModificaLavarropa();
				modificaL.setVisible(true);
			}
		});
		btnModifca.setBounds(27, 128, 155, 23);
		contentPane.add(btnModifca);
		
		JButton btnModificaTelevisores = new JButton("Modifica Televisor");
		btnModificaTelevisores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				VentanaModificaTelevisor modificaT = new VentanaModificaTelevisor();
				modificaT.setVisible(true);
			}
		});
		btnModificaTelevisores.setBounds(232, 128, 155, 23);
		contentPane.add(btnModificaTelevisores);
		
		JButton btnBajaLavarropas = new JButton("Baja Lavarropas");
		btnBajaLavarropas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				VentanaBajaLavarropas bajaL = new VentanaBajaLavarropas();
				bajaL.setVisible(true);
			}
		});
		btnBajaLavarropas.setBounds(27, 172, 155, 23);
		contentPane.add(btnBajaLavarropas);
		
		JButton btnBajaTelevisores = new JButton("Baja Televisor");
		btnBajaTelevisores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				VentanaBajaTelevisor bajaT = new VentanaBajaTelevisor();
				bajaT.setVisible(true);
			}
		});
		btnBajaTelevisores.setBounds(232, 172, 155, 23);
		contentPane.add(btnBajaTelevisores);
		
		JButton listaLavas = new JButton("Listado Lavarropas");
		listaLavas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				VentanaListaLavarropas listaL = new VentanaListaLavarropas();
				listaL.setVisible(true);
			}
		});
		listaLavas.setBounds(27, 219, 155, 23);
		contentPane.add(listaLavas);
		
		JLabel lblElectrodomsticos = new JLabel("Electrodom\u00E9sticos:");
		lblElectrodomsticos.setBounds(160, 34, 140, 14);
		contentPane.add(lblElectrodomsticos);
		
		JButton listaTeles = new JButton("Listado Televisores");
		listaTeles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				VentanaListaTelevisores listaT = new VentanaListaTelevisores();
				listaT.setVisible(true);
			}
		});
		listaTeles.setBounds(232, 219, 155, 23);
		contentPane.add(listaTeles);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
			}
		});
		btnNewButton.setBounds(160, 281, 99, 33);
		contentPane.add(btnNewButton);
	}
}
