package classes;

public class Main {
    public static void main(String[] args) {
        double multaLivros = 2.0;
        double multaDVD = 3.0;
        double multaRevista = 4.0;

        
        Livro livro = new Livro("Livro A", 20231015, 2000, "Autor A", 20231010, 20231025);

        
        dvd dvd = new dvd("DVD B", 20231015, 3, 20231010, 20231020);

   
        Revista revista = new Revista("Revista C", 20231015, 10, "Edição 1", 20231010, 20231030);

        livro.emprestar();
        dvd.emprestar();
        revista.emprestar();

        livro.devolver();
        dvd.devolver();
        revista.devolver();


        livro.calcularMulta(multaLivros, livro.getDataLimite(), livro.getDataDevolucao());
        dvd.calcularMulta(multaDVD, dvd.getDataLimite(), dvd.getDataDevolucao());
        revista.calcularMulta(multaRevista, revista.getDataLimite(), revista.getDataDevolucao());
    }
}

