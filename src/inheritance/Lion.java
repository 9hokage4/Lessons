package inheritance;

public class Lion extends CatFamily{
    public Lion(){
        super(4, 2, true);
    }
    @Override
    public String eat(){
        return super.eat() + "антилопу";
    }
}
