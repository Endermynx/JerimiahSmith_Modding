package Jerimiah.Smith.MyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import Jerimiah.Smith.MyCode;

public class bluemnm extends ItemFood{
	public bluemnm (int i, int j, boolean b) {
    	super(j,b);
        setUnlocalizedName("blueMNM");
        setCreativeTab(MyCode.tabJerMod);
        setPotionEffect(Potion.moveSpeed.id, 5, 1, 1.0F);
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
