package BusResv;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    Bus(int no, boolean ac, int cap){
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }

    public int getBusNo() {//accessor
        return busNo;
    }

    public boolean isAc() {
        return ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int cap) {//mutator
        capacity = cap;
    }

    public void setAc(boolean val) {//mutator
        ac = val;
    }

    public void displayBusInfo(){
        System.out.println(" Bus No:" + busNo + " Ac:" + ac + " Total Capacity:" + capacity);
    }
}
