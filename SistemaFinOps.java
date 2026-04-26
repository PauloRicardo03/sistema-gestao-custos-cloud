package GestãodeCustosCloud;

import java.util.ArrayList;

public class SistemaFinOps {
    static void main(String[] args) {
        FaturaDevOps fatura= new FaturaDevOps("04/2026");
        ArrayList<ServidorNuvem> servidores= new ArrayList<>();
        servidores.add(new ServidorNuvem("192.168.1.1","G5",100,1000));
        servidores.add(new ServidorNuvem("192.168.1.2","G5",150,100));
        ServidorNuvem s3 = new ServidorNuvem("192.168.1.3", "G5");
        s3.setCustoPorHora(200);
        s3.setHorasLigado(150);
        servidores.add(s3);

       for (ServidorNuvem servidor:servidores){
           fatura.adicionarCustoServidor(servidor);
       }
        System.out.println("---------------------------------------------");
        System.out.println("Custo total da fatura: R$ "+fatura.getValorTotalFatura()+"");
        System.out.println("---------------------------------------------");

    }
}
