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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaBajaTelevisor extends JFrame {

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
					VentanaBajaTelevisor frame = new VentanaBajaTelevisor();
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
	public VentanaBajaTelevisor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 227);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseDescripcionDel = new JLabel("Ingrese descripcion del Televisor a eliminar:");
		lblIngreseDescripcionDel.setBounds(10, 27, 389, 14);
		contentPane.add(lblIngreseDescripcionDel);
		
		descrip = new JTextField();
		descrip.setBounds(59, 62, 201, 20);
		contentPane.add(descrip);
		descrip.setColumns(10);
		
		JButton eliminar = new JButton("Eliminar");
		eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				int b;
				String descripET;
				
				descripET= descrip.getText();
				b=Principal.bajaTele(descripET);
				if(b==0)
				{
				JOptionPane.showMessageDialog(null, "Televisor no encontrado");
				}

			}
		});
		eliminar.setBounds(45, 121, 89, 23);
		contentPane.add(eliminar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				dispose();
			}
		});
		btnSalir.setBounds(209, 121, 89, 23);
		contentPane.add(btnSalir);
	}

}
