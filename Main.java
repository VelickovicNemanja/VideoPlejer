package videoplejer;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		VideoPlayer p1 = new VideoPlayer(130, 25, 22, 1800);

		VideoPlayer p2 = new VideoPlayer(80, 10, 15, 360);

		QualityOptimizerControl qual1 = new QualityOptimizerControl(150);

		TimeControl t1 = new TimeControl(true);

		AudioControl a1 = new AudioControl(false);

		p1.stampaj();

		System.out.println("");

		t1.izvrsiAkciju(p1);

		p1.stampaj();

		System.out.println("");

		ArrayList<Control> akcije = new ArrayList();

		akcije.add(qual1);

		akcije.add(t1);

		for (int i = 0; i < akcije.size(); i++) {

			akcije.get(i).izvrsiAkciju(p2);

		}

		p2.stampaj();

	}
}