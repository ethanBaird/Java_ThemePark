package interfaces;

import people.Visitor;

public interface ISecure {

    public boolean isAllowedFor(Visitor visitor);
}
