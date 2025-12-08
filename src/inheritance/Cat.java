package inheritance;

public class Cat extends CatFamily {
    public Cat(){
        super(4, 2, false);
    }

    @Override
    public String eat(){
        return super.eat() + "вискас";
    }
    
}
