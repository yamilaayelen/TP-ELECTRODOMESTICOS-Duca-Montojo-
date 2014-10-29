package TP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaBajaLavarropas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField descrip;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaBajaLavarropas frame = new VentanaBajaLavarropas();
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
	public VentanaBajaLavarropas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 373, 229);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese descripcion del Lavarropas a eliminar:");
		lblNewLabel.setBounds(10, 33, 335, 14);
		contentPane.add(lblNewLabel);
		
		descrip = new JTextField();
		descrip.setBounds(46, 72, 213, 20);
		contentPane.add(descrip);
		descrip.setColumns(10);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				int b;
				String descripEL;
				
				descripEL= descrip.getText();
				b=Principal.bajaLava(descripEL);
				if(b==0)
				{
				JOptionPane.showMessageDialog(null, "Lavarropas no encontrado");
				}
			}
		});
		btnEliminar.setBounds(42, 127, 89, 23);
		contentPane.add(btnEliminar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
			}
		});
		btnSalir.setBounds(193, 127, 89, 23);
		contentPane.add(btnSalir);
	}

}
