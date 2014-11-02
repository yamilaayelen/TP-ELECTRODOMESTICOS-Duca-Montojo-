package TP;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class ListaTelevisores extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Television> dataSource;
	
	public ArrayList<Television> getDataSource() {
		return dataSource;
	}

	public void setDataSource(ArrayList<Television> dataSource) {
		this.dataSource = dataSource;
	}

	public int getRowCount() {
		return dataSource.size();
	}

	public int getColumnCount() {
		return 6;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		Television l= dataSource.get(rowIndex);
		Object o;
		switch (columnIndex) {
		case 0:
			o=l.getDescrip();
			break;
		case 1:
			o=l.getPrecioBase();
			break;
		case 2:
			o=l.getConsumoEnergetico();
			break;
		default:
			o=null;
			break;
		}
		return o;
	}
	
	public String getColumnName( int column)
	{
		String nom="";
		switch (column) {
		case 0:
			nom="Descripcion";
			break;
		case 1:
			nom="Precio Base";
			break;
		case 2:
			nom="Consumo Energetico";
			break;
		default:
			nom="";
			break;
		}
		return nom;
		
	}	

}
