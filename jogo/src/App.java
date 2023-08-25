public class App {
    public static void main(String[] args) throws Exception {
        var jogador1 = new Jogador();
        var jogador2 = new Jogador("Joao");

        System.out.println(jogador1.getHp());
        jogador1.receberDano(200);
        System.out.println(jogador1.getHp());
        jogador1.ganharExperiencia(-20);
        System.out.println(jogador1.getXp());
        if (jogador1.isEnvenenado()) 
            System.err.println("Envenenado");

    }
}
