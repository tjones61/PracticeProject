/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceproject;

/**
 *
 * @author tjones61
 */
public class Database {
    private Customer[] customers={new Customer(1,"Tom","Jones","1234567890","123 street"),
                                    new Customer(2,"Jack","Davidson","2345678901","456 street"),
                                    new Customer(3,"Steph","Smith","3456789012","789 street"),
                                    new Customer(4,"Amy","Johnson","4567890123","012 drive"),
                                    new Customer(5,"Bob","Kheul","5678901234","345 drive")};
    private Product[] products={new Product(1,"Playstation","Sony",199.99,0.35),
                                    new Product(2,"Playstation 2","Sony",249.99,0.30),
                                    new Product(3,"Playstation 3","Sony",299.99,0.25),
                                    new Product(4,"Playstation 4","Sony",349.99,0.20),
                                    new Product(5,"Xbox","Microsoft",199.99,0.35),
                                    new Product(6,"Xbox 360","Microsoft",249.99,0.30),
                                    new Product(7,"Xbox One","Microsoft",349.99,0.20),
                                    new Product(8,"Xobx One X","Microsoft",549.99,0.00),
                                    new Product(9,"Wii","Nintendo",249.99,0.45),
                                    new Product(10,"Wii U","Nintendo",349.99,0.25),
                                    new Product(11,"Switch","Nintendo",449.99,0.15)};
    
    public final Customer findCustomerById(int custID){
        Customer found= null;
        
        for(Customer c:customers){
            if(c.getCustID() == custID){
                found=c;
                break;
            }
        }
        return found;
    }
    
    public final Product findProductById(int prodID){
        Product found = null;
        
        for(Product p:products){
            if(p.getProductID()==prodID){
                found=p;
                break;
            }
        }
    }
    
    }

