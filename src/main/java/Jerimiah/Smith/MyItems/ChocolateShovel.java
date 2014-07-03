package Jerimiah.Smith.MyItems;

import Jerimiah.Smith.MyCode;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.util.IIcon; 
import Jerimiah.Smith.MyCode;

public class ChocolateShovel extends ItemSpade {

	public ChocolateShovel (ToolMaterial material) {
		super(material);
		setUnlocalizedName("chocolateShovel");
		setCreativeTab(MyCode.tabJerMod);
	}
	//load Icons and Textures Properly 
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
    	this.itemIcon = par1IconRegister.registerIcon("jermod:"
    			+ (this.getUnlocalizedName().substring(5)));
;        }
}
