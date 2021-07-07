package utp.misiontic2022.c2.p17.ejercicios;

public final class Cliente extends Persona {
    // Atributos
    private String telefono;

    // Constructores
    public Cliente() {
        super();
        this.telefono = "000-00-00";
    }

    public Cliente(String pNombre, Integer pEdad, String pTelefono) {
        super(pNombre, pEdad);
        this.telefono = pTelefono;
    }

    // Metodos
    @Override
    public void mostrar(){
        System.out.println("------InfoCliente------");
        System.out.printf("Nombre del cliente: %s", getNombre());
        System.out.printf("Edad del cliente: %d", getEdad());
        System.out.printf("Telefono del cliente: %s", this.telefono);
    }
}
