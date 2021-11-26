package id.ac.polbeng.student;

import java.util.ArrayList;

public class ListOfStudents {
    private static final String[][] listOfStudents = {
        {
            "Antoni Saputra",
            "6304171050",
            "https://i.pinimg.com/originals/fe/3f/86/fe3f8604db8e7be1188ac12b7c5a8fed.jpg",
            "D-IV Rekayasa Perangkat Lunak",
            "Teknik Informatika",
            "2017",
            "Air Meruap, Jorong Anam Koto, Kec. Kinali, Prov. Sumatra Barat",
            "0813-7412-6003",
            "Pasaman Barat",
            "14 Agustus 1998",
            "Laki-Laki",
            "Islam",
            "O"
        },
        {
            "Aprizal",
            "6304171056",
            "https://i.pinimg.com/originals/7d/6d/8c/7d6d8c7aab0954a6d862ab744fb80256.jpg",
            "D-IV Rekayasa Perangkat Lunak",
            "Teknik Informatika",
            "2017",
            "Jalan. Utama Meskom, RT. 001/RW. 001, Kec. Bengkalis, Kab. Bengkalis",
            "0823-8580-7406",
            "Meskom",
            "22 Februari 1998",
            "Laki-Laki",
            "Islam",
            "-"
        },
        {
            "Ayu Pratiwi",
            "6304171060",
            "https://i.pinimg.com/originals/0d/06/6f/0d066f846845d6bef9f0cf297db06530.jpg",
            "D-IV Rekayasa Perangkat Lunak",
            "Teknik Informatika",
            "2017",
            "Jalan. Bantan, RT. 001/RW. 003, Desa Senggoro, Kec. Bengkalis, Kab. Bengkalis",
            "0822-8588-3011",
            "Bengkalis",
            "31 Juli 2000",
            "Perempuan",
            "Islam",
            "A"
        },
        {
            "Eko Mardani",
            "6304171061",
            "https://i.pinimg.com/originals/20/0e/c9/200ec919f532f6a13f17c3566dd6030a.jpg",
            "D-IV Rekayasa Perangkat Lunak",
            "Teknik Informatika",
            "2017",
            "Parit 1, Blog G 11, Pintu 5",
            "0822-8828-4113",
            "Selat Panjang",
            "23 Maret 1999",
            "Laki-Laki",
            "Islam",
            "-",
        },
        {
            "Erma Kartina",
            "6304171054",
            "https://i.pinimg.com/originals/c8/50/22/c85022bce0c9afb1fd83db7e09d5fd56.jpg",
            "D-IV Rekayasa Perangkat Lunak",
            "Teknik Informatika",
            "2017",
            "Dusun Nyatuh, RT. 001/RW. 003, Desa Sekodi, Kec. Bengkalis, Kab. Bengkalis",
            "0853-6306-1403",
            "Sekodi",
            "15 Mei 1999",
            "Perempuan",
            "Islam",
            "-"
        },
        {
            "Emil Jamel Mahmuda",
            "6304171035",
            "https://i.pinimg.com/originals/ca/44/4e/ca444ed6505f7778532108490513ecbd.jpg",
            "D-IV Rekayasa Perangkat Lunak",
            "Teknik Informatika",
            "2017",
            "Jalan. Utama, Desa Pangkalan Batang RT. 001/RW. 003, Kec. Bengkalis, Kab. Bengkalis",
            "0852-6524-6509",
            "Jakarta",
            "28 Nopember 1998",
            "Laki-Laki",
            "Islam",
            "A"
        },
        {
            "Heri Rahman",
            "6304171055",
            "https://i.pinimg.com/originals/69/82/58/698258b550434d50b1b5614ed9076b80.jpg",
            "D-IV Rekayasa Perangkat Lunak",
            "Teknik Informatika",
            "2015",
            "Jalan. Lebai Wahid RT. 001/RW. 001, Desa Bantan Tua, Kec. Bantan, Kab. Bengkalis",
            "0853-7546-7921",
            "Bantan Tua",
            "10 Januari 1998",
            "Laki-Laki",
            "Islam",
            "-"
        },
        {
            "Iman Satriadi",
            "6304171045",
            "https://i.pinimg.com/originals/4a/bf/14/4abf148b3c888723a2407d34ce9bc141.jpg",
            "D-IV Rekayasa Perangkat Lunak",
            "Teknik Informatika",
            "2017",
            "Jalan. Panglima Minal RT. 001/RW. 002, Kec. Bengkalis, Kab. Bengkalis",
            "0813-7106-9135",
            "Air Putih",
            "05 Oktober 1999",
            "Laki-Laki",
            "Islam",
            "-"
        },
        {
            "Josuanda Handes Sarusuk",
            "6304171062",
            "https://i.pinimg.com/originals/d2/29/36/d229366706f99dbdeff9e84cb32d4f75.jpg",
            "D-IV Rekayasa Perangkat Lunak",
            "Teknik Informatika",
            "2017",
            "Jalan. Riau, Desa Tanjung Medang, Kec. Rupat Utara, Kab. Bengkalis",
            "0821-2252-8587",
            "Balige",
            "17 Februari 2000",
            "Laki-Laki",
            "Kristen Protestan",
            "O"
        },
        {
            "Kameludin",
            "6304171046",
            "https://i.pinimg.com/originals/2d/9a/36/2d9a36adc961206e70e206808484f400.jpg",
            "D-IV Rekayasa Perangkat Lunak",
            "Teknik Informatika",
            "2017",
            "Dusun Sungai Daud RT. 005/RW. 001, Kec. Bengkalis, Kab. Bengkalis",
            "0822-6040-2686",
            "Tameran",
            "14 September 1997",
            "Laki-Laki",
            "Islam",
            "-"
        },
        {
            "Lena Febrianingsih",
            "6304171037",
            "https://i.pinimg.com/originals/cf/1d/c4/cf1dc4085135a8de33705b1be05ea568.jpg",
            "D-IV Rekayasa Perangkat Lunak",
            "Teknik Informatika",
            "2017",
            "Jalan. H. Ja'far, Dusun Resam Lapis, Desa Selat Baru, Kec. Bengkalis, Kab. Bengkalis",
            "0822-8431-6828",
            "Selat Baru",
            "09 Februari 2000",
            "Perempuan",
            "Islam",
            "O"
        },
        {
            "M. Danang Wicaksono",
            "6304171042",
            "https://i.pinimg.com/originals/9b/e4/d7/9be4d793f51fbf643fb08fcfcc816cc2.jpg",
            "D-IV Rekayasa Perangkat Lunak",
            "Teknik Informatika",
            "2017",
            "Jalan. HR. Soebrantas, Desa Wonosari Timur, Kec. Bengkalis, Kab. Bengkalis",
            "0823-3592-6699",
            "Bengkalis",
            "06 April 1999",
            "Laki-Laki",
            "Islam",
            "-"
        },
        {
            "May Novia",
            "6304171059",
            "https://i.pinimg.com/originals/62/70/2e/62702e0a4ecc7f2742f204d9d997cbde.jpg",
            "D-IV Rekayasa Perangkat Lunak",
            "Teknik Informatika",
            "2016",
            "Tengayon",
            "0823-8579-3864",
            "Dumai",
            "12 Mei 1998",
            "Perempuan",
            "Islam",
            "-"
        },
        {
            "Maya Jumasari",
            "6304171048",
            "https://i.pinimg.com/originals/e2/90/3b/e2903b4cfa4b1f8b7483525ae9a64fa9.jpg",
            "D-IV Rekayasa Perangkat Lunak",
            "Teknik Informatika",
            "2017",
            "Jalan. Awang Mahmuda, Desa Sungai Alam, Kec. Bengkalis, Kab. Bengkalis",
            "0822-1193-0672",
            "Sungai Alam",
            "28 Januari 2000",
            "Perempuan",
            "Islam",
            "-"
        },
    };

    static ArrayList<Student> getListData() {
        ArrayList<Student> studentsList = new ArrayList<>();
        for (String[] position: listOfStudents) {
            Student student = new Student();
            student.setName(position[0]);
            student.setNim(position[1]);
            student.setPhoto(position[2]);
            student.setStudyProgram(position[3]);
            student.setMajors(position[4]);
            student.setAcademicEntryYear(position[5]);
            student.setAddress(position[6]);
            student.setPhoneNumber(position[7]);
            student.setPlaceOfBirth(position[8]);
            student.setDateOfBirth(position[9]);
            student.setGender(position[10]);
            student.setReligion(position[11]);
            student.setBloodGroup(position[12]);
            studentsList.add(student);
        }
        return studentsList;
    }
}
