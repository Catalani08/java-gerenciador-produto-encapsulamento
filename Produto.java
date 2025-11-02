public class Produto {
    // Encapsulamento: Atributos privados
    // Só podem ser modificados por MÉTODOS desta classe 
    private String nome;
    private double preco;
    private int estoque;

    // Construtor: Inicializa o objeto
    public Produto (String nome, double preco, int estoque) {
        this.nome = nome;
        // Chamando o setter para garantir a validacao de preco
        setPreco(preco);
        this.estoque = estoque;
    }
    // Metodos Getters (Permitem a Leitura)
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }
    // Metodos Setters (Permitem a Alteração Controlada)

    // Setter de Preço com Validação
    public void setPreco(double novoPreco) {
        // Protege o objeto: só aceita valores positivos
        if (novoPreco > 0) {
            this.preco = novoPreco;

        } else {
            System.out.println("ERRO: O preco deve ser um valor positivo para ser atualizado");
        }
    }

    //Setter de Nome
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    // Exemplo de Método de Negócio que altera o estoque
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.estoque += quantidade;
            System.out.println(+ quantidade + " unidade adicionais.");

            
        }
    }
}
