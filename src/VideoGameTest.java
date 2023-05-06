public class VideoGameTest {
    public static void main(String[] args) {
        ShoppingSite shoppingSite = new ShoppingSite("Game Center");

        VideoGame game1 = new VideoGame("FIFA 22", 700, 40, VideoGame.gameTypeList.Sports.toString());
        VideoGame game2 = new VideoGame("GTA V", 500, 30, VideoGame.gameTypeList.Simulation.toString());

        shoppingSite.addVideoGame(game1);
        shoppingSite.addVideoGame(game2);

        System.out.printf("Name of the game store: %s %n", shoppingSite.getStoreName());
        System.out.printf("Name of the game: %s %n", game1.getGameName());
        System.out.printf("Price of the game: %d TL %n", game1.getGamePrice());
        System.out.printf("Type of the game: %s %n", game1.getGameType());
        System.out.printf("Total game stock of the shopping site: %d %n", ShoppingSite.getTotalGameStock());
    }
}
