public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
    public void moveUp(){
        currentFloor = currentFloor + 1;
    }
    public void moveDown(){
        currentFloor = currentFloor - 1;
    }
    public void move (int floor){
        if (floor > maxFloor || floor < minFloor || floor == 0){
            System.out.println("Введен не верный этаж");
            return;
        }
        if (floor == currentFloor){
            System.out.println("Вы прибыли на этаж");
        }
        while (currentFloor < floor){
            moveUp();
            if(currentFloor == 0){
            moveUp();
            }
            System.out.println("Вы на этаже: " + currentFloor);
        }
        while (currentFloor > floor){
            moveDown();
            if (currentFloor == 0){
            moveDown();
            }
            System.out.println("Вы на этаже: " + currentFloor);
        }

    }


}
