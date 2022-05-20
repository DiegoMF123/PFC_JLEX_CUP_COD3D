package Codigo_3_Direcciones;

/**
 * Clase sencilla para poder sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se puedan cconsideren necesarios para generar el mismo.
 * @author Diego_MF
 */
public class NodoCodigo3Direcciones {
    private String cad;

    public NodoCodigo3Direcciones(String cad) {
        this.cad = cad;
    }
    
    public String getCad(){
        return cad;
    }
        
}
