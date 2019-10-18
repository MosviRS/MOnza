package Entidades;

public class Usuario {

    /**
     * @return the nombreusu
     */
    public String getNombreusu() {
        return nombreusu;
    }

    /**
     * @param nombreusu the nombreusu to set
     */
    public void setNombreusu(String nombreusu) {
        this.nombreusu = nombreusu;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the respuesta
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * @return the pregunta
     */
    public int getPregunta() {
        return pregunta;
    }

    /**
     * @param pregunta the pregunta to set
     */
    public void setPregunta(int pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
   public Usuario(){
       
   }
    private String nombreusu;

    private String password;

    private String respuesta;

    private int pregunta;

    private int tipo;
}
