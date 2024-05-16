package test;

public class Hotel {
    private Room[] rooms;

    public Hotel() {
        rooms = new Room[11];
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room(i);
        }
    }

    public void add(int roomNumber, String guestName) {
        if (roomNumber >= 0 && roomNumber < rooms.length) {
            if (rooms[roomNumber].isReserved()) {
                System.out.println(roomNumber + "번 방은 이미 예약되어 있습니다.");
            } else {
                rooms[roomNumber].reserve(guestName);
            }
        } else {
            System.out.println("잘못된 객실 번호입니다.");
        }
    }

    public void show() {
        for (Room room : rooms) {
            if (room.isReserved()) {
                System.out.println(room.getRoomNumber() + "번 방을 " +room.getGuestName()+ "가 예약했습니다");

            }
        }
    }

    private class Room {
        private int roomNumber;
        private String guestName;
        private boolean reserved = false;

        public Room(int roomNumber) {
            this.roomNumber = roomNumber;
        }

        public void reserve(String name) {
            this.guestName = name;
            this.reserved = true;
        }

        public boolean isReserved() {
            return reserved;
        }

        public int getRoomNumber() {
            return roomNumber;
        }

        public String getGuestName() {
            return guestName;
        }
    }
}
