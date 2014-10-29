package TP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaListaTelevisores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField rango1;
	private JTextField rango2;
	private JTextField consumo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaListaTelevisores frame = new VentanaListaTelevisores();
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
	public VentanaListaTelevisores() {
		setTitle("LISTADO TELEVISORES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese rango de precio que desea listar:");
		lblNewLabel.setBounds(10, 35, 212, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblDesde = new JLabel("Desde:");
		lblDesde.setBounds(10, 77, 46, 14);
		contentPane.add(lblDesde);
		
		JLabel lblHasta = new JLabel("Hasta:");
		lblHasta.setBounds(195, 77, 46, 14);
		contentPane.add(lblHasta);
		
		rango1 = new JTextField();
		rango1.setBounds(66, 74, 86, 20);
		contentPane.add(rango1);
		rango1.setColumns(10);
		
		rango2 = new JTextField();
		rango2.setBounds(264, 74, 86, 20);
		contentPane.add(rango2);
		rango2.setColumns(10);
		
		JLabel lblIngreseConsumoEnergetico = new JLabel("Ingrese consumo energetico que desea listar:");
		lblIngreseConsumoEnergetico.setBounds(10, 139, 233, 14);
		contentPane.add(lblIngreseConsumoEnergetico);
		
		consumo = new JTextField();
		consumo.setBounds(10, 174, 86, 20);
		contentPane.add(consumo);
		consumo.setColumns(10);
		
		JLabel lblAB = new JLabel("A - B - C - D - E - F");
		lblAB.setBounds(141, 177, 104, 14);
		contentPane.add(lblAB);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				float r1, r2;
				char c;
				
				r1=Integer.parseInt(rango1.getText());
				r2=Integer.parseInt(rango2.getText());
				c=(char)consumo.getText().charAt(0);
				
				Principal.listaTele(r1, r2, c);
			}
		});
		btnListar.setBounds(141, 235, 89, 23);
		contentPane.add(btnListar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				dispose();
			}
		});
		btnSalir.setBounds(278, 235, 89, 23);
		contentPane.add(btnSalir);
	}

}
