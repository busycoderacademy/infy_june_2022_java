
class Player {

	private String name;
	private int noOfRuns;
	private int noOfWickets;

	private int rank;
	
	public int getRank() {
		return rank;
	}
	public String getName() {
		return name;
	}
	public int getNoOfRuns() {
		return noOfRuns;
	}
	public int getNoOfWickets() {
		return noOfWickets;
	}
	Player(String playerName, int noOfRunsByPlayer, int noOfWicketByPlayer, int rankPlayer) {
		name = playerName;
		noOfRuns = noOfRunsByPlayer;
		noOfWickets = noOfWicketByPlayer;
		rank = rankPlayer;
	}

	public void printPlayerDetails() {
		System.out.println("name: " + name + " noOfRunsByPlayer: " + noOfRuns + " no of wickets:" + noOfWickets
				+ " rank of player: " + rank);
	}

}

public class D_ArrayOfPlayer {

	public static void main(String[] args) {
		Player player1 = new Player("ravi", 2000, 12, 21);
		Player player2 = new Player("sumit", 6000, 92, 11);

		Player player3 = new Player("raj", 8000, 2, 10);
		Player player4 = new Player("kapil", 10000, 2, 2);

		Player players[] = new Player[4];

		players[0] = player1;
		players[1] = player2;
		players[2] = player3;
		players[3] = player4;

		// we want to print it

		
	

		//printAllPlayers(players);
		
		printDetailsOfHighestRankEmployee(players);
		
	}

	private static void printDetailsOfHighestRankEmployee(Player[] players) {
		
		int index=-1, maxRank=players[0].getRank();
		
		for(int i=0;i<players.length; i++) {
			if(players[i].getRank()< maxRank) {
				maxRank=players[i].getRank();
				index=i;
			}
		}
		players[index].printPlayerDetails();
	}

	private static void printAllPlayers(Player[] players) {
		for (Player player : players) {
			player.printPlayerDetails();
		}
	}
}
