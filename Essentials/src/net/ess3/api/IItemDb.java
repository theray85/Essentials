package net.ess3.api;

import net.ess3.api.server.ItemStack;


public interface IItemDb extends IReload
{
	ItemStack get(final String name, final IUser user) throws Exception;

	ItemStack get(final String name, final int quantity) throws Exception;

	ItemStack get(final String name) throws Exception;
}
