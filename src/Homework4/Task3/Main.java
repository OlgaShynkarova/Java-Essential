package Homework4.Task3;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        player.play();
        player.pause();
        player.stop();
        player.record();
        System.out.println("-------------------");
        Playable player1 = new Player();
        player1.play();
        player1.pause();
        player1.stop();
        System.out.println("-------------------");
        Recordable player2 = new Player();
        player2.record();
        player2.pause();
        player2.stop();
    }
}