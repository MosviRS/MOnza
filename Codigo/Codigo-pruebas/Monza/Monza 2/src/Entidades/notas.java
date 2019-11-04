package Entidades;

public class notas extends info_productos {

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the abono
     */
    public double getAbono() {
        return abono;
    }

    /**
     * @param abono the abono to set
     */
    public void setAbono(double abono) {
        this.abono = abono;
    }

    /**
     * @return the entrega
     */
    public int getEntrega() {
        return entrega;
    }

    /**
     * @param entrega the entrega to set
     */
    public void setEntrega(int entrega) {
        this.entrega = entrega;
    }

    /**
     * @return the no_nota
     */
    public String getNo_nota() {
        return no_nota;
    }

    /**
     * @param no_nota the no_nota to set
     */
    public void setNo_nota(String no_nota) {
        this.no_nota = no_nota;
    }

    /**
     * @return the poductos
     */
    public String getPoductos() {
        return poductos;
    }

    /**
     * @param poductos the poductos to set
     */
    public void setPoductos(String poductos) {
        this.poductos = poductos;
    }

    protected double total;

    protected double abono;

    protected int entrega;

    protected String no_nota;

    protected String poductos;
}
