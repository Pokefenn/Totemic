package totemic_commons.pokefenn.block.totem;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import totemic_commons.pokefenn.ModItems;
import totemic_commons.pokefenn.Totemic;
import totemic_commons.pokefenn.api.totem.TotemRegistry;
import totemic_commons.pokefenn.block.BlockTileTotemic;
import totemic_commons.pokefenn.lib.Strings;
import totemic_commons.pokefenn.tileentity.totem.TileTotemPole;

import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Pokefenn
 * Date: 02/02/14
 * Time: 13:03
 */
public class BlockTotemPole extends BlockTileTotemic
{

    public BlockTotemPole()
    {
        super(Material.wood);
        setBlockName(Strings.TOTEM_POLE_NAME);
        setCreativeTab(Totemic.tabsTotem);
        setBlockBounds(0.2F, 0.0F, 0.2F, 0.8F, 0.95F, 0.8F);
    }

    @Override
    public Item getItemDropped(int par1, Random random, int par2)
    {
        return Item.getItemFromBlock(this);
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLiving, ItemStack itemStack)
    {
        world.setBlockMetadataWithNotify(x, y, z, itemStack.getItemDamage(), 1);
    }

    @Override
    public int damageDropped(int meta)
    {
        return meta;
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list)
    {
        for(int i = 0; i < 5; i++)
            list.add(new ItemStack(item, 1, i));
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
        TileTotemPole tileTotemSocket = (TileTotemPole) world.getTileEntity(x, y, z);

        if(tileTotemSocket != null && !world.isRemote)
        {
            if(player.getHeldItem() != null && tileTotemSocket.getTotemId() != 0 && (player.getHeldItem().getItem() == ModItems.totemicStaff || player.getHeldItem().getItem() == ModItems.infusedTotemicStaff))
            {
                player.addChatComponentMessage(new ChatComponentText("Active Totem Effect: " + TotemRegistry.getRecipes().get(tileTotemSocket.getTotemId())));
            }
            world.markBlockForUpdate(x, y, z);
        }

        return true;
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public int getRenderType()
    {
        return -1;
    }

    @Override
    public int quantityDropped(Random rand)
    {
        return 0;
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2)
    {
        return new TileTotemPole();
    }
}
