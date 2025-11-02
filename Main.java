public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Criando Novo Produto ---");
        Produto teclado = new Produto("Teclado Mecânico", 550.00, 8);

        // TESTE DE LEITURA (GETTERS)

        System.out.println("\n--- Informações Iniciais ---");
        System.out.println("Produto:" + teclado.getNome());
        System.out.println("Preco: R$" + teclado.getPreco());

        // TESTE DE ALTERAÇÂO VÀLIDA (SETTER)

        System.out.println("\n--- Aplicando Desconto (Setter) ---");
        teclado.setPreco(499.90);
        System.out.println("Novo Preço: R$" + teclado.getPreco());

        // TESTE DE ALTERAÇÃO INVÁLIDA (O encapsulamento Protege)
        System.out.println("\n--- Tentando Preço Negativo ----");
        teclado.setPreco(-10.00); //Isso será bloqueado pelo SetPreco !
        System.out.println("Preço Apos Tentativa Inválida: R$" + teclado.getPreco());

        // TESTE DE MÉTODOS DE NEGÓCIO

        teclado.adicionarEstoque(5);
        System.out.println("Estoque Total:" + teclado.getEstoque() + "unidades.");
    }
    
}
