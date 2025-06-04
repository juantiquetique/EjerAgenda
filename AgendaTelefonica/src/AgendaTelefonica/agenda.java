package AgendaTelefonica;

public class agenda {
	private contacto agenda[] = new contacto[10];
	
	public agenda()
	{
		
	}
	
	public boolean registrarContacto(contacto contacto)
	{
		for(int i = 0 ; i < agenda.length; i++)
		{
			if(agenda[i] == null)
			{
				agenda[i] = contacto;
				return true;
			}
		}
		return true;
	}
	
	public void listarContactos()
	{
		for(int i = 0; i < agenda.length && agenda[i] != null; i++)
		{
			System.out.println("Nombre: "+ agenda[i].getNombre() + " - Número: "+ agenda[i].getNumero());
		}
	}
	
	public void buscarContacto(String nombre)
	{
		for(int i = 0; i < agenda.length; i++)
		{
			if(agenda[i] != null && agenda[i].getNombre().equals(nombre))
			{
				System.out.println("El número del contacto es: " + agenda[i].getNumero());
			}
		}
	}
	
	public int disponibles() 
	{
		int aux = 0;
		while(agenda[aux] != null)
		{
			aux++;
		}
		return 10-aux;
	}
}
