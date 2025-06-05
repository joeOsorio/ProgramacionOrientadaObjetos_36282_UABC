public class AsociacionUnaria{
    public static void main(String []args){
        Persona persona= new Persona("Jose0", "Mendez");
	TelefonoMovil telefonoMovil = new TelefonoMovil("6646053294");
	persona.setTelefonoMovil(telefonoMovil);

	System.out.printl(persona.toString());


    }
}


