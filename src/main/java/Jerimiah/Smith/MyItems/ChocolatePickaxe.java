package Jerimiah.Smith.MyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraft.util.IIcon; 
import Jerimiah.Smith.MyCode;

public class ChocolatePickaxe extends ItemPickaxe {

	public ChocolatePickaxe (ToolMaterial material) {
		super(material);
		setUnlocalizedName("chocolatePickaxe");
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
