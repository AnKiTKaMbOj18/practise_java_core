package kamboj.ankit.domain;

public class Bicycle {

  private int cadence;
  private int speed;
  private int gear;

  public Bicycle(int startCadence, int startSpeed, int startGear) {
    this.cadence = startCadence;
    this.speed = startSpeed;
    this.gear = startGear;
  }

  public int getCadence() {
    return cadence;
  }

  public void setCadence(int newValue) {
    this.cadence = newValue;
  }

  public int getGear() {
    return gear;
  }

  public void setGear(int newValue) {
    this.gear = newValue;
  }

  public int getSpeed() {
    return speed;
  }

  public void applyBrake(int decrement) {
    this.speed -= decrement;
  }

  public void speedUp(int increment) {
    this.speed += increment;
  }
}
