package TP;



public class ConsumoEnergetico
{
	static char[] consumos = {'A', 'B', 'C', 'D', 'E','F'};
		
	public static int validaConsumo(char consu)
	{
		int valida=0;
		for(int i=0; i<6;i++)
		{
			if (consumos.equals(consu) == true)
				{valida=1;
				break;}
			else
				valida=0;
		}
		return valida;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
