// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

package org.Barteks2x.b173gen.generator.beta173;

import java.util.Random;

import net.minecraft.server.World;
import net.minecraft.server.IChunkProvider;

// Referenced classes of package net.minecraft.src:
//            World, IChunkProvider

public class MapGenBase
{

    public MapGenBase()
    {
        field_1306_a = 8;
        rand = new Random();
    }

    @SuppressWarnings("cast")
    public void func_867_a(@SuppressWarnings("unused") IChunkProvider chunkProviderGenerate, World world, int i, int j, byte abyte0[])
    {
        int k = field_1306_a;
        rand.setSeed(world.getSeed());
        long l = (rand.nextLong() / 2L) * 2L + 1L;
        long l1 = (rand.nextLong() / 2L) * 2L + 1L;
        for(int i1 = i - k; i1 <= i + k; i1++)
        {
            for(int j1 = j - k; j1 <= j + k; j1++)
            {
                rand.setSeed((long)i1 * l + (long)j1 * l1 ^ world.getSeed());
                func_868_a(world, i1, j1, i, j, abyte0);
            }

        }

    }

    @SuppressWarnings("unused")
    protected void func_868_a(World world, int i, int j, int k, int l, byte abyte0[])
    {
    }

    protected int field_1306_a;
    protected Random rand;
}
