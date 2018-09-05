package pw.pbdiary.myapplication2;

import android.os.Parcel;
import android.os.Parcelable;

public class SimpleData implements Parcelable {
    int number;
    String message;
    public SimpleData(int num, String msg){
        number = num;
        message = msg;
    }

    public SimpleData(Parcel src){
        number = src.readInt();
        message = src.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }

    public static final Creator CREATOR = new Creator() {

        @Override
        public Object createFromParcel(Parcel source) {
            return new SimpleData(source);
        }

        @Override
        public Object[] newArray(int size) {
            return new Object[size];
        }
    };

}
