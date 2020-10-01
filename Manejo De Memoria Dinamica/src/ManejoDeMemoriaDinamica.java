import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Aspirante{
	//Folio 
	private String Nombre;
	private byte edad;
	private String RedesSociales[];	
	public Aspirante(String nombre, byte edad, String[] redesSociales) {
		Nombre = nombre;
		this.edad = edad;
		this.RedesSociales = redesSociales;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public String[] getRedesSociales() {
		return RedesSociales;
	}

	public void setRedesSociales(String[] redesSociales) {
		RedesSociales = redesSociales;
	}

	@Override
	public String toString() {
		return "Aspirante [Nombre=" + Nombre + ", edad=" + edad + ", RedesSociales=" + Arrays.toString(RedesSociales)
				+ "]";
	}
	
}

class registroAspitantes{
	ArrayList ListaAspirantes;
	public registroAspitantes () {
	ListaAspirantes = new ArrayList();
	}
	
	public void agregarAspirante(Aspirante a) {
		ListaAspirantes.add(a);
	}
	
	public void mostrarAspirantes() {
		
		Iterator i = ListaAspirantes.iterator();
		while(i.hasNext()) {
			Aspirante a = (Aspirante)i.next();
			System.out.println(a);
		}
		class nuevoRegistroAspirantes{
			public  ArrayList nuevoRegistroAspirantes;

			public nuevoRegistroAspirantes() {
				nuevoRegistroAspirantes = ListaAspirantes;
			
				}
				
				
			}
		}
		
	}
	
	




public class ManejoDeMemoriaDinamica {
	public static void main(String[] args) {
		
		registroAspitantes ra = new registroAspitantes();
		
		String redes[] = {"fb" , "tw" ,"ig"};
		ra.agregarAspirante(new Aspirante("1", (byte)1,redes));
		ra.agregarAspirante(new Aspirante("2", (byte)1,redes));
		ra.agregarAspirante(new Aspirante("3", (byte)1,redes));
		ra.agregarAspirante(new Aspirante("4", (byte)1,redes));
		ra.agregarAspirante(new Aspirante("5", (byte)1,redes));
		
		ra.mostrarAspirantes();
		System.out.println("Tamaño del arraylist: " + ra.ListaAspirantes.size());
		
		String nuevoRegistroAspirantes = null;
		System.out.println("El nuevo registro de Aspirantes es ; "+ nuevoRegistroAspirantes);
		}

	private static void isEmpty() {
	
		
	}
		
	}

			
		
	
		
		
	


