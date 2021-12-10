package kata6.branches;

import kata6.factories.SerialNumberGenerator;
import kata6.business.ToyBusiness;
import kata6.toyproducts.Toy;
import kata6.toyproducts.models.AsianCarToy;
import kata6.toyproducts.models.AsianHelicopterToy;



public class AsianToyBusiness extends ToyBusiness{

    private final SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator(); 
    
    @Override
    public Toy createToy(String type) {
        switch (type){
            case "car": 
                AsianCarToy car = new AsianCarToy(serialNumberGenerator.next());
                car.pack();
                car.label();
                return car;
        
        
            default:
                AsianHelicopterToy helicopter = new AsianHelicopterToy(serialNumberGenerator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;               
        }         
    }
    
}
