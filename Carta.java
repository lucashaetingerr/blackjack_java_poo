package blackjack;

public class Carta {
    private final NaipeCarta naipe;
    private final NomeCarta nomeCarta;

    public Carta(NaipeCarta naipe, NomeCarta nomeCarta) {
        this.naipe = naipe;
        this.nomeCarta = nomeCarta;
    }

    // Getters

    public NaipeCarta getNaipe() {
        return naipe;
    }

    public NomeCarta getNomeCarta() {
        return nomeCarta;
    }

    public int getValor() {
        return nomeCarta.getValor();
    }

    // Sobrescrita do toString() para exibir o nome da carta e seu valor
    @Override
    public String toString() {
        String str = nomeCarta.getNome() +" de "+ naipe.toString() + " (Valor: "+ getValor();
        if (nomeCarta == NomeCarta.A) {
            str += " ou 11";
        }
        str += ")";

        return str;
    }
}
