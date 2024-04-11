public class Livro{
   
    private String isbn;
    private String titulo;
    private Autor autor;
    
    public Livro (String isbn, String titulo){
      this.isbn = isbn;
      this.titulo = titulo;
    }
     public String getIsbn(){
       return isbn;
     }
    
     public void setIsbn(String isbn){
       this.isbn = isbn;
     }
     public String getTitulo(){
       return titulo;
     }
  
     public String setTitulo(String titulo){
       this.titulo = titulo;
     }
  
     public void setAutor(Autor autor){
       this.autor = autor.getNome();
     }
  
  }