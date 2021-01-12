package kamboj.ankit.domain;

public class MountainBike extends Bicycle {

  private int seatHeight;

  public MountainBike(int startCadence, int startSpeed, int startGear, int startHeight) {
    super(startCadence, startSpeed, startGear);
    seatHeight = startHeight;
  }

  public int getSeatHeight() {
    return seatHeight;
  }

  public void setSeatHeight(int seatHeight) {
    this.seatHeight = seatHeight;
  }
}
