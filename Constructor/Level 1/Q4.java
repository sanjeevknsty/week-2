class HotelBooking{
    String guestName;
    String roomType;
    int nights;
    public HotelBooking(){
        this.guestName = "Sanjeev";
        this.nights = 3;
        this.roomType = "Balcony";
    }

    public HotelBooking(String guestName ,String roomType,int nights){
        this.guestName = guestName;
        this.nights = nights;
        this.roomType = roomType;
    }

    public HotelBooking(HotelBooking copied){
        this.guestName = copied.guestName;
        this.roomType = copied.roomType;
        this.nights = copied.nights;
    }

    public void display(){
        System.out.println("Name " + guestName);
        System.out.println("RoomType " + roomType);
        System.out.println("Nights " + nights);
    }


}

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Default");
        HotelBooking obj1 = new HotelBooking();
        obj1.display();
        System.out.println("Parametrised");
        HotelBooking obj2 = new HotelBooking("RobinHood","3 bed",4);
        obj2.display();
        System.out.println("Copied");
        HotelBooking obj3 = new HotelBooking(obj2);
        obj3.display();
    }
}
