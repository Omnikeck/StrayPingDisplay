package club.revived.function;

import dev.manere.utils.config.Config;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class PingDisplay implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEntityEvent event) {
        Player player = event.getPlayer();
        if (event.getRightClicked() instanceof Player) {

            Player target = (Player) event.getRightClicked();
            int ping = 0 + target.getPing();

            String component = Config.key("Ping.Actionbar") // ConfigKey
                    .val()
                    .asText()
                    .toString();

            player.sendActionBar(MiniMessage.miniMessage().deserialize(component.replace("<ping>", String.valueOf(ping)).replace("<player>", target.getName())));
        }
    }
}
