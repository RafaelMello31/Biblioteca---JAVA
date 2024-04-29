import java.util.ArrayList;
import java.util.List;  

public class Biblioteca {

  private List<Livro> livros;

   
  public Biblioteca(){
       this.livros = new ArrayList<Livro>();
  }

  public void adicionaLivro(Livro livro){

    livros.add(livro);
    
  }

  public void removeLivro(Livro livro){

    livros.remove(livro);
  }

  public boolean verificaDisponivel(Livro livro){

    return livro.isDisponivel();
  }

  public void emprestaLivro(Livro livro){

   if(livro.isDisponivel()){
      livro.tiraLivro();
      System.out.println("Livro emprestado: " + livro.getTitulo());
      }
    else {
      livro.setDisponivel(false);
      System.out.println("Livro indisponível");
      }
    }

    public void devolveLivro(Livro livro){
      
      livro.poemLivro();
      System.out.println("Livro devolvido: " + livro.getTitulo());
      
    }

    public void poemLivro(Livro livro){

      livro.poemLivro();
      System.out.println("Quantidade disponivel: " + livro.getQtd());
    }

    public void tiraLivro(Livro livro){

      livro.tiraLivro();
      System.out.println("Quantidade disponivel: " + livro.getQtd());      
    }

    public void mostraLivros(){
       
      System.out.println("\nLivros da biblioteca: ");
      
      for(int i=0; i<livros.size(); i++){
       System.out.println("\nLivro: " + livros.get(i).getTitulo() + "\nAutor: " + livros.get(i).getAutor() + "\nAno de lançamento: " + livros.get(i).getAno() +  "\nQuantidade disponivel: " + livros.get(i).getQtd());
      }
      
    }
   
  }
  
  
