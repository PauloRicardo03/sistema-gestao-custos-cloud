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
}
