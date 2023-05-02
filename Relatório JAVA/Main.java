import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Main {
  public static void main(String[] args) {
    List<Gasto> gastos = new ArrayList<>();
    gastos.add(new Gasto("Celesc", new Date(), 140.0, "Cartão de Crédito"));
    gastos.add(new Gasto("Cinema", new Date(), 60.0, "PIX"));
    gastos.add(new Gasto("Mercado", new Date(), 600.0, "Dinheiro"));
    gastos.add(new Gasto("Gasolina", new Date(), 200.0, "Cartão de Débito"));
    gastos.add(new Gasto("Roupas", new Date(), 450.0, "PIX"));
    gastos.add(new Gasto("Presentes", new Date(), 400.0, "Cartão de Crédito"));

    List<Ganho> ganhos = new ArrayList<>();
    ganhos.add(new Ganho("Salário", new Date(), 2500.0));
    ganhos.add(new Ganho("Freelance", new Date(), 1300.0));

    Relatorio relatorio = new Relatorio();
    relatorio.gerarRelatorioDespesas(gastos);
    relatorio.gerarRelatorioReceitas(ganhos);
    relatorio.gerarRelatorioSaldoMensal(ganhos, gastos);
  }
}