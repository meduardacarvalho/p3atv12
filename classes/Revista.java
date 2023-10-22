package classes;

public class Revista extends ItemBiblioteca{
    private String edicao;

    public Revista(String titulo, int anodepublicação, int numcopias, String edicao, int dataDevolucao, int dataLimite) {
        super(titulo, anodepublicação, numcopias, dataDevolucao, dataLimite);
        this.edicao = edicao;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    public void calcularMulta(double valorMultaPorDia, int dataLimite, int dataDevolucao) {
        if (estaAtrasado()) {
         
            int diasAtraso = dataDevolucao - dataLimite;
            double multa = diasAtraso * valorMultaPorDia;
            System.out.println("Multa do livro: " + multa + " reais");
        } else {
            System.out.println("Não está atrasado. Sem multa para o revista.");
        }
    }

    public int getDataLimite() {
        return 0;
    }

    public int getDataDevolucao() {
        return 0;
    }
}
