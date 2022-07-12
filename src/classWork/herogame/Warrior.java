package classWork.herogame;

public class Warrior extends Hero{
    public Warrior(int attackPoints, int defence, int healthPoints){
        super(attackPoints, defence, healthPoints);
    }
    public int attack(){
        return (int)(attackPoints * 2);
    }
}
