package com.for_knack;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class for_knack_PluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(for_knack_Plugin.class);
		RuneLite.main(args);
	}
}