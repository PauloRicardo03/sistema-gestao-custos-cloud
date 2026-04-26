

#  Cloud FinOps Simulator | Gestão de Custos de Infraestrutura

Um simulador em Java focado na consolidação e cálculo de faturamento de instâncias em nuvem. Este projeto aplica princípios de **FinOps (Cloud Financial Management)** para demonstrar como o controle de custos e a alocação de recursos podem ser traduzidos em regras de negócio robustas através da Programação Orientada a Objetos.

##  O Problema que este projeto resolve
À medida que as infraestruturas de nuvem (AWS, GCP, Azure) escalam, o desperdício de recursos torna-se um risco crítico. Este sistema simula o motor de cálculo por trás de uma fatura de nuvem (Cloud Billing), processando múltiplas instâncias de servidores, contabilizando horas de uso e aplicando regras de desconto para uso intensivo, garantindo precisão na consolidação financeira.

##  Tecnologias e Arquitetura

* **Linguagem:** Java 25
* **Paradigma:** Programação Orientada a Objetos (POO)
* **Padrões de Projeto & Boas Práticas:**
    * **Separação de Responsabilidades (SoC):** Divisão clara entre as classes de Entidade/Modelo (`ServidorNuvem`, `FaturaDevOps`) e a camada de execução (`SistemaFinOps`).
    * **Encapsulamento Financeiro:** Cálculos matemáticos isolados em métodos de negócio puros, garantindo que as classes de modelo trafeguem apenas dados estruturados, sem interferência de formatação visual (UI).
    * **Comunicação entre Objetos:** A classe `FaturaDevOps` consome diretamente as instâncias de `ServidorNuvem`, extraindo sua inteligência de cálculo individual para consolidar o montante final.
    * **Sobrecarga de Construtores:** Flexibilidade na criação de instâncias de servidores com diferentes níveis de parametrização.

##  Funcionalidades Core

1.  **Instanciamento de Servidores:** Simulação de máquinas virtuais com definição de IP, tipo de instância (ex: instâncias G5 focadas em performance) e custo por hora.
2.  **Motor de Regras de Negócio:** Aplicação automatizada de políticas de desconto (ex: 10% de redução para servidores com uso contínuo acima de 500 horas/mês).
3.  **Consolidação de Fatura:** Agrupamento de todos os recursos processados em um único ciclo de faturamento mensal.

##  Exemplo de Uso (Código)

A inteligência central do sistema ocorre na integração entre a Fatura e o Servidor, isolando a regra de desconto da camada de execução:

```java
// Dentro da classe FaturaDevOps.java
public void adicionarCustoServidor(ServidorNuvem servidor) {
    double custo = servidor.calcularCustoTotal();
    
    // Regra de FinOps: Desconto para instâncias de uso intensivo
    if (servidor.getHorasLigado() > 500) {
        custo *= 0.90; // Aplica 10% de desconto
    }
    this.valorTotalFatura += custo;
}
```

##  Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git
   ```
2. Abra o projeto em sua IDE de preferência (IntelliJ IDEA, Eclipse, VS Code).
3. Navegue até o pacote `GestãodeCustosCloud` e execute a classe principal `SistemaFinOps.java`.
4. O console exibirá o processamento das instâncias e o valor total da fatura formatado.

---
*Desenvolvido com foco em Engenharia de Software, Arquitetura Limpa e Inteligência Financeira aplicada à TI.*
