package id.ac.polbeng.student;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {
    private String name;
    private String nim;
    private String photo;
    private String studyProgram;
    private String majors;
    private String academicEntryYear;
    private String address;
    private String phoneNumber;
    private String placeOfBirth;
    private String dateOfBirth;
    private String gender;
    private String religion;
    private String bloodGroup;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getAcademicEntryYear() {
        return academicEntryYear;
    }

    public void setAcademicEntryYear(String academicEntryYear) {
        this.academicEntryYear = academicEntryYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.nim);
        dest.writeString(this.photo);
        dest.writeString(this.studyProgram);
        dest.writeString(this.majors);
        dest.writeString(this.academicEntryYear);
        dest.writeString(this.address);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.placeOfBirth);
        dest.writeString(this.dateOfBirth);
        dest.writeString(this.gender);
        dest.writeString(this.religion);
        dest.writeString(this.bloodGroup);
    }

    public void readFromParcel(Parcel source) {
        this.name = source.readString();
        this.nim = source.readString();
        this.photo = source.readString();
        this.studyProgram = source.readString();
        this.majors = source.readString();
        this.academicEntryYear = source.readString();
        this.address = source.readString();
        this.phoneNumber = source.readString();
        this.placeOfBirth = source.readString();
        this.dateOfBirth = source.readString();
        this.gender = source.readString();
        this.religion = source.readString();
        this.bloodGroup = source.readString();
    }

    public Student() {
    }

    protected Student(Parcel in) {
        this.name = in.readString();
        this.nim = in.readString();
        this.photo = in.readString();
        this.studyProgram = in.readString();
        this.majors = in.readString();
        this.academicEntryYear = in.readString();
        this.address = in.readString();
        this.phoneNumber = in.readString();
        this.placeOfBirth = in.readString();
        this.dateOfBirth = in.readString();
        this.gender = in.readString();
        this.religion = in.readString();
        this.bloodGroup = in.readString();
    }

    public static final Parcelable.Creator<Student> CREATOR = new Parcelable.Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel source) {
            return new Student(source);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };
}
