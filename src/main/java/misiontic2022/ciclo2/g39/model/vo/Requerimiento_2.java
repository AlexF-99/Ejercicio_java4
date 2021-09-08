package misiontic2022.ciclo2.g39.model.vo;

public class Requerimiento_2 {
    

    //Atributos
    private String fecIni;
    private String nombreCiudad;
    private String nomConstructora;
    private String nombreLider;
    private Integer codigoIipo;
    private Integer estrato;

    public Requerimiento_2(){

    }

    public Requerimiento_2(String fecIni, String nombreCiudad, String nomConstructora, String nombreLider, Integer codigoIipo, Integer estrato){

        this.fecIni = fecIni;
        this.nombreCiudad = nombreCiudad;
        this.nomConstructora = nomConstructora;
        this.nombreLider = nombreLider;
        this.codigoIipo = codigoIipo;
        this.estrato = estrato;


    }

    
    public Integer getEstrato() {
        return estrato;
    }
    public String getFecIni() {
        return fecIni;
    }
    public void setFecIni(String fecIni) {
        this.fecIni = fecIni;
    }
    public String getNombreCiudad() {
        return nombreCiudad;
    }
    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
    public String getNomConstructora() {
        return nomConstructora;
    }
    public void setNomConstructora(String nomConstructora) {
        this.nomConstructora = nomConstructora;
    }
    public String getNombreLider() {
        return nombreLider;
    }
    public void setNombreLider(String nombreLider) {
        this.nombreLider = nombreLider;
    }
    public Integer getCodigoIipo() {
        return codigoIipo;
    }
    public void setCodigoIipo(Integer codigoIipo) {
        this.codigoIipo = codigoIipo;
    }
    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }


   
}
