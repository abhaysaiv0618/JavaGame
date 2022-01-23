public class healertype extends player{

    private int health;
    private int attack;
    private int heal;
    private boolean isalive;
    private int speed;

    
    public healertype(){
        this.health = 130;
        this.attack = -10; 
        this.heal = 15;
        this.isalive = true;
        this.speed = 2;

    }

    public int getspeed(){
        return speed;
    }

    public int getHealth(){
        return health;
    }

    public void setHealth(int effect){
            health = health + effect;
    }

    public void setlifestatus(healertype h){
        if(h.getHealth() <=0){
            h.dies();
        } else return;
    }
    

    public int getAttack(){
        return attack;
    }

    public boolean isalive(){
        return isalive;
    }

    public void dies(){
        isalive = false;
    }
    

    public int getheal(){
        return heal;
    }

    public void heal(healertype us){
        for(int i=0; i<us.getheal(); i++){
            if(us.getHealth() == 130){
                break;
            }
            us.setHealth(1);
        }
    }

    public void choicemaker(){
        System.out.println("Choose one number {1, 2}: ");
    }



    


}
