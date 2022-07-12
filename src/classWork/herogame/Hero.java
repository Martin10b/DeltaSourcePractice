package classWork.herogame;

public class Hero {
    protected int attackPoints;
    protected int defence;
    protected int healthPoints;

    public Hero(int attackPoints, int defence, int healthPoints){
        this.attackPoints = attackPoints;
        this.defence = defence;
        this.healthPoints = healthPoints;

    }
    public int getAttackPoints(){
        return attackPoints;
    }
    public void setAttackPoints(int attackPoints){
        this.attackPoints = attackPoints;
    }
    public int getDefence(){
        return defence;
    }
    public void setDefence(int defence){
        this.defence = defence;
    }
    public int getHealthPoints(){
        return healthPoints;
    }
    public void setHealthPoints(int healthPoints){
        this.healthPoints = healthPoints;
    }
    public int attack(){
        return attackPoints;
    }
    public int def(int attackDmj){
        return defence;
    }
    public void updateHP(int healthPoints){
        setHealthPoints(Math.max(healthPoints, 0));
    }

    @Override
    public String toString() {
        return "Hero{" +
                "attackPoints=" + attackPoints +
                ", defence=" + defence +
                ", healthPoints=" + healthPoints +
                '}';
    }
}



