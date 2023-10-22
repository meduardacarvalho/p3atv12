package classes;

public class Livro extends ItemBiblioteca {
    private String autor;

    

    public Livro(String titulo, int anodepublicação, int numcopias, String autor, int dataDevolucao, int dataLimite) {
        super(titulo, anodepublicação, numcopias, dataDevolucao, dataLimite);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void calcularMulta(double valorMultaPorDia, int dataLimite, int dataDevolucao) {
        if (estaAtrasado()) {
         
            int diasAtraso = dataDevolucao - dataLimite;
            double multa = diasAtraso * valorMultaPorDia;
            System.out.println("Multa do livro: " + multa + " reais");
        } else {
            System.out.println("Não está atrasado. Sem multa para o livro.");
        }
    }

    public int getDataLimite() {
        return 0;
    }

    public int getDataDevolucao() {
        return 0;
    }
    
}
