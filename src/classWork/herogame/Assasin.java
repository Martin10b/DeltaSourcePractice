package classWork.herogame;

public class Assasin extends Hero {
    public Assasin(int attackPoints, int defence, int healthPoints){
        super(attackPoints, defence, healthPoints);
    }
    public int attack(){
        return attackPoints * 4;
    }
}
