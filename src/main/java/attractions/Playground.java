package attractions;

import interfaces.ISecure;
import people.Visitor;

public class Playground extends Attraction{

    public Playground(String name, int rating) {
        super(name, rating);
    }


    @Override
    public boolean isAllowedFor(Visitor visitor) {
        return (visitor.getAge() >= 15);
    }
}
