import java.util.ArrayList;

public class ShoppingSite {
    private final String storeName;
    private ArrayList<VideoGame> gameList = new ArrayList<VideoGame>();
    private static int totalGameStock = 0;

    public ShoppingSite(String storeName) {
        this.storeName =storeName;
    }

    public String getStoreName() {
        return storeName;
    }



    public void addVideoGame(VideoGame videoGame) {
        gameList.add(videoGame);
        totalGameStock += videoGame.getGameStock();
    }

    public static int getTotalGameStock() {
        return totalGameStock;
    }

    public ArrayList<VideoGame> getGameList() {
        return gameList;
    }
}
