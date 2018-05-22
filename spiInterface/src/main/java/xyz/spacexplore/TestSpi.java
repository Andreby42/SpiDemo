package xyz.spacexplore;

import java.util.ServiceLoader;

public class TestSpi {

	public static void main(String[] args) {
		ServiceLoader<SpiInfo> spis= ServiceLoader.load(SpiInfo.class);
		for (SpiInfo spiInfo : spis) {
			spiInfo.fuckMyLife();
		}
	}
}
