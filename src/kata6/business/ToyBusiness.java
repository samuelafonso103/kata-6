package kata6.business;

import kata6.business.SerialNumberGenerator;
import kata6.toyproducts.Toy;


public abstract class ToyBusiness {
    private final SerialNumberGenerator serialNumberGenerator; 
            
    public abstract Toy createToy(String type);
    

    public ToyBusiness() {
        this.serialNumberGenerator = new SerialNumberGenerator();
        
    }
}
