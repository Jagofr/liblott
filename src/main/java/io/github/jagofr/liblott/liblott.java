package io.github.jagofr.liblott;
import org.bukkit.command.*;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;

public final class liblott extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().info("onEnable has been Invoked!");
	}
	@Override
	public void onDisable() {
		getLogger().info("onDisable has been Invoked!");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("lottery") || cmd.getName().equalsIgnoreCase("lotto")){
			if(args.length == 0 ) {
				Player player = (Player) sender;
				PlayerInventory pInv = player.getInventory();
				ItemStack wager = pInv.getItemInMainHand();
				sender.sendMessage("[Lottery] Are you use you want to wager " + wager.toString() + "? (/lottery confirm)");
				return true;	
			}
			else if(args.length == 1) {
				if (args[0] == "confirm") {
					sender.sendMessage("[Lottery] You have been entered for this hour's drawing.");
				}
				return true;
			}
		}
		if(cmd.getName().equalsIgnoreCase("lott")){
			if(args.length == 0) {
				sender.sendMessage("[Lottery] Usage: '/lott reload' or '/lott play'");
				return true;	
			}
			else if(args.length == 1){
				if (args[0] == "reload") {
					sender.sendMessage("[Lottery] TODO: Code Here");
					return true;
				}
				else if(args[0] == "play"){
					sender.sendMessage("[Lottery] TODO: Code Here");
					return true;
				}
			}
		}
		if(cmd.getName().equalsIgnoreCase("debug")){
			if(args.length == 0) {
				sender.sendMessage("[Lottery] TODO: Code Here");
				return true;	
			}
		}
		return false;
	}
}
