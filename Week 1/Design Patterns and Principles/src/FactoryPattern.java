
interface Product {
    String operation();
}


class ConcreteProductA implements Product {
    public String operation() {
        return "ConcreteProductA created";
    }
}

class ConcreteProductB implements Product {
    public String operation() {
        return "ConcreteProductB created";
    }
}

class ProductFactory {
    public static Product createProduct(String type) {
        if (type.equalsIgnoreCase("A")) {
            return new ConcreteProductA();
        } else if (type.equalsIgnoreCase("B")) {
            return new ConcreteProductB();
        }
        return null;
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        Product product1 = ProductFactory.createProduct("A");
        Product product2 = ProductFactory.createProduct("B");

        System.out.println(product1.operation());
        System.out.println(product2.operation());
    }
}
