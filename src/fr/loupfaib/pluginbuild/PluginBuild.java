package fr.loupfaib.pluginbuild;

import org.bukkit.plugin.java.JavaPlugin;

public class PluginBuild extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("Hello");
	}

	@Override
	public void onDisable() {
		System.out.println("Goodbye");
	}
	
}
