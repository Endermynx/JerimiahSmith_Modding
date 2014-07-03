package Jerimiah.Smith;

//Recipes
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;


//MyBlocks Imports
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

 //MyBlocks
import Jerimiah.Smith.MyBlocks.RubyOre;
import Jerimiah.Smith.MyBlocks.ChocolateBlock;


//MyItems
import Jerimiah.Smith.MyItems.RubyGem;
import Jerimiah.Smith.MyItems.FoodStrawberry;
import Jerimiah.Smith.MyItems.meltedchocolate;
import Jerimiah.Smith.MyItems.JerBar;
import Jerimiah.Smith.MyItems.redmnm;
import Jerimiah.Smith.MyItems.bluemnm;
import Jerimiah.Smith.MyItems.yellowmnm;
import Jerimiah.Smith.MyItems.brownmnm;
import Jerimiah.Smith.MyItems.greenmnm;
import Jerimiah.Smith.MyItems.solidchocolate;

//MyTools
import net.minecraftforge.common.util.EnumHelper;
import Jerimiah.Smith.MyItems.ChocolateSword;
import Jerimiah.Smith.MyItems.ChocolateHoe;
import Jerimiah.Smith.MyItems.ChocolateShovel;
import Jerimiah.Smith.MyItems.ChocolatePickaxe;
import Jerimiah.Smith.MyItems.ChocolateAxe;



public class MyCode {
		
		
		public static Block rubyOre;
		public static Block chocolateBlock;
		public static Item meltedchocolate;
		public static Item rubyGem;
		public static Item Strawberry = new ItemFood(32, 10, false);
		public static Item JerBar;
		public static Item redmnm;
		public static Item greenmnm;
		public static Item bluemnm;
		public static Item yellowmnm;
		public static Item brownmnm;
		public static Item solidchocolate;
		public static Item chocolateSword;
		public static Item chocolateHoe;
		public static Item chocolatePickaxe;
		public static Item chocolateAxe;
		public static Item chocolateShovel;
		
		// Creative Tab 
		public static CreativeTabs tabJerMod = new MyCreativeTab("JerMod");
		
		
		
		public static void MyBlocks() {
		//Blocks #setupBLOCK
			
		//RubyOre
		    rubyOre = new RubyOre (Material.ground)
			.setStepSound(Block.soundTypeGravel)
			.setBlockName("rubyOre")
			.setCreativeTab(CreativeTabs.tabBlock)
			.setBlockTextureName("redstone_ore");
		    
		//ChocolateBlock
		    chocolateBlock = new ChocolateBlock (Material.ground);
		
		//Harvest Level 

			//Register #setupBLOCK
			GameRegistry.registerBlock(rubyOre, "RubyOre");
			GameRegistry.registerBlock(chocolateBlock, "ChocolateBlock");
		}
		//list Items Here #setupITEM
		
