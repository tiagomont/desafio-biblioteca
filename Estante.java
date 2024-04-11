public class Estante
{
  private Livro titulo;
  public Livro[] livros;

  public Estante(livro titulo, livro Livro[])
  {
    this.titulo = titulo;
  }

  public String getTitulo()
  {
    return titulo;
  }

  public void setTitulo(Livro livro)
  {
    this.titulo = livro.getTitulo();
  }

  public void adicionarLivro(Livro livro){
    livros.add(livro);
  }

  public livro[] getLivros() {
    return livros;
  }
}