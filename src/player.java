public class player{

    private int health;
    private int attack;
    private int heal;
    private boolean isalive;
    private int speed;

    
    public player(){
        this.health = 100;
        this.attack = -10; 
        this.heal = 7;
        this.isalive = true;
        this.speed = 3;

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

    public void setlifestatus(player player){
        if(player.getHealth() <=0){
            player.dies();
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

    public void heal(player us){
        for(int i=0; i<us.getheal(); i++){
            if(us.getHealth() == 100){
                break;
            }
            us.setHealth(1);
        }
    }

    public void choicemaker(){
        System.out.println("Choose one number {1, 2, 3}: ");
    }



    


}
