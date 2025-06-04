package AgendaTelefonica;

public class main {

	public static void main(String[] args) {
		agenda agendita = new agenda();
		contacto contacto = new contacto();
		contacto contacto1 = new contacto();
		contacto contacto2 = new contacto();
		
		//Se asigna en nombre y e número
		contacto.setNombre("Diego");
		contacto.setNumero("3012491111");
		
		contacto1.setNombre("Andres");
		contacto1.setNumero("3127460571");
		
		contacto2.setNombre("Henry");
		contacto2.setNumero("3127340790");
		
		//Se guarda el contacto
		agendita.registrarContacto(contacto);
		agendita.registrarContacto(contacto1);
		agendita.registrarContacto(contacto2);
		
		//Se muestran los contactos
		agendita.listarContactos();
		
		//Busca los contactos
		agendita.buscarContacto("Henry");
		
		//Muestra los contactos disponibles
		System.out.println("Contactos Disponibles: "+ agendita.disponibles());

	}

}
