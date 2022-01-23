public class brutetype extends player{

    private int health;
    private int attack;
    private int heal;
    private boolean isalive;
    private int speed;

    
    public brutetype(){
        this.health = 200;
        this.attack = -13; 
        this.heal = 7;
        this.isalive = true;
        this.speed = 4;

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

    public void setlifestatus(brutetype b){
        if(b.getHealth() <=0){
            b.dies();
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

    public void heal(brutetype us){
        for(int i=0; i<us.getheal(); i++){
            if(us.getHealth() == 200){
                break;
            }
            us.setHealth(1);
        }
    }

    public void choicemaker(){
        System.out.println("Choose one number {1, 2, 3, 4,}: ");
    }


    


}
