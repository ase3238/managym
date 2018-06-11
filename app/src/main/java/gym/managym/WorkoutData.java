package gym.managym;

import android.os.Parcel;
import android.os.Parcelable;

class WorkoutData implements Parcelable {
    private String workoutName;
    private int time;
    private int strength;
    private String date;

    public WorkoutData() { }

    public WorkoutData(Parcel in) {
        readFromParcel(in);
    }

    public WorkoutData(String workoutName, int time, int strength, String date) {
        this.workoutName = workoutName;
        this.time = time;
        this.strength = strength;
        this.date = date;
    }

    public static final Parcelable.Creator<WorkoutData> CREATOR = new Parcelable.Creator<WorkoutData>() {
        public WorkoutData createFromParcel(Parcel in) {
            return new WorkoutData(in);
        }

        public WorkoutData[] newArray (int size) {
            return new WorkoutData[size];
        }
    };

    public int describeContents() {
        return 0;
    }

    public String getWorkoutName() {
        return this.workoutName;
    }

    public int getTime() {
        return this.time;
    }

    public int getStrength() {
        return this.strength;
    }

    public String getDate() {
        return this.date;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.workoutName);
        dest.writeInt(this.time);
        dest.writeInt(this.strength);
        dest.writeString(this.date);
    }

    private void readFromParcel(Parcel in) {
        this.workoutName = in.readString();
        this.time = in.readInt();
        this.strength = in.readInt();
        this.date = in.readString();
    }
}