package taller3.televisores;

public class TV {
    static int numTV;
    Control control;
    Marca marca;
    int canal = 1;
    int precio = 500;
    int volumen = 1;
    boolean estado;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        TV.numTV++;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if( this.estado && 1 <= canal && canal <= 120 ){
            this.canal = canal;
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if( this.estado && 0 <= volumen && volumen <= 7 ){
            this.volumen = volumen;
        }
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }
    public void turnOn(){
        this.estado = true;
    }
    public void turnOff(){
        this.estado = false;
    }
    public void canalUp(){
        if( !this.estado || this.canal == 120 ){
            return;
        }
        ++this.canal;
    }
    public void canalDown(){
        if( !this.estado || this.canal == 1 ){
            return;
        }
        --this.canal;
    }
    public void volumenUp(){
        if( !this.estado || this.volumen == 7 ){
            return;
        }
        ++this.volumen;
    }
    public void volumenDown(){
        if( !this.estado || this.volumen == 0 ){
            return;
        }
        --this.volumen;
    }

}
