class product{
    int proid;
    String proname;
    double price;
    product(int proid, String proname, double price) {
        this.proid = proid;
        this.proname = proname;
        this.price = price;
    }
    void display(){
        System.out.println(proid + " " + proname + " " + price);

    }
}
public class question1 {
    public static void main(String[] args) {
        product product1=new product(1,"Vivobook",90000);
        product product2=new product(2,"Macbook",100000);
        product product3=new product(3,"Samsung",95000);
        product product4=new product(4,"Bose",20000);
        product product5=new product(5,"Nvidia",35000);

        product1.display();
        product2.display();
        product3.display();
        product4.display();
        product5.display();
    }
}