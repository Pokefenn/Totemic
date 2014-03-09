package totemic_commons.pokefenn;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import totemic_commons.pokefenn.block.*;
import totemic_commons.pokefenn.lib.Strings;

public final class ModBlocks
{

    public static Block chlorophyllSolidifier;
    public static Block venusFlyTrap;
    public static Block totemWoods;
    public static Block totemDraining;
    public static Block totemTable;
    public static Block totemIntelligence;
    public static Block totemSocket;
    public static Block chlorophyll;
    public static Block totemSapling;
    public static Block totemLeaves;
    public static Block totemCauldron;

    public static Block totemMana;

    public static void init()
    {

        chlorophyllSolidifier = new BlockChlorophyllSolidifier();
        //venusFlyTrap = new BlockVenusFlyTrap(BlockIds.VENUS_FLY_TRAP);
        totemWoods = new BlockTotemWoods();
        //totemDraining = new BlockTotemDraining(BlockIds.TOTEM_DRAINING);
        //totemTable = new BlockTotemTable(BlockIds.TOTEM_TABLE);
        totemIntelligence = new BlockTotemIntelligence();
        totemSocket = new BlockTotemSocket();
        chlorophyll = new BlockChlorophyll();
        totemSapling = new BlockTotemSapling();
        totemLeaves = new BlockTotemLeaves();
        //totemCauldron = new BlockTotemCauldron(BlockIds.TOTEM_CAULDRON);

        GameRegistry.registerBlock(chlorophyllSolidifier, Strings.CHLOROPHYLL_SOLIDIFIER_NAME);
        //GameRegistry.registerBlock(venusFlyTrap, Strings.VENUS_FLY_TRAP_NAME);
        GameRegistry.registerBlock(totemWoods, Strings.TOTEM_WOODS_NAME);
        //GameRegistry.registerBlock(totemDraining, Strings.TOTEM_DRAINING_NAME);
        //GameRegistry.registerBlock(totemTable, Strings.TOTEM_TABLE_NAME);
        GameRegistry.registerBlock(totemIntelligence, Strings.TOTEM_INTELLIGENCE_NAME);
        GameRegistry.registerBlock(totemSocket, Strings.TOTEM_SOCKET_NAME);
        GameRegistry.registerBlock(chlorophyll, Strings.FLUID_CHLOROPHYLL_NAME);
        GameRegistry.registerBlock(totemSapling, Strings.TOTEM_SAPLING_NAME);
        GameRegistry.registerBlock(totemLeaves, Strings.TOTEM_LEAVES_NAME);
        //GameRegistry.registerBlock(totemCauldron, Strings.TOTEM_CAULDRON_NAME);


    }

    public static void initBotania()
    {
        Totemic.botaniaLoaded = true;

        Totemic.logger.info("Totemic Botania Interaction Enabled");

        totemMana = new BlockManaTotem();
        GameRegistry.registerBlock(totemMana, Strings.TOTEM_MANA_NAME);

    }

}
