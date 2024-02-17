package com.bowlstatistics;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class BowlStatisticsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(BowlStatisticsPlugin.class);
		RuneLite.main(args);
	}
}