package videoplejer;

public class AudioControl extends Control {

	private boolean podesavanjeZvuka;

	public AudioControl(boolean podesavanjeZvuka) {

		super();

		this.podesavanjeZvuka = podesavanjeZvuka;

	}

	@Override

	public void izvrsiAkciju(VideoPlayer player) {

		if (!this.podesavanjeZvuka) {

			if (player.getJacinaZvuka() > 0) {

				player.setJacinaZvuka(player.getJacinaZvuka() - 1);

			} else {

				System.out.println("Necujno.");

			}

		} else {

			if (player.getJacinaZvuka() < 100) {

				player.setJacinaZvuka(player.getJacinaZvuka() + 1);

			} else {

				System.out.println("Maksimalna jacina zvuka.");

			}

		}

	}
}
