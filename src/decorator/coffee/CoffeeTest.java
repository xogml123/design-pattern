package decorator.coffee;

public class CoffeeTest {

        public static void main(String args[]) {
            Coffee kenyaAmericano = new KenyaAmericano();
            System.out.println(kenyaAmericano.getDescription());
            Coffee milkKenyaAmerican = new Milk(kenyaAmericano);
            System.out.println(milkKenyaAmerican.getDescription());
            Coffee mochaMilkKenyaAmerican = new Mocha(milkKenyaAmerican);
            System.out.println(mochaMilkKenyaAmerican.getDescription());
            Coffee whippedCreamMochaMilkKenyaAmerican = new WhippedCream(mochaMilkKenyaAmerican);
            System.out.println(whippedCreamMochaMilkKenyaAmerican.getDescription());

        }


}
