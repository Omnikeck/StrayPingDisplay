package club.revived.function;

import club.revived.StrayPingDisplay;
import dev.manere.utils.command.CommandResult;
import dev.manere.utils.command.CommandTypes;
import dev.manere.utils.command.impl.Commands;
import dev.manere.utils.config.Config;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class ReloadCommand {

    public ReloadCommand(){
        init();
    }


    private void init(){

        Commands.command("pingreload", CommandTypes.commandMap())
                .executes(ctx -> {
                    Player player = ctx.player();
                    player.sendRichMessage(Config.key("Reload.Message").val().asText().toString());
                    Config.reload();
                    return CommandResult.SUCCESS;
                })
                .build()
                .register();
    }
}
