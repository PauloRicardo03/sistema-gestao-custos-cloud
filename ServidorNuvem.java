package GestãodeCustosCloud;

public class ServidorNuvem {
    private String ip;
    private String tipoInstancia;
    private double custoPorHora;
    private int horasLigado;

    public ServidorNuvem(String ip, String tipoInstancia, double custoPorHora, int horasLigado) {
        this.ip = ip;
        this.tipoInstancia = tipoInstancia;
        this.custoPorHora = custoPorHora>=0?custoPorHora:0;
        this.horasLigado = horasLigado>=0?horasLigado:0;
    }
    public ServidorNuvem(String ip, String tipoInstancia) {
        this(ip, tipoInstancia, 0.0, 0);
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTipoInstancia() {
        return tipoInstancia;
    }

    public void setTipoInstancia(String tipoInstancia) {
        this.tipoInstancia = tipoInstancia;
    }

    public double getCustoPorHora() {
        return custoPorHora;
    }

    public void setCustoPorHora(double custoPorHora) {
        this.custoPorHora = custoPorHora;
    }

    public int getHorasLigado() {
        return horasLigado;
    }

    public void setHorasLigado(int horasLigado) {
        this.horasLigado = horasLigado;
    }
    public double calcularCustoTotal(){
        return custoPorHora*horasLigado;
    }


}
