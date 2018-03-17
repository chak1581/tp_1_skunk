import java.util.ArrayList;
import java.util.List;

public class Match {

	int matchNo;
	Player[] player;
	List playerList = new ArrayList();

	public List getPlayerList() {
		return playerList;
	}

	public void setPlayerList(List playerList) {
		this.playerList = playerList;
	}

	public Match(int matchNo, List playerList) {
		super();
		this.matchNo = matchNo;
		this.playerList = playerList;
	}

	public Match(int matchNo, Player[] player) {
		super();
		this.matchNo = matchNo;
		this.player = player;
	}

	public int getMatchNo() {
		return matchNo;
	}

	public void setMatchNo(int matchNo) {
		this.matchNo = matchNo;
	}

	public Player[] getPlayer() {
		return player;
	}

	public void setPlayer(Player[] player) {
		this.player = player;
	}

}
