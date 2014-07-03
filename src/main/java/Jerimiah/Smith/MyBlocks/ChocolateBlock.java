package Jerimiah.Smith.MyBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import Jerimiah.Smith.MyCode;

public class ChocolateBlock extends Block 
	{

	        public ChocolateBlock (Material material) 
	        {
	        	
	                super(material);
	                setHardness(3F);
	                setBlockTextureName("jermod:ChocolateBlock");
	                setStepSound(Block.soundTypeGravel);
	    			setBlockName("chocolateBlock");
	    			setCreativeTab(CreativeTabs.tabBlock);
	                setHarvestLevel("pickaxe", 1);
	                setCreativeTab(MyCode.tabJerMod);
	        } 

	}