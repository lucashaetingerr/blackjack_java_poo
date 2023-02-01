package blackjack;

// Enum para representar os quatro naipes
public enum NaipeCarta {
    PAUS, OUROS, COPAS, ESPADAS;

    // Retornar o nome do naipe apenas com a primeira letra maiúscula
    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
