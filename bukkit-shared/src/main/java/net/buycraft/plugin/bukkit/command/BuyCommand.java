package net.buycraft.plugin.bukkit.command;

import net.buycraft.plugin.bukkit.BuycraftPluginBase;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BuyCommand implements CommandExecutor
{
    private final BuycraftPluginBase plugin;

    public BuyCommand(BuycraftPluginBase plugin)
    {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        if(!(sender instanceof Player))
        {
            sender.sendMessage(ChatColor.RED + "This command can only be used by players!");
            return true;
        }

        plugin.getViewCategoriesGUI().open((Player) sender);
        return true;
    }
}
