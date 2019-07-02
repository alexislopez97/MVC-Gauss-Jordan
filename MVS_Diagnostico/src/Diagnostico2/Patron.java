package Diagnostico2;

public class Patron 
{
	
	public static void main(String[] args)
	{
		Vista vis = new Vista();
		Modelo mod = new Modelo();
		Controlador con = new Controlador(vis,mod);
		con.iniciarVista();
		
	}

}
