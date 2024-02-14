
/**
 * Groks are bad actors in a game.  Groks have the ability to ingest
 * a PowerPill to replenish their energy.  This makes them difficult
 * to kill.
 *
 * @author (You Again)
 * @version (0.1)
 */
public class Grok
{
    private static final int DEFAULT_POWER_LEVEL = 50;
    private int powerLevel;
    public Grok()
    {
        setPowerLevel(DEFAULT_POWER_LEVEL);
    }

    public Grok(int powerLevel){
        setPowerLevel(powerLevel);
    }

    public int getPowerLevel(){
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel){
        this.powerLevel = powerLevel;
    }
    public void takePowerPill(PowerPill PowerPill)
    {
        setPowerLevel(powerLevel+PowerPill.getPower());
    }
    public void tookHit(){
        setPowerLevel(powerLevel-5);
    }
}
