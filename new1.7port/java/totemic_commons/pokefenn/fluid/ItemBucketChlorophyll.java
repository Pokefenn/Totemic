package totemic_commons.pokefenn.fluid;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import totemic_commons.pokefenn.Totemic;
import totemic_commons.pokefenn.item.ItemTotemic;
import totemic_commons.pokefenn.lib.Strings;
import totemic_commons.pokefenn.lib.Textures;

public class ItemBucketChlorophyll extends ItemTotemic
{


    public ItemBucketChlorophyll()
    {
        super();
        setUnlocalizedName(Strings.RESOURCE_PREFIX + Strings.BUCKET_CHLOROPHYLL_NAME);
        setMaxStackSize(1);
        setCreativeTab(Totemic.tabsTotem);
        setContainerItem(this);

    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register)
    {

        itemIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Textures.BUCKET_CHLOROPHYLL_ICON);

    }
    /*

    @Override
    public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player)
    {
        MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(world, player, true);

        if (movingobjectposition == null)
        {
            return item;
        } else
        {
            FillBucketEvent event = new FillBucketEvent(player, item, world, movingobjectposition);
            if (MinecraftForge.EVENT_BUS.post(event))
            {
                return item;
            }

            if (event.getResult() == Event.Result.ALLOW)
            {
                if (player.capabilities.isCreativeMode)
                {
                    return item;
                }

                if (--item.stackSize <= 0)
                {
                    return event.result;
                }

                if (!player.inventory.addItemStackToInventory(event.result))
                {
                    player.dropPlayerItem(event.result);
                }

                return item;
            }

            if (movingobjectposition.typeOfHit == EnumMovingObjectType.TILE)
            {
                int x = movingobjectposition.blockX;
                int y = movingobjectposition.blockY;
                int z = movingobjectposition.blockZ;

                if (!world.canMineBlock(player, x, y, z))
                {
                    return item;
                }


                if (movingobjectposition.sideHit == 0)
                {
                    --y;
                }

                if (movingobjectposition.sideHit == 1)
                {
                    ++y;
                }

                if (movingobjectposition.sideHit == 2)
                {
                    --z;
                }

                if (movingobjectposition.sideHit == 3)
                {
                    ++z;
                }

                if (movingobjectposition.sideHit == 4)
                {
                    --x;
                }

                if (movingobjectposition.sideHit == 5)
                {
                    ++x;
                }

                if (!player.canPlayerEdit(x, y, z, movingobjectposition.sideHit, item))
                {
                    return item;
                }

                if (this.tryPlaceContainedLiquid(world, x, y, z) && !player.capabilities.isCreativeMode)
                {
                    return new ItemStack(Items.bucket);
                }

            }

            return item;
        }
    }

    public boolean tryPlaceContainedLiquid(World w, int x, int y, int z)
    {


        //Material material = w.material(x, y, z);
        bo//olean isNotSolid = !material.isSolid();

        if (!w.isAirBlock(x, y, z) && !isNotSolid)
        {
            return false;
        } else
        {

            if (!w.isRemote && isNotSolid && !material.isLiquid())
            {
                w.destroyBlock(x, y, z, true);
            }
            w.setBlock(x, y, z, ModBlocks.chlorophyll.blockID, 0, 3);
            return true;
        }

    }

    */

}
