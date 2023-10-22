package classes;

public class dvd extends ItemBiblioteca{
    private double minutos;

public dvd(String titulo, int anodepublicação, int numcopias, int dataDevolucao, int dataLimite) {
        super(titulo, anodepublicação, numcopias, dataDevolucao, dataLimite);
        this.minutos = minutos;
    }

public double getMinutos() {
    return this.minutos;
}

public void setMinutos(double minutos) {
    this.minutos = minutos;
} 
public void calcularMulta(double valorMultaPorDia, int dataDevolucao, int dataLimite) { 

        if (estaAtrasado()) {
            int diasAtraso = dataDevolucao - dataLimite;
            double multa = diasAtraso * valorMultaPorDia;
            System.out.println("Multa do livro: " + multa + " reais");
        } else {
            System.out.println("Não está atrasado. Sem multa para o dvd.");
        }
    }

public int getDataLimite() {
    return 0;
}

public int getDataDevolucao() {
    return 0;
}
    
}
