package classWork.herogame;

public class Tank extends Hero {
    public Tank(int attackPoints, int defence, int healthPoints){
        super(attackPoints, defence, healthPoints);
    }
    public int attack(){
        return (int)(attackPoints * 1.5);
    }
    public int defence(){
        return (defence + attackPoints) / 2;
    }
}
