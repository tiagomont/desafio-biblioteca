class Biblioteca 
{
    public static void main(String[] args) {
        Livro livro1 = new Livro(78454744, "Senhor dos Anéis");
        Livro livro2 = new Livro(78454744, "Harry Potter");
        
        Estante ficcao = new Estante("Fantasia");
        fantasia.addLivro(livro1);
        fantasia.addLivro(livro2);
        
        
        Autor a1 = new Autor("Peter Jackson");
        Autor a2 = new Autor("J.K. Rowling");

        Usuario u1 = new Usuario("João", "123");
        Usuario u2 = new Usuario("Maria", "456");

        System.out.println("Estante: " + ficcao.getTitulo());
        System.out.println("Livros: " + ficcao.getLivros());
        System.out.println("Livro: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor().getNome());
        System.out.println("Pessoa que pegou emprestado: " + emprestimo.getLogin());
        System.out.println("Data devolução: " + itemEmprestimo.getDataDevolucao());
    }
}