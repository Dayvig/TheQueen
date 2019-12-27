
package QueenMod.interfaces;

import basemod.interfaces.ISubscriber;

public interface CardAddedToDeck
        extends ISubscriber
{
    default boolean onAddedToMasterDeck()
    {
        return true;
    }
}