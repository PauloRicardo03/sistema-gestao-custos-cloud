package GestãodeCustosCloud;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaFinOps {
    static boolean verificaServidor(ArrayList<ServidorNuvem> servidores, String idProcurado){
        for (ServidorNuvem servidor : servidores) {
            if (servidor.getId().equals(idProcurado)){
                return true;
            }
        }
        return false;
    }
    static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);
        ArrayList<ServidorNuvem> servidores= new ArrayList<>();
        System.out.println("Digite a data da fatura:");
        String data= entrada.next();
        FaturaDevOps fatura= new FaturaDevOps(data);
        while (true){
            System.out.println("Oque deseja fazer? ");
            System.out.println("1-Adicionar Servidor completo");
            System.out.println("2-adicionar Servidor Simples");
            System.out.println("3-Conferir a fatura total");
            System.out.println("4-Sair");
            int opcao= entrada.nextInt();
            if (opcao==1) {

                System.out.println("Digite o nome do servidor");
                String id = entrada.next();

                if (verificaServidor(servidores,id)){
                    System.out.println("==========================================");
                    System.out.println("Este servidor ja existe");
                    System.out.println("==========================================");
                    continue;
                }

                System.out.println("Digite o tipo de servidor");
                String tipoInstancia = entrada.next();
                System.out.println("Digite o custo por hora");
                double custoPorHora = entrada.nextDouble();
                System.out.println("Digite o numero de horas ligadas");
                int horasLigado = entrada.nextInt();
                ServidorNuvem servidor =new ServidorNuvem(id,tipoInstancia,custoPorHora,horasLigado);
                servidores.add(servidor);

            }else if (opcao==2) {
                System.out.println("Digite o id do servidor");
                String id = entrada.next();

                if (verificaServidor(servidores,id)){
                    System.out.println("==========================================");
                    System.out.println("Este servidor ja existe");
                    System.out.println("==========================================");
                    continue;
                }

                System.out.println("Digite o tipo de servidor");
                String tipoInstancia = entrada.next();
                ServidorNuvem servidor =new ServidorNuvem(id,tipoInstancia);
                System.out.println("Digite o custo por hora");
                servidor.setCustoPorHora(entrada.nextDouble());
                System.out.println("Digite o numero de horas ligadas");
                servidor.setHorasLigado(entrada.nextInt());
                servidores.add(servidor);
            }

            else if (opcao==3) {
                fatura.setValorTotalFatura(0);
                for (ServidorNuvem servidor : servidores) {
                    fatura.adicionarCustoServidor(servidor);
                }
                System.out.println("O valor total da fatura é: "+fatura.getValorTotalFatura());
            }else if (opcao==4) {
                System.out.println("Saindo do sistema");
                break;
            }else{
                System.out.println("Opcao invalida");
            }

        }


       /* FaturaDevOps fatura= new FaturaDevOps("04/2026");
        ArrayList<ServidorNuvem> servidores= new ArrayList<>();
        servidores.add(new ServidorNuvem("192.168.1.1","G5",100,1000));
        servidores.add(new ServidorNuvem("192.168.1.2","G5",150,100));
        ServidorNuvem s3 = new ServidorNuvem("192.168.1.3", "G5");
        s3.setCustoPorHora(200);
        s3.setHorasLigado(150);
        servidores.add(s3);
        */

       }


    }

