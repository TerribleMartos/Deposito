package deposito;

/**
 * @author Eric Martos
 * @author Jorge Peris
 * @version 1.0.0
 * @since Deposito 1.0.0
 */
public class Deposito {

    //Campos de la clase
    private float diametro;
    private float altura;
    private String idDeposito;

    
    //Constructor sin parametros auxiliar
    
    /**
     * @since Deposito 1.0.0
     */
    
    public Deposito() { //Lo que hace es llamar al constructor con parametros pasandole valores vacios
        this(0, 0, "");
    } //Cierre del constructor

    /**
     * @param valor_diametro
     * @param valor_altura
     * @param valor_idDeposito
     * @since Deposito 1.0.0     
     */
    //Constructor de la clase que pide los parametros necesarios
    public Deposito(float valor_diametro, float valor_altura, String valor_idDeposito) {
        if (valor_diametro > 0 && valor_altura > 0) {
            diametro = valor_diametro;
            altura = valor_altura;
            idDeposito = valor_idDeposito;
        } else {
            diametro = 10;
            altura = 5;
            idDeposito = "000";
            System.out.println("Creado deposito con valores por defecto diametro 10 metros altura 5 metros id 000");
        }
    } //Cierre del constructor

    /**
     * @param valor_idDeposito
     * @param valor_diametro
     * @param valor_altura
     * @since Deposito 1.0.0
     */
    public void setValoresDeposito(String valor_idDeposito, float valor_diametro, float valor_altura) {
        idDeposito = valor_idDeposito;
        diametro = valor_diametro;
        altura = valor_altura;
        if (idDeposito != "" && valor_diametro > 0 && valor_altura > 0) {
        } else {
            System.out.println("Valores no admisibles. No se han establecido valores para el deposito");
            //Deposito (0.0f, 0.0f, ""); Esto no es posible. Un constructor no es un metodo y por tanto no podemos llamarlo
            idDeposito = "";
            diametro = 0;
            altura = 0;
        }
    } //Cierre del metodo

    /**
     * @return diametro
     * @since Deposito 1.0.0
     */
    public float getDiametro() {
        return diametro;
    } //Meodo de acceso

    /**
     * @return altura
     * @since Deposito 1.0.0
     */
    public float getAltura() {
        return altura;
    } //Metodo de acceso

    /**
     * @return IdDeposito
     * @since Deposito 1.0.0
     */
    public String getIdDeposito() {
        return idDeposito;
    } //Metodo de acceso

    /**
     * Si no incluimos la f el compilador considera que 3.1416 es double
     * @return La capacidad del diametro
     * @since Deposito 1.0.0
     */
    public float valorCapacidad() { //Metodo tipo funcion
        float capacidad;
        float pi = 3.1416f; //Si no incluimos la f el compilador considera que 3.1416 es double
        capacidad = pi * (diametro / 2) * (diametro / 2) * altura;
        return capacidad;
    }
}
