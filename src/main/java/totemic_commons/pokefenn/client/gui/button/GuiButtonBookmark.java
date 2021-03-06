package totemic_commons.pokefenn.client.gui.button;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import totemic_commons.pokefenn.client.RenderHelper;
import totemic_commons.pokefenn.client.gui.GuiLexicon;

import java.util.ArrayList;
import java.util.List;

public class GuiButtonBookmark extends GuiButton
{

    GuiLexicon gui = new GuiLexicon();

    public GuiButtonBookmark(int par1, int par2, int par3, GuiLexicon gui, String str)
    {
        super(par1, par2, par3, gui.bookmarkWidth(str) + 5, 11, str);
    }

    @Override
    public void drawButton(Minecraft mc, int par2, int par3)
    {
        gui.drawBookmark(xPosition, yPosition, displayString, false);
        field_146123_n = par2 >= xPosition && par3 >= yPosition && par2 < xPosition + width && par3 < yPosition + height;
        int k = getHoverState(field_146123_n);

        List<String> tooltip = new ArrayList();
        if(displayString.equals("+"))
            tooltip.add(StatCollector.translateToLocal("totemicmisc.clickToAdd"));
        else
        {
            tooltip.add(String.format(StatCollector.translateToLocal("totemicmisc.bookmark"), id - GuiLexicon.BOOKMARK_START + 1));
            tooltip.add(EnumChatFormatting.GRAY + StatCollector.translateToLocal("totemicmisc.clickToSee"));
            tooltip.add(EnumChatFormatting.GRAY + StatCollector.translateToLocal("totemicmisc.shiftToRemove"));
        }

        int tooltipY = (tooltip.size() + 1) * 5;
        if(k == 2)
            RenderHelper.renderTooltip(par2, par3 + tooltipY, tooltip);
    }

}
