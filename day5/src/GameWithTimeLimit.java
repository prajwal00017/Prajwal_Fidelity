class GameWithTimeLimit extends GameInheritance{
    private int timeLimit;

    public GameWithTimeLimit(String name, int maxNumPlayers, int timeLimit) {
        super(name, maxNumPlayers);
        this.timeLimit = timeLimit;
    }

    public int getTimeLimit(){
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit){
        this.timeLimit = timeLimit;
    }
    @Override
    public String toString(){
        return super.toString() + "\nTime Limit for " + getName() + " is " + timeLimit + " minutes";
    }
}