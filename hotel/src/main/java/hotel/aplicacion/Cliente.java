package hotel.aplicacion;

/**
 * Clase que representa a un cliente en el sistema del hotel.
 * Cada cliente tiene un código único, nombre, DNI y teléfono. El código se asigna de manera incremental
 * utilizando un contador estático que lleva un registro de los clientes creados.
 * Además, la clase valida el formato del DNI al momento de crear un cliente.
 * 
 * @author Josutpuk
 */
public class Cliente {
    
    /**
     * Contador estático que lleva un registro del número total de clientes creados.
     */
    private static int contadorClientes = 0;

    /**
     * Código único del cliente.
     */
    private int codigo;

    /**
     * Nombre del cliente.
     */
    private String nombre;

    /**
     * DNI del cliente.
     */
    private String dni;

    /**
     * Teléfono del cliente.
     */
    private String telefono;

    /**
     * Constructor de la clase Cliente que inicializa el nombre, DNI y teléfono del cliente.
     * Además, valida el DNI antes de crear el objeto.
     * 
     * @param nombre Nombre del cliente.
     * @param dni DNI del cliente.
     * @param telefono Teléfono del cliente.
     * @throws Exception Si el DNI proporcionado no es válido según la validación de la clase Utilidades.
     */
    public Cliente(String nombre, String dni, String telefono) throws Exception {
        // Validación del DNI, si no es correcto no creará el objeto
        Utilidades.validarDNI(dni); 
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.codigo = obtenerNumeroCliente();
    }

    /**
     * Obtiene el número total de clientes creados hasta el momento.
     * 
     * @return El número total de clientes creados.
     */
    public static int getContadorClientes() {
        return contadorClientes;
    }

    /**
     * Establece el valor del contador de clientes.
     * 
     * @param contadorClientes Nuevo valor del contador de clientes.
     */
    public static void setContadorClientes(int contadorClientes) {
        Cliente.contadorClientes = contadorClientes;
    }

    /**
     * Obtiene el código único del cliente.
     * 
     * @return El código del cliente.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Establece el código del cliente.
     * 
     * @param codigo Nuevo código del cliente.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el nombre del cliente.
     * 
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     * 
     * @param nombre Nuevo nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el DNI del cliente.
     * 
     * @return El DNI del cliente.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el DNI del cliente.
     * 
     * @param dni Nuevo DNI del cliente.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obtiene el teléfono del cliente.
     * 
     * @return El teléfono del cliente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el teléfono del cliente.
     * 
     * @param telefono Nuevo teléfono del cliente.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Incrementa el contador de clientes y devuelve el nuevo código único para el cliente.
     * 
     * @return El código único asignado al cliente.
     */
    private static int obtenerNumeroCliente() {
        contadorClientes++;
        return contadorClientes;
    }

    /**
     * Muestra la información completa del cliente en forma de cadena de texto.
     * 
     * @return Información del cliente, incluyendo código, nombre, DNI y teléfono.
     */
    public String mostrarInformacion() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", DNI: " + dni + ", Teléfono: " + telefono;
    }
}
