public class Principal {

    public static void main(String[] args) {
        PilhaDinamica pilha = new PilhaDinamica();
        No novoElemento = new No("A");
        pilha.empilhar(novoElemento);
        novoElemento = new No("B",null);
        pilha.empilhar(novoElemento);
        pilha.empilhar(new No("C"));
        pilha.empilhar(new No("D", null));
        pilha.imprimir();
        No removido = pilha.desempilhar();
        System.out.println("O elemento removido foi: " + removido.getData());
        removido = pilha.desempilhar();
        System.out.println("O elemento removido foi: " + removido.getData());
        pilha.empilhar(new No("Z"));
        pilha.imprimir();

    }
}
