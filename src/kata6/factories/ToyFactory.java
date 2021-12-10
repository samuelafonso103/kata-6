/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.factories;

import kata6.toyproducts.Toy;

/**
 *
 * @author Entrar
 */
public class ToyFactory {
    public Toy produceToy (String type){
        Toy toy = createToy(type);
    }
}
