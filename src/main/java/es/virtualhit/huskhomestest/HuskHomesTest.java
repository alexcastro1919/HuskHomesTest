package es.virtualhit.huskhomestest;

import net.william278.huskhomes.api.HuskHomesAPI;
import org.bukkit.plugin.java.JavaPlugin;

public final class HuskHomesTest extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        HuskHomesAPI api = HuskHomesAPI.getInstance();
        System.out.println("HuskHomesAPI: " + api);

        api.getWarps().thenAccept(warps -> {
            System.out.println("Warps: " + warps);
        });
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
