package videoplejer;

public class TimeControl extends Control {

	private boolean premotavanje;

	public TimeControl(boolean pomeraVreme) {

		super();

		this.premotavanje = pomeraVreme;

	}

	@Override

	public void izvrsiAkciju(VideoPlayer player) {

		if (!premotavanje) {

			if (player.getTrenutnoVremeVidea() > 15) {

				player.setTrenutnoVremeVidea(player.getTrenutnoVremeVidea() - 15);

			} else {

				player.setTrenutnoVremeVidea(0);

			}

		} else {

			if (player.getDuzinaVidea() - player.getTrenutnoVremeVidea() > 15) {

				player.setTrenutnoVremeVidea(player.getTrenutnoVremeVidea() + 15);

			} else {

				player.setTrenutnoVremeVidea(player.getDuzinaVidea());

			}

		}

	}

}