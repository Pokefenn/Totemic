package totemic_commons.pokefenn.item.equipment.music;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import totemic_commons.pokefenn.ModItems;
import totemic_commons.pokefenn.api.music.IMusic;
import totemic_commons.pokefenn.api.music.MusicEnum;
import totemic_commons.pokefenn.item.ItemTotemic;
import totemic_commons.pokefenn.lib.Strings;
import totemic_commons.pokefenn.util.EntityUtil;
import totemic_commons.pokefenn.util.TotemUtil;

import java.util.List;

/**
 * Created by Pokefenn.
 * Licensed under MIT (If this is one of my Mods)
 */
public class ItemShamanFlute extends ItemTotemic implements IMusic
{

    public ItemShamanFlute()
    {
        super();
        setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.SHAMAN_FLUTE_NAME);
        setMaxStackSize(1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
    {
        list.add("Like the Pied Piper of old");
    }

    public void onUpdate(ItemStack itemStack, World world, Entity player, int par4, boolean par5)
    {
        if(!world.isRemote)
        {
            if(player instanceof EntityPlayer)
                if(((EntityPlayer) player).getHeldItem() != null && ((EntityPlayer) player).getHeldItem().getItem() == ModItems.shamanFlute)
                {
                    ((EntityPlayer) player).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 30, 1));
                }
        }
    }

    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
        if(!world.isRemote)
        {
            if(world.rand.nextInt(50) == 1)
                TotemUtil.playMusicFromItem(world, player, this.musicEnum(), (int) player.posX, (int) player.posY, (int) player.posZ, this.getRange(world, (int)player.posX, (int)player.posY, (int)player.posZ, true, player), this.getMaximumMusic(world, (int)player.posX, (int)player.posY, (int)player.posZ, true, player), this.getMusicOutput(world, (int)player.posX, (int)player.posY, (int)player.posZ, true, player));
            player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 30, 1));
            if(EntityUtil.getEntitiesInRange(world, player.posX, player.posY, player.posZ, 2, 2) != null)
            {
                for(Entity entity : EntityUtil.getEntitiesInRange(world, player.posX, player.posY, player.posZ, 2, 2))
                {
                    if(entity instanceof EntityAnimal || entity instanceof EntityVillager)
                    {
                        if(entity instanceof EntityAnimal)
                            ((EntityAnimal) entity).targetTasks.addTask(5, new EntityAITempt((EntityCreature) entity, 1, ModItems.shamanFlute, false));
                        if(entity instanceof EntityVillager)
                            ((EntityVillager) entity).targetTasks.addTask(5, new EntityAITempt((EntityCreature) entity, 0.5, ModItems.shamanFlute, false));
                    }

                }
            }

        }

        if(world.isRemote)
        {
            world.spawnParticle("enchantmenttable", ((EntityPlayer) player).posX, ((EntityPlayer) player).posY, ((EntityPlayer) player).posZ, 0, 0.32, 0);
        }

        return stack;
    }

    @Override
    public MusicEnum musicEnum()
    {
        return MusicEnum.FLUTE_MUSIC;
    }

    @Override
    public int getMaximumMusic(World world, int x, int y, int z, boolean isFromPlayer, EntityPlayer player)
    {
        return 60;
    }

    @Override
    public int getMusicOutput(World world, int x, int y, int z, boolean isFromPlayer, EntityPlayer player)
    {
        return 4;
    }

    @Override
    public int getRange(World world, int x, int y, int z, boolean isFromPlayer, EntityPlayer player)
    {
        return 7;
    }
}
