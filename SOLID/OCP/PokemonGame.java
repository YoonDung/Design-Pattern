package SOLID.OCP;

public class PokemonGame {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu("피카츄", 5, 150);
        Charizard charizard = new Charizard("리자몽", 10, 300);
        System.out.println("\n");

        pikachu.attack();
        charizard.attack();
        System.out.println("\n");

        pikachu.evovle();
        System.out.println("\n");
        charizard.evovle();
    }
}