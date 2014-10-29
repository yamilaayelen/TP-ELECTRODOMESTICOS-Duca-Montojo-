package pruebas;

import TP.*;
import datos.*;

public class PruebaDatos {
	
		public static void main(String[] args) 
		{
		
		CatalogoLavarropas catLav=new datos.CatalogoLavarropas();
		
		TP.Lavarropas nl= nuevoLavarropas();
		System.out.println("Descripcion: "+(nl.getDescrip()));
		System.out.println("Precio Base: "+Float.toString(nl.getPrecioBase()));
		System.out.println("Color: "+(nl.getColor()));
		System.out.println("Consumo Energetico: "+(nl.getConsumoEnergetico()));
		System.out.println("Peso: "+Float.toString(nl.getPeso()));
		System.out.println("Carga: "+Integer.toString(nl.getCarga()));
		catLav.addLavarropas(nl);
		
		
		for (TP.Lavarropas l : catLav.getLavarropas()) 
		{
			printLavarropas(l);
		}
		
		TP.Lavarropas lav=catLav.getLavarropasByDescripcion("Lava1");
		printLavarropas(lav);
		
		}
	
		private static TP.Lavarropas nuevoLavarropas()
		{
			TP.Lavarropas l=new Lavarropas();
			l.setDescrip("Lava1");
			l.setPrecioBase(12);
			l.setColor("Blanco");
			//l.setConsumoEnergetico("A");
			l.setPeso(12);
			l.setCarga(45);
			return l;
		}

		private static void printLavarropas(TP.Lavarropas l)
		{
			if(l!=null)
			{
				String Lav="";
				Lav+=(l.getDescrip())+"\t";
				Lav+=Float.toString(l.getPrecioBase())+"\t";
				Lav+=l.getColor();
				Lav+=l.getConsumoEnergetico();
				Lav+=Float.toString(l.getPeso())+"\t";
				Lav+=Integer.toString(l.getCarga())+"\t";
				System.out.println(Lav);
			}
			else
			{
				System.out.println("Lavarropa Inexistente");
			}
	
	}

}
