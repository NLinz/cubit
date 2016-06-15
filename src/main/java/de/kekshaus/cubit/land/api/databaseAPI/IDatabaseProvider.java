package de.kekshaus.cubit.land.api.databaseAPI;

import java.util.UUID;

import org.bukkit.World;

public interface IDatabaseProvider {

	public boolean link();

	public long getTimeStamp(UUID uuid);

	public OfferData getOfferData(String regionID, World world);

	public boolean isOffered(String regionID, World world);

	public boolean setOfferData(OfferData data);

	public boolean removeOfferData(String regionID, World world);

	public void updatePlayer(UUID uuid, String player, long time);

}
