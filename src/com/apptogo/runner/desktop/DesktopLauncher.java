package com.apptogo.runner.desktop;

import com.apptogo.runner.main.Runner;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "RUNNER";
		config.width = 480;
		config.height =  320;
		new LwjglApplication(new Runner(), config);
	}
}
