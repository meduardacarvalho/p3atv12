package classes;

public class ItemBiblioteca {
    private String titulo;
    private int anodepublicação;
    private int numcopias;
    private int dataDevolucao;
    private int dataLimite;

    public ItemBiblioteca(String titulo, int dataLimite, int anodepublicação, int numcopias, int dataDevolucao) {
        this.titulo = titulo;
        this.anodepublicação = anodepublicação;
        this.numcopias = numcopias;
        this.dataDevolucao = dataDevolucao;
        this.dataLimite = dataLimite;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getAnoPublicacao() {
        return this.anodepublicação;
    }

    public int getNumCopias() {
        return this.numcopias;
    }


 public void emprestar() {
    if (numcopias > 0) {
        numcopias--;
        System.out.println("item emprestado.");
    } else{
        System.out.println("item não disponivel. tente novamente outro dia");
    }

 } 
 public void devolver() {
numcopias++;
System.out.println("item devolvido com sucesso.");
 }

public boolean estaAtrasado() {
        return dataDevolucao > dataLimite;
    }

    public void calculomulta(double valorMultaPorDia) {
        if (estaAtrasado()) {
            int diasAtraso = dataDevolucao - dataLimite;
            double multa = diasAtraso * valorMultaPorDia;
            System.out.println("Multa a ser paga: " + multa);
        } else {
            System.out.println("Não está atrasado. Sem multa.");
        }
    
    }
}