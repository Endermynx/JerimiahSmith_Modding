package Jerimiah.Smith.MyItems;

import Jerimiah.Smith.MyCode;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.util.IIcon;
import Jerimiah.Smith.MyCode;

public class solidchocolate extends ItemFood{
	public solidchocolate (int i, int j, boolean b) {
    	super(j,b);
        setUnlocalizedName("solidchocolate");
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