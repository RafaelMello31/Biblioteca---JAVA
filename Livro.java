public class Livro{

  private String titulo;
  private String autor;
  private int anoPublicacao;
  private int qtd;
  private boolean disponivel;
 

  public Livro(){

  }
 
  public Livro(String titulo, String autor, int anoPublicacao, int qtd) {

  this.titulo = titulo;
  this.autor = autor;
  this.anoPublicacao = anoPublicacao;
  this.qtd = qtd;
    
  }
 
  public boolean isDisponivel(){
    return this.qtd>0;
  }

  public void setDisponivel(boolean disponivel){
    this.disponivel = disponivel;
  }
  
  public void setTitulo(String titulo){

    this.titulo = titulo;
  }

  public String getTitulo(){

    return this.titulo;
  }

  public void setAutor(String autor){

    this.autor = autor;

  }

  public String getAutor(){

    return this.autor;
  }

  public void setAno(int anoPublicacao){

    this.anoPublicacao = anoPublicacao;

  }

  public int getAno(){

    return this.anoPublicacao;
  }

  public void setQtd(int qtd){

    this.qtd = qtd;
  }

  public int getQtd(){

    return this.qtd;
  }

  public void tiraLivro(){

    this.qtd = this.qtd-1; 
  
  }

  public void poemLivro(){
    this.qtd = this.qtd+1;
  }

}
