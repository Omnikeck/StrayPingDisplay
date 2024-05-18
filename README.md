# StrayPingDisplay

**Overview:**

StrayPingDisplay is a quick ripoff of a feature that stray.gg has.

**Features:**
  
- **Flexible Message Format:** Customize the message format that players receive when checking the ping of someone

**Usage:**

1. Install the plugin on your Bukkit/Spigot server.
2. Customize the Discord invite link and message format in the `config.yml` file.
3. Players can now see the ping of other people by rightclicking them.

**Configuration Example:**

```

# This plugin is based on the MiniMessage API, means that colors are displayed by using "<color>" or "<rgbcolor>".
# Even decorations can be displayed through MiniMessage.
# You can find more here: https://docs.advntr.dev/minimessage/format.html

# Use /pingreload to reload the plugin

Ping:
  # In these messages, <Player> is a variable that will be replaced with the player's name and <ping> is a variable that will be replaced with the player's ping.
  Actionbar: "<gray>Their Ping: <green><ping>"
Reload:
  Message: "<green>The config has been reloaded"
```

**Contributing:**

Contributions to this project are welcome! If you have any suggestions, bug fixes, or feature requests, feel free to open an issue or submit a pull request.

**License:**

This plugin is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

**APIs Emplyed**

StrayPingDisplay leverages the following powerful APIs:

- **Manere's Utils API**: Enhance your gameplay with the comprehensive utilities provided by Manere's Utils API. [GitHub Link](https://github.com/Manered/Utils)

**Author:**

Created by [Omnikeck](https://github.com/omnikeck)