		//tools
		public static Item ChocolateSword;
		public static Item.ToolMaterial COCOA =  EnumHelper.addToolMaterial("Cocoa", 1, 100, 3.0F,5.5F, 8);
		
		
		public static void MyRecipes() {

			
		GameRegistry.addShapelessRecipe(new ItemStack(Items.lava_bucket), new Object[]{new ItemStack(Items.magma_cream)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.coal), new Object[]{new ItemStack(Blocks.cobblestone)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.flint), new Object[]{new ItemStack(Blocks.gravel)});
		GameRegistry.addRecipe(new ItemStack(Items.lava_bucket), new Object[] {
			"ABA",
			"ACA",
			"ADA", 
			'A', Items.flint_and_steel,
			'B', Blocks.cobblestone,
			'C', Blocks.torch,
			'D', Items.bucket,  
		});
		GameRegistry.addRecipe(new ItemStack(Blocks.ice, 4), new Object[] {
			"AAA",
			"ABA",
			"AAA", 
			'A', Blocks.snow,
			'B', Items.water_bucket,
		});
		GameRegistry.addRecipe(new ItemStack(Items.skull, 1, 4), new Object[] {
			"AAA",
			"ABA",
			"AAA", 
			'A', Items.gunpowder,
			'B', Items.diamond,
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.iron_horse_armor ), new Object[] {
			"  A",
			"BAB", 
			"AAA", 
			'A', Items.iron_ingot, 
			'B', Blocks.obsidian
		});
		GameRegistry.addRecipe(new ItemStack(Items.golden_horse_armor ), new Object[] {
			"  A",
			"BAB", 
			"AAA", 
			'A', Items.gold_ingot, 
			'B', Blocks.brick_block
		});
		GameRegistry.addRecipe(new ItemStack(Items.diamond_horse_armor ), new Object[] {
			"  A",
			"BAB", 
			"AAA", 
			'A', Items.diamond, 
			'B', Blocks.lapis_block
		});
		GameRegistry.addRecipe(new ItemStack(Blocks.mossy_cobblestone ), new Object[] {
			"BBB",
			"BAB", 
			"BBB", 
			'A', Blocks.cobblestone, 
			'B', Blocks.vine
		});
		GameRegistry.addRecipe(new ItemStack(Blocks.mycelium ), new Object[] {
			"BCB",
			"AAA", 
			"ADA", 
			'A', Blocks.dirt, 
			'B', Blocks.red_mushroom,
			'C', Blocks.brown_mushroom,
			'D', Items.diamond 
		});
		GameRegistry.addRecipe(new ItemStack(Blocks.mycelium ), new Object[] {
			"CBC",
			"AAA", 
			"ADA", 
			'A', Blocks.dirt, 
			'B', Blocks.red_mushroom,
			'C', Blocks.brown_mushroom,
			'D', Items.diamond 
		});
		
		GameRegistry.addRecipe(new ItemStack(Items.name_tag ), new Object[] {
			"  A",
			" AB", 
			"A C", 
			'A', Items.leather,
			'B', Items.string,
			'C', Items.diamond
		});
		
		//chocolate Recipes
	GameRegistry.addRecipe(new ItemStack(JerBar), new Object[] {
		" B ",
		"AAA", 
		"AAA", 
		'A', meltedchocolate,
		'B', Items.milk_bucket
		});
	
	
	GameRegistry.addRecipe(new ItemStack(chocolateBlock), new Object[] {
		"AAA",
		"AAA", 
		"AAA", 
		'A', meltedchocolate
		});
	
	GameRegistry.addRecipe(new ItemStack(solidchocolate, 2), new Object[] {
		"BAB",
		"BAB", 
		"BAB", 
		'A', meltedchocolate,
		'B', Items.snowball 
		});	
	
	GameRegistry.addRecipe(new ItemStack(ChocolateSword), new Object[] {
		" A ",
		" A ", 
		" B ", 
		'A', chocolateBlock, 
		'B', Items.stick 
		});	
	
	GameRegistry.addRecipe(new ItemStack(chocolatePickaxe), new Object[] {
		"AAA",
		" B ", 
		" B ", 
		'A', chocolateBlock, 
		'B', Items.stick 
		});	
	
	GameRegistry.addRecipe(new ItemStack(chocolateAxe), new Object[] {
		"AA ",
		"AB ", 
		" B ", 
		'A', chocolateBlock, 
		'B', Items.stick 
		});	
	
	GameRegistry.addRecipe(new ItemStack(chocolateShovel), new Object[] {
		" A ",
		" B ", 
		" B ", 
		'A', chocolateBlock, 
		'B', Items.stick 
		});	
	
	GameRegistry.addRecipe(new ItemStack(chocolateHoe), new Object[] {
		"AA ",
		" B ", 
		" B ", 
		'A', chocolateBlock, 
		'B', Items.stick 
		});	
	
	//dyes
	ItemStack cocoa = new ItemStack(Items.dye);
	ItemStack red = new ItemStack(Items.dye);
	ItemStack blue = new ItemStack(Items.dye);
	ItemStack green = new ItemStack(Items.dye);
	ItemStack yellow = new ItemStack(Items.dye);
	ItemStack Meltedchocolate = new ItemStack(meltedchocolate,2);
	
	//Item IDs
	cocoa.setItemDamage(3);
	red.setItemDamage(1);
	blue.setItemDamage(4);
	green.setItemDamage(10);
	yellow.setItemDamage(11);
	
	//Chocolate Shapeless
			//red
			ItemStack SC = new ItemStack(solidchocolate);		
			ItemStack Redmnm = new ItemStack(redmnm);
			//blue
			ItemStack Bluemnm = new ItemStack(bluemnm);
			//green 
			ItemStack Greenmnm = new ItemStack(greenmnm);
			//yellow
			ItemStack Yellowmnm = new ItemStack(yellowmnm);
			//brown
			ItemStack Brownmnm = new ItemStack(brownmnm);
			
			//shapeless recipes
			GameRegistry.addShapelessRecipe(Redmnm, red, SC);
			GameRegistry.addShapelessRecipe(Bluemnm, blue, SC);
			GameRegistry.addShapelessRecipe(Greenmnm, green, SC);
			GameRegistry.addShapelessRecipe(Yellowmnm, yellow, SC);
			GameRegistry.addShapelessRecipe(Brownmnm, cocoa, SC);
			
			
		
	// Ids
	Meltedchocolate.setItemDamage(0);
	
	//Smelting Recipes
	GameRegistry.addSmelting(cocoa, Meltedchocolate, 0.1f);
	
	
			//stone tools
				GameRegistry.addSmelting(Items.stone_sword, new ItemStack(Blocks.stone, 2), 0.01F);
				GameRegistry.addSmelting(Items.stone_axe, new ItemStack(Blocks.stone, 3), 0.01F);
				GameRegistry.addSmelting(Items.stone_pickaxe, new ItemStack(Blocks.stone, 3), 0.01F);
				GameRegistry.addSmelting(Items.stone_hoe, new ItemStack(Blocks.stone, 2), 0.01F);
				GameRegistry.addSmelting(Items.stone_shovel, new ItemStack(Blocks.stone, 1), 0.01F);
			
		//iron tools
				GameRegistry.addSmelting(Items.iron_sword, new ItemStack(Items.iron_ingot, 2), 1.00F);
				GameRegistry.addSmelting(Items.iron_axe, new ItemStack(Items.iron_ingot, 3), 1.00F);
				GameRegistry.addSmelting(Items.iron_pickaxe, new ItemStack(Items.iron_ingot, 3), 1.00F);
				GameRegistry.addSmelting(Items.iron_hoe, new ItemStack(Items.iron_ingot, 2), 1.00F);
				GameRegistry.addSmelting(Items.iron_shovel, new ItemStack(Items.iron_ingot, 1), 1.00F);
		
		//Golden tools
				GameRegistry.addSmelting(Items.golden_sword, new ItemStack(Items.gold_ingot, 2), 1.50F);
				GameRegistry.addSmelting(Items.golden_axe, new ItemStack(Items.gold_ingot, 3), 1.50F);
				GameRegistry.addSmelting(Items.golden_pickaxe, new ItemStack(Items.gold_ingot, 3), 1.50F);
				GameRegistry.addSmelting(Items.golden_hoe, new ItemStack(Items.gold_ingot, 2), 1.50F);
				GameRegistry.addSmelting(Items.golden_shovel, new ItemStack(Items.gold_ingot, 1), 1.50F);
		
		//Ore Smelting 
				GameRegistry.addSmelting(Blocks.coal_ore, new ItemStack(Items.coal, 3), 3.50F);
				GameRegistry.addSmelting(Blocks.iron_ore, new ItemStack(Items.iron_ingot, 3), 3.50F);
				GameRegistry.addSmelting(Blocks.gold_ore, new ItemStack(Items.gold_ingot, 3), 3.50F);
				GameRegistry.addSmelting(Blocks.diamond_ore, new ItemStack(Items.diamond, 3), 3.50F);
				
		//ItemStack newEnchantment = new ItemStack(Items.diamond_pickaxe,1);
		//newEnchantment.addEnchantment(Enchantment.fortune, 127);
		//GameRegistry.addSmelting(Items.cookie,newEnchantment, 0.01F);
		
	}
	public static void MyItems(){
		//ruby gem
		rubyGem = new RubyGem();
		
		//Strawberry
		Strawberry = new FoodStrawberry(5015, 10, false).setUnlocalizedName("strawberry");
		
		//chocolateSword
		ChocolateSword = new ChocolateSword(COCOA);
		
		//chocolateHoe
		chocolateHoe = new ChocolateHoe(COCOA);
		
		//chocolateShovel
		chocolateShovel = new ChocolateShovel(COCOA);
		
		//chocolatePickaxe 
		chocolatePickaxe = new ChocolatePickaxe(COCOA);
		
		//chocolateAxe
		chocolateAxe = new ChocolateAxe(COCOA);
		
		//meltedchocolate
		meltedchocolate = new meltedchocolate(3, 3, false).setUnlocalizedName("meltedchocolate");
		
		//Jerbar
		JerBar = new JerBar(10, 10, false).setUnlocalizedName("JerBar");
		
		//RedM&M
		redmnm = new redmnm(4, 2, false).setUnlocalizedName("redmnm");
		
		//greenM&M 
		greenmnm = new greenmnm(4, 2, false).setUnlocalizedName("greenmnm");
		
		//blueM&M
		bluemnm = new bluemnm(4, 2, false).setUnlocalizedName("bluemnm");
		
		//yellowM&M
		yellowmnm = new yellowmnm(4, 2, false).setUnlocalizedName("yellowmnm");
		
		//brownM&M
		brownmnm = new brownmnm(4, 2, false).setUnlocalizedName("brownmnm");
		
		//solidChocolate
		solidchocolate = new solidchocolate(4, 3, false).setUnlocalizedName("solidchocolate");
		
		GameRegistry.registerItem(meltedchocolate, "meltedchocolate");
		GameRegistry.registerItem(Strawberry, "Strawberry");
		GameRegistry.registerItem(rubyGem, "rubyGem");
		GameRegistry.registerItem(ChocolateSword, "ChocolateSword");
		GameRegistry.registerItem(chocolateHoe, "ChocolateHoe");
		GameRegistry.registerItem(chocolatePickaxe, "ChocolatePickaxe");
		GameRegistry.registerItem(chocolateShovel, "ChocolateShovel");
		GameRegistry.registerItem(chocolateAxe, "ChocolateAxe");
		GameRegistry.registerItem(JerBar, "JerBar");
		GameRegistry.registerItem(redmnm, "redmnm");
		GameRegistry.registerItem(greenmnm, "greenmnm");
		GameRegistry.registerItem(bluemnm, "bluemnm");
		GameRegistry.registerItem(yellowmnm, "yellowmnm");
		GameRegistry.registerItem(brownmnm, "brownmnm");
		GameRegistry.registerItem(solidchocolate, "solidchocolate");
	}
}