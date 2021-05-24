package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }


    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 12 && visitor.getHeight() >= 145 ;
    }

    public double price(){
        return 8.40;
    }

    public double ticketPrice(Visitor visitor) {
        if(visitor.getHeight() >= 200) {
            return price() * 2;
        }
        return price();

    }
}
