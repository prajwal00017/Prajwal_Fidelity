class mammal extends animal {
    String species;
    public mammal(String name,String species) {
        super(name);
        this.species = species;
    }

    public void walk(){
        System.out.println(name + " " +species+ " "+ "can walk");
    }
}
