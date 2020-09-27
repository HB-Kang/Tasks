package ConcertReservation2;

public class ConReserve_Seat {
	private String seat[];
	private String name;
	ConReserve_Seat(int size){
		seat = new String[size];
		for(int i=0; i<seat.length; i++) {
			seat[i] = "---";
		}
	} 
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void SeatReservation(int num) {
		seat[num] = name;
	}
	public void SeatCancel(String name) { //취소
		for(int i=0; i<seat.length; i++) {
			if(name.equals(seat[i])) {
				seat[i] = "---";
				break;
			}else if(!name.equals(seat[i]) && i==seat.length-1) {
				System.out.println("예약되어 있지 않습니다.");
			}
		}
	}
	public void VIEW(String seat) {
		System.out.print(seat+">> ");
		for(int i=0; i<this.seat.length; i++) {
			System.out.print(this.seat[i]+" ");
		}
		System.out.println();
	}
}
