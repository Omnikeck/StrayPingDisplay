package club.revived;

import club.revived.function.PingDisplay;
import club.revived.function.ReloadCommand;
import dev.manere.utils.config.Config;
import dev.manere.utils.library.Utils;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class StrayPingDisplay extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Utils.init(this);
        Config.init();
        new ReloadCommand();

        getServer().getPluginManager().registerEvents(new PingDisplay(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
