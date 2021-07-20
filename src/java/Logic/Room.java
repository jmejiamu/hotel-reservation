package Logic;

public class Room {

    private int roomNum;
    private int floorRoom;
    private String roomName;
    private String roomType;
    private double costPerNight;

    public Room() {
    }

    public Room(int roomNum, int floorRoom, String roomName, String roomType, double costPerNight) {
        this.roomNum = roomNum;
        this.floorRoom = floorRoom;
        this.roomName = roomName;
        this.roomType = roomType;
        this.costPerNight = costPerNight;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public int getFloorRoom() {
        return floorRoom;
    }

    public void setFloorRoom(int floorRoom) {
        this.floorRoom = floorRoom;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getCostPerNight() {
        return costPerNight;
    }

    public void setCostPerNight(double costPerNight) {
        this.costPerNight = costPerNight;
    }
    
    
}
