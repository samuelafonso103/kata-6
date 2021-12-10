package kata6.branches;

import kata6.business.SerialNumberGenerator;
import kata6.business.ToyBusiness;
import kata6.toyproducts.Toy;
import kata6.toyproducts.models.AmericanCarToy;
import kata6.toyproducts.models.AmericanHelicopterToy;


public class AmericanToyBusiness extends ToyBusiness{

    private final SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator(); 
    
    @Override
    public Toy createToy(String type) {
        switch (type){
            case "car": 
                AmericanCarToy car = new AmericanCarToy(serialNumberGenerator.next());
                car.pack();
                car.label();
                return car;
        
        
            default:
                AmericanHelicopterToy helicopter = new AmericanHelicopterToy(serialNumberGenerator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;               
        }  
    }
    
}
