import java.util.*;

/**
    Definicao do tipo usuario
*/
class Usuario {
    // atributos
    private String nome;
    private String email;
    private String senha;
    private int id;

    /**
        Construtores da classe
    */
    public Usuario() {
        nome = "";
        email = "";
        senha = "";
        id = 0;
    } // end Usuario()

    /**
        Metodos gets() e sets()
    */
    public void setNome(String nome) {
        this.nome = nome;
    } // end setNome()

    public String getNome() {
        return nome;
    } // end getNome()
    
    public void setEmail(String email) {
        this.email = email;
    } // end setEmail()

    public String getEmail() {
        return email;
    } // end getEmail()

    public void setSenha(String senha) {
        this.senha = senha;
    } // end setSenha()

    public String getSenha() {
        return senha;
    } // end getSenha()

    public void setId(int id) {
        this.id = id;
    } // end setId()

    public int getId() {
        return id;
    } // end getId()

    /**
        cadastrar_Usuario() - funcao para cadastrar novo Usuario
    */
    public void cadastrar_Usuario() {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        String email = sc.nextLine();
        String senha = sc.nextLine();
        int id = sc.nextInt();
        sc.nextLine();

        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.id = id;
    } // end cadastrar_Usuario()

    /**
        login_Usuario() - funcao que verifica se o login do usuario esta correto
        @param email - email que vai ser verificado
        @param senha - senha que sera verificada
        @return - valor booleano se o login foi feito corretamente ou nao
    */
    public boolean login_Usuario(String email, String senha) {
        boolean resp = false;
        if(this.senha == senha) {
            if(this.email == email) {
                resp = true;
            }
        }
        return resp;
    } // end login_Usuario()

} // end Usuario

/**
    Definicao do tipo produto
*/
class Produto {
    // atributos
    private String nome;
    private int id;
    private double preco;
    private int quantidade;
    private int id_Usuario;
    // private byte[] imagem;
    private int id_Categoria;

    /**
        Contrutores da classe
    */
    public Produto() {
        nome = "";
        id = 0;
        preco = 0.0;
        quantidade = 0;
        id_Usuario = 0;
        id_Categoria = 0;
    } // end Produto()

    /**
        Metodos gets() e sets()
    */
    public void setNome(String nome) {
        this.nome = nome;
    } // end setNome()

    public String getNome() {
        return nome;
    } // end getNome()

    public void setId(int id) {
        this.id = id;
    } // end setId()

    public int getId() {
        return id;
    } // end getId()

    public void setPreco(double preco) {
        this.preco = preco;
    } // end setPreco()

    public double getPreco() {
        return preco;
    } // end getPreco()

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    } // end setQuantidade()

    public int getQuantidade() {
        return quantidade;
    } // end getQuantidade()

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    } // end setId_Usuario()

    public int getId_Usuario() {
        return id_Usuario;
    } // end getId_Usuario()

    public void setId_Categoria(int id_Categoria) {
        this.id_Categoria = id_Categoria;
    } // end setId_Categoria()

    public int getId_Categoria() {
        return id_Categoria;
    } // end getId_Categoria()

    /**
        cadastrar_Produto() - funcao que realiza cadastro de novo produto
    */
    public void cadastrar_Produto() {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        int id = sc.nextInt();
        sc.nextLine();
        double preco = sc.nextDouble();
        sc.nextLine();
        int quantidade = sc.nextInt();
        sc.nextLine();
        int id_Usuario = sc.nextInt();
        sc.nextLine();
        int id_Categoria = sc.nextInt();
        sc.nextLine();

        this.nome = nome;
        this.id = id;
        this.preco = preco;
        this.quantidade = quantidade;
        this.id_Usuario = id_Usuario;
        this.id_Categoria = id_Categoria;
    } // end cadastrar_Produto()

    /**
       Mostrar produto() - funcao para mostrar conteudo do produto
    */
    public void mostrarProduto() {
        System.out.println("Produto:");
        System.out.println(nome);
        System.out.println(id);
        System.out.println(preco);
        System.out.println(quantidade);
        System.out.println(id_Usuario);
        System.out.println(id_Categoria);
    }

} // end Produto

class Categorias extends Produto {
    // atributos
    private int id;
    private String nome;
    /**
        Construtores da classe
    */
    Categorias() {
        id = 0;
        nome = "";
    } // end Categorias()
    /**
        Metodos Gets e Sets
    */
    public void setId(int id) {
        this.id = id;
    } // end setId()
    public int getId() {
        return id;
    } // end getId()
    public void setNome(String nome) {
        this.nome = nome;
    } // end setNome()
    public String getNome() {
        return nome;
    } // end getNome()
}


class teste {
    public static void main(String args[]) {
        System.out.println("Hello World!");
    }
}