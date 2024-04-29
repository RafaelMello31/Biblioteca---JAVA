public class Main{

  public static void main(String[] args){

    Biblioteca b1 = new Biblioteca();
        
    Livro l1 = new Livro("Jogos Vorazes", "Autor 1", 1928, 2);
    Livro l2 = new Livro("Jurassic Park", "Autor 2", 1990, 1);
    Livro l3 = new Livro("Homem das cavernas", "Autor 3", 2005, 0);

    b1.adicionaLivro(l1);;
    b1.adicionaLivro(l2);
    b1.adicionaLivro(l3);

    b1.emprestaLivro(l1);
    b1.emprestaLivro(l2);
    b1.emprestaLivro(l3);

    b1.devolveLivro(l1);
    b1.devolveLivro(l2);
    b1.devolveLivro(l3);

    b1.poemLivro(l1);
    b1.poemLivro(l2);
    b1.poemLivro(l3);

    b1.tiraLivro(l1);
    b1.tiraLivro(l2);
    b1.tiraLivro(l3);

    b1.mostraLivros();
    
    
  }
  
}
