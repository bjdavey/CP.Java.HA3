package Models;

public class Car {

	private int _id;
	private double _chargingTime;
	private long _waitingTime;

	private boolean _charging;

	public Car(int id, double chargingTime, long waitingTime) {
		this._id = id;
		this._chargingTime = chargingTime;
		this._waitingTime = waitingTime;
		this.set_charging(false);
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public double getChargingTime() {
		return _chargingTime;
	}

	public void setChargingTime(double chargingTime) {
		this._chargingTime = chargingTime;
	}

	public long get_waitingTime() {
		return _waitingTime;
	}

	public void set_waitingTime(long _waitingTime) {
		this._waitingTime = _waitingTime;
	}

	public boolean is_charging() {
		return _charging;
	}

	public void set_charging(boolean _charging) {
		this._charging = _charging;
	}
}
