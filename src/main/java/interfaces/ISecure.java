package interfaces;

import people.Visitor;

public interface ISecure {

    public boolean isAllowedTo(Visitor visitor);
}
