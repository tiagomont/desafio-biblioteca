public class Emprestimo{

    private String data;
    private String livro;
    private ItemEmprestimo dataDevolucao;
    private Usuario usuario;
    
    //TA PUXANDO DO ItemEmprestimo
    public void setDataDevolucao() {
      this.dataDevolucao = new ItemEmprestimo();
    }
    
    public void setData(String data){
      this.data = data;
    }
    public void addLivro(livro livro){
      this.livro = livro;
    }
  
    public Usuario getUsuario(){
      return usuario.getLogin();
    }
  }