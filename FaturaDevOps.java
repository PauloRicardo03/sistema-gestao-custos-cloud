package GestãodeCustosCloud;

public class FaturaDevOps {
private String mesReferencia;
private double valorTotalFatura;

 public FaturaDevOps(String mesReferencia, double valorTotalFatura) {
    this.mesReferencia = mesReferencia;
    this.valorTotalFatura = valorTotalFatura;
 }
 public FaturaDevOps(String mesReferencia) {
     this(mesReferencia,0);
 }

    public String getMesReferencia() {
        return mesReferencia;
    }

    public void setMesReferencia(String mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    public double getValorTotalFatura() {
        return valorTotalFatura;
    }

    public void setValorTotalFatura(double valorTotalFatura) {
        this.valorTotalFatura = valorTotalFatura;
    }
    public void adicionarCustoServidor(ServidorNuvem servidor){
     this.valorTotalFatura+=servidor.calcularCustoTotal();
    }

}
