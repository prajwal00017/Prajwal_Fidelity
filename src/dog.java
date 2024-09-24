class Dog extends mammal {
    String breed;
    public Dog(String name, String species, String breed) {
        super(name, species);
        this.breed = breed;
    }
    public void bark(){
        System.out.println(name+ " " +breed+ " "+"can bark");
    }
}
