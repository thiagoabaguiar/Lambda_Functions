package classes;

public class Principal {
    public static void main(String[] args) {
        
        OrdenacaoPessoa minhaLista = new OrdenacaoPessoa();        
        
        minhaLista.add("Thiago", 37, 1.80d);
        minhaLista.add("Filipe", 4, 1.01d);
        minhaLista.add("Jéssica", 31, 1.62d);
        minhaLista.add("Cido", 65, 1.78d);
        minhaLista.add("Augusta", 61, 1.60d);
        
        System.out.println(minhaLista);
        System.out.println(minhaLista.ordenarPorAltura());
        System.out.println(minhaLista);
        
    }
}
