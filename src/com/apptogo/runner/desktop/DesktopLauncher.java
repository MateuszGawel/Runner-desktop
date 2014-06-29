package com.apptogo.runner.desktop;

import com.apptogo.runner.main.Runner;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "RUNNER";
		config.width = 1280;
		config.height =  800;
		new LwjglApplication(new Runner(), config);
	}
}
