package attractions;

import interfaces.ISecure;
import interfaces.ITicket;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ITicket {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedFor(Visitor visitor) {
        return visitor.getHeight() >= 145 && visitor.getAge() >= 12;
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 200){
            return defaultPrice() * 2;
        }
        return defaultPrice();
    }
}
