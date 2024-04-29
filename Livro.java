public class Livro{

  public String titulo;
  public String autor;
  public int anoPublicacao;
  public int qtd;
  public boolean disponivel;
 

  public Livro(){

  }

  public Livro(int anoPublicacao, String autor, String titulo, int qtd, boolean disponivel) {

    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
    this.qtd = qtd;
    this.disponivel = true; 
  }
  
  public Livro(String titulo, String autor, int anoPublicacao, int qtd) {

  this.titulo = titulo;
  this.autor = autor;
  this.anoPublicacao = anoPublicacao;
  this.qtd = qtd;
    
  }
 
  public boolean isDisponivel(){
    if(this.qtd>0){
      return this.disponivel = true;
      }
    else {
    return this.disponivel = false;
    }
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
