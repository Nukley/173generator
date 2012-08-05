// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package org.Barteks2x.b173gen.generator.beta173;

import java.util.Random;

import net.minecraft.server.Block;
import net.minecraft.server.World;
import net.minecraft.server.WorldGenerator;


// Referenced classes of package net.minecraft.src:
//            WorldGenerator, World, Block, BlockGrass

public class WorldGenPumpkin extends WorldGenerator
{

    public WorldGenPumpkin()
    {
    }

    @Override
	public boolean a(World world, Random random, int i, int j, int k)
    {
        for(int l = 0; l < 64; l++)
        {
            int i1 = (i + random.nextInt(8)) - random.nextInt(8);
            int j1 = (j + random.nextInt(4)) - random.nextInt(4);
            int k1 = (k + random.nextInt(8)) - random.nextInt(8);
            if(world.isEmpty(i1, j1, k1) && world.getTypeId(i1, j1 - 1, k1) == Block.GRASS.id && Block.PUMPKIN.canPlace(world, i1, j1, k1))
            {
                world.setRawTypeIdAndData(i1, j1, k1, Block.PUMPKIN.id, random.nextInt(4));
            }
        }

        return true;
    }
}
