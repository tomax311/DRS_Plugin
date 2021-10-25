package tomax311.drs_plugin;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import tomax311.drs_plugin.Commands.DRSCreateCommand;

public final class DRS_Plugin extends JavaPlugin {

    public static DRS_Plugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        saveDefaultConfig();

        System.out.println("DRS_Plugin is on");

        getCommand("drsCreate").setExecutor(new DRSCreateCommand());

    }

}
