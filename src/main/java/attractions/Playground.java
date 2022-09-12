package attractions;

import interfaces.ISecure;
import people.Visitor;

public class Playground extends Attraction implements ISecure {

    public Playground(String name, int rating) {
        super(name, rating);
    }


    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() >= 15);
    }
}
