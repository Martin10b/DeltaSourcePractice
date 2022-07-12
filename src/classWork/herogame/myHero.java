package classWork.herogame;

public class myHero extends Hero{
    public myHero(int attackPoints, int defence, int healthPoints){
        super(attackPoints, defence, healthPoints);
    }
    public int attack(){
       return attackPoints * 5;
    }
    public int defence(){
        return defence * 3;
    }
}
