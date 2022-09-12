package attractions;

import interfaces.ISecure;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecure {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getHeight() >= 145 && visitor.getAge() >= 12;
    }
}
