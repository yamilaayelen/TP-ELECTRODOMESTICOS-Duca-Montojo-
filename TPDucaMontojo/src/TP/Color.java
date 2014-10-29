package TP;


public class Color 
{
	private String nombre;
	
	static String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int validaColor(String colorV)
	{
		int valida=0;
		for(int i=0; i<5;i++)
		{
			if (colores.equals(colorV) == true)
			{valida=1;
				break;}
			else
				valida=0;
		}
		return valida;
	}
}
